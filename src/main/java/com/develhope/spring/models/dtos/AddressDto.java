package com.develhope.spring.models.dtos;

import jakarta.persistence.Column;

public class AddressDto {
    private Long id_address;
    private String city;
    private String street;
    private String number;
    private String note;
    private String lat;
    private String lon;

    public AddressDto() {
    }

    public AddressDto(Long id_address, String city, String street, String number, String note, String lat, String lon) {
        this.id_address = id_address;
        this.city = city;
        this.street = street;
        this.number = number;
        this.note = note;
        this.lat = lat;
        this.lon = lon;
    }

    public Long getId_address() {
        return id_address;
    }

    public void setId_address(Long id_address) {
        this.id_address = id_address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }
}
