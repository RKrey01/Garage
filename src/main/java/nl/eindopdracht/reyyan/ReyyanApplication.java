package nl.eindopdracht.reyyan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReyyanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReyyanApplication.class, args);
	}

}


// bon genereren in de service layer?
// klanten overzicht (lijst met op te bellen klanten) is ook een service van je applicatie?
//afspraken inplannen
//je use case kan je terug vinden in je service layer! deze worden services
// Repository is de toegang tot je database!
//model is waar al je entiteiten in zitten dus je klasse
// reparatie en onderdeel zijn ook klassen
//persoon of medewerker wil je dit in je klasse? og niet?
//tekortkomingen in een document van de monteur naar de backoffice?
//heb je de CRUD nodig zo kan je meten of het een entiteit is.
//jpa in in repository is er om alles automatisch in je database te zetten.
//