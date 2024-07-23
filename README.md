# java course spring base app

FoodiExpress (d’ora in avanti FE) è un'applicazione web che permette di effettuare ordini presso i ristoranti, sia da asporto che con consegna a domicilio.
FE si presenta quindi come una valida alternativa ai più popolari servizi di food delivery e funge da punto di incontro tra clienti, ristoratori e fattorini.

<picture>
  <source
    srcset="https://github.com/kiraDegu/FoodDeliveryApp/blob/dev/README-imgs/1.png"
    media="(prefers-color-scheme: dark)"
  />
  <source
    srcset="https://github.com/kiraDegu/FoodDeliveryApp/blob/dev/README-imgs/1.png"
    media="(prefers-color-scheme: light), (prefers-color-scheme: no-preference)"
  />
  <img src="https://github-readme-stats.vercel.app/api?username=anuraghazra&show_icons=true" />
</picture>

Il team è formato da Chiara De Guglielmo (team leader), Matteo Solinas, Davide Di Leo e Ivan
Frangipani.

<picture>
  <source
    srcset="https://github.com/kiraDegu/FoodDeliveryApp/blob/dev/README-imgs/2.png"
    media="(prefers-color-scheme: dark)"
  />
  <source
    srcset="https://github.com/kiraDegu/FoodDeliveryApp/blob/dev/README-imgs/2.png"
    media="(prefers-color-scheme: light), (prefers-color-scheme: no-preference)"
  />
  <img src="https://github-readme-stats.vercel.app/api?username=anuraghazra&show_icons=true" />
</picture>



<picture>
  <source
    srcset="https://github.com/kiraDegu/FoodDeliveryApp/blob/dev/README-imgs/3.png"
    media="(prefers-color-scheme: dark)"
  />
  <source
    srcset="https://github.com/kiraDegu/FoodDeliveryApp/blob/dev/README-imgs/3.png"
    media="(prefers-color-scheme: light), (prefers-color-scheme: no-preference)"
  />
  <img src="https://github-readme-stats.vercel.app/api?username=anuraghazra&show_icons=true" />
</picture>

Il nostro lavoro si è concentrato sullo sviluppo del back-end dell’applicazione. Per farlo,
abbiamo utilizzato il linguaggio Java e l’IDE IntelliJ.
Ci siamo basati sul framework Spring Boot, seguendo il paradigma
Model-View-Controller.
Per la gestione delle dipendenze abbiamo utilizzato Maven, mentre per l’archiviazione
dei dati abbiamo scelto MySQL.
Come vi mostreremo a breve, usufruiamo dei servizi REST di Geoapify che ci
permettono di tradurre gli indirizzi forniti dagli utenti in coordinate geografiche (latitudine
e longitudine).
Questi valori ci sono utili a stabilire le zone in cui operano i fattorini e i filtri di ricerca dei
clienti. Infatti, abbiamo sviluppato una funzione che utilizza la formula dell’emisenoverso
per calcolare la distanza fra due punti sulla superficie di una sfera. Naturalmente, il
nostro pianeta NON è una sfera perfetta perciò il risultato è un’approssimazione.
Infine, una seconda funzione ci permette di stimare i tempi di consegna assumendo la
velocità media dei fattorini.



Ai clienti offriamo una panoramica dei ristoranti disponibili, la possibilità di applicare vari
filtri di ricerca, ad esempio in base alla distanza, e la comodità di poter ordinare
praticamente da qualunque luogo.



<picture>
  <source
    srcset="https://github.com/kiraDegu/FoodDeliveryApp/blob/dev/README-imgs/7.png"
    media="(prefers-color-scheme: dark)"
  />
  <source
    srcset="https://github.com/kiraDegu/FoodDeliveryApp/blob/dev/README-imgs/7.png"
    media="(prefers-color-scheme: light), (prefers-color-scheme: no-preference)"
  />
  <img src="https://github-readme-stats.vercel.app/api?username=anuraghazra&show_icons=true" />
</picture>

Il nostro metodo di lavoro è fondato sui principi Agile applicati attraverso il framework
SCRUM. Abbiamo effettuato incontri con cadenza settimanale.
Per collaborare nello sviluppo abbiamo utilizzato il più popolare sistema di
versionamento, Git, mentre per l’assegnazione dei compiti e la gestione del lavoro
abbiamo impostato una bacheca kanban con GitHub Issues.
Vi ringrazio per l’attenzione,
Chiedo gentilmente a Ivan di condividere lo schermo per mostrare il flusso di un ordine


<picture>
  <source
    srcset="https://github.com/kiraDegu/FoodDeliveryApp/blob/dev/README-imgs/8.png"
    media="(prefers-color-scheme: dark)"
  />
  <source
    srcset="https://github.com/kiraDegu/FoodDeliveryApp/blob/dev/README-imgs/8.png"
    media="(prefers-color-scheme: light), (prefers-color-scheme: no-preference)"
  />
  <img src="https://github-readme-stats.vercel.app/api?username=anuraghazra&show_icons=true" />
</picture>
Passando ai vantaggi per i ristoratori, fra i più importanti c’è la possibilità di vendere i
propri prodotti attraverso questa sorta di “vetrina virtuale” in cui si può dimostrare la
soddisfazione dei propri clienti ricevendo delle recensioni.
In secondo luogo, forniamo anche accesso a dati e statistiche generate dall’attività
legata al ristorante, per monitorare e pianificare al meglio le strategie imprenditoriali.
Ultimo, ma non meno importante, i ristoranti iscritti all’app non avranno bisogno della
propria flotta di fattorini, perché saranno i nostri rider ad occuparsi delle consegne.




<picture>
  <source
    srcset="https://github.com/kiraDegu/FoodDeliveryApp/blob/dev/README-imgs/4.png"
    media="(prefers-color-scheme: dark)"
  />
  <source
    srcset="https://github.com/kiraDegu/FoodDeliveryApp/blob/dev/README-imgs/4.png"
    media="(prefers-color-scheme: light), (prefers-color-scheme: no-preference)"
  />
  <img src="https://github-readme-stats.vercel.app/api?username=anuraghazra&show_icons=true" />
</picture>
Passiamo quindi ai rider: in due parole, ciò che offriamo sono libertà e flessibilità.
Libertà di scegliere i propri turni di lavoro e la zona entro cui operare senza doversi
vincolare ad un singolo ristorante e ai suoi orari.
Forniamo un breve periodo di formazione per selezionare i rider che verranno assunti
nella nostra flotta.

<picture>
  <source
    srcset="https://github.com/kiraDegu/FoodDeliveryApp/blob/dev/README-imgs/5.png"
    media="(prefers-color-scheme: dark)"
  />
  <source
    srcset="https://github.com/kiraDegu/FoodDeliveryApp/blob/dev/README-imgs/5.png"
    media="(prefers-color-scheme: light), (prefers-color-scheme: no-preference)"
  />
  <img src="https://github-readme-stats.vercel.app/api?username=anuraghazra&show_icons=true" />
</picture>

<picture>
  <source
    srcset="https://github.com/kiraDegu/FoodDeliveryApp/blob/dev/README-imgs/6.png"
    media="(prefers-color-scheme: dark)"
  />
  <source
    srcset="https://github.com/kiraDegu/FoodDeliveryApp/blob/dev/README-imgs/6.png"
    media="(prefers-color-scheme: light), (prefers-color-scheme: no-preference)"
  />
  <img src="https://github-readme-stats.vercel.app/api?username=anuraghazra&show_icons=true" />
</picture>

