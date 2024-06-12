package com.develhope.spring.services;

import com.develhope.spring.exceptions.InvalidProductException;
import com.develhope.spring.models.ResponseCode;
import com.develhope.spring.models.ResponseModel;
import com.develhope.spring.models.dtos.ProductDto;
import com.develhope.spring.models.entities.ProductEntity;
import com.develhope.spring.mappers.ProductMapper;
import com.develhope.spring.daos.ProductDao;
import com.develhope.spring.validators.ProductValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductDao productDao;
    private final ProductMapper productMapper;
    private final ProductValidator productValidator;

    @Autowired
    public ProductService(ProductDao productDao, ProductMapper productMapper, ProductValidator productValidator) {
        this.productDao = productDao;
        this.productMapper = productMapper;
        this.productValidator = productValidator;
    }

    /**
     * @param productDto ProductDto
     * @return a new product
     */
    public ResponseModel createProduct(ProductDto productDto) {

        try {
            productValidator.validateProduct(productDto);
            ProductEntity newProduct = this.productMapper.toEntity(productDto);
            this.productDao.saveAndFlush(newProduct);
            return new ResponseModel(ResponseCode.B,  productMapper.toDto(newProduct));
        } catch (InvalidProductException e) {
            return new ResponseModel(ResponseCode.A).addMessageDetails(e.getMessage());
        }

    }

    /**
     * @return all products
     */
    public ResponseModel getAllProducts() {
        List<ProductDto> products = this.productDao.findAll().stream().map(productMapper::toDto).toList();
        if (products.isEmpty()) {
            return new ResponseModel(ResponseCode.D).addMessageDetails("No products were found, the list may be empty");
        } else {
            return new ResponseModel(ResponseCode.E,  products);
        }
    }

    /**
     * @param id product id
     * @return a single Product
     */
    public ResponseModel getSingleProductById(String id) {
        Optional<ProductEntity> productFound = this.productDao.findById(id);
        if (productFound.isEmpty()) {
            return new ResponseModel(ResponseCode.D).addMessageDetails( "Product not found with the selected ID");
        } else {
            return new ResponseModel(ResponseCode.C,  productMapper.toDto(productFound.get()));
        }
    }

    /**
     * @param name product name
     * @return all products with selected name
     */
    public ResponseModel getProductByName(String name) {
        List<ProductDto> productsFound = this.productDao.findProductByName(name).stream().map(productMapper::toDto).toList();
        if (productsFound.isEmpty()) {
            return new ResponseModel(ResponseCode.D).addMessageDetails("No products were found with the selected parameter");
        } else {
            return new ResponseModel(ResponseCode.E,  productsFound);
        }
    }

    /**
     * @param upperBoundPrice upper price range
     * @param lowerBoundPrice lower price range
     * @return all products in the selected price range
     */
    public ResponseModel getProductsByPriceRange(BigDecimal upperBoundPrice, BigDecimal lowerBoundPrice) {
        List<ProductDto> productsFound = this.productDao.findProductByPriceBetween(upperBoundPrice, lowerBoundPrice)
                .stream().map(productMapper::toDto).toList();
        if (productsFound.isEmpty()) {
            return new ResponseModel(ResponseCode.D).addMessageDetails("No products were found with the selected parameters");
        } else {
            return new ResponseModel(ResponseCode.E,  productsFound);
        }
    }

    /**
     * @param id             product id
     * @param productUpdates ProductDto
     * @return a product updated
     */
    public ResponseModel updateProduct(String id, ProductDto productUpdates) {
        Optional<ProductEntity> productToUpdate = this.productDao.findById(id);
        if (productToUpdate.isEmpty()) {
            return new ResponseModel(ResponseCode.D).addMessageDetails("Product not found with the selected ID");
        } else if (productUpdates != null) {
            ProductEntity productEntityUpdates = productMapper.toEntity(productUpdates);
            if (productUpdates.getName() != null) {
                productToUpdate.get().setName(productEntityUpdates.getName());
            }
            if (productUpdates.getPrice() != null) {
                productToUpdate.get().setPrice(productEntityUpdates.getPrice());
            }
            if (productUpdates.getIngredients() != null) {
                productToUpdate.get().setIngredients(productEntityUpdates.getIngredients());
            }
            if (productUpdates.getProductTypes() != null) {
                productToUpdate.get().setProductTypes(productEntityUpdates.getProductTypes());
            }
            return new ResponseModel(ResponseCode.G, this.productMapper.toDto(this.productDao.saveAndFlush(productToUpdate.get())));
        }
        return new ResponseModel(ResponseCode.A).addMessageDetails( "Impossible to update, the body should not be null");
    }

    /**
     * @param id product id
     * @return delete a single product
     */
    public ResponseModel deleteProductById(String id) {
        if (!productDao.existsById(id)) {
            return new ResponseModel(ResponseCode.D).addMessageDetails("Product not found with the selected ID");
        } else {
            this.productDao.deleteById(id);
            return new ResponseModel(ResponseCode.H).addMessageDetails("Product successfully deleted");
        }
    }

    /**
     * @return delete all products
     */
    public ResponseModel deleteAllProducts() {
        this.productDao.deleteAll();
        return new ResponseModel(ResponseCode.H).addMessageDetails("All products have been deleted");
    }

}
