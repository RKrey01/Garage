package nl.eindopdracht.reyyan.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CarID")
    private Integer id;

    @Column(name = "LicensePlate", unique = true)
    @NotBlank (message = "Kenteken niet ingevoerd!")
    private String licensePlate;

    @Column(name = "Brand")
    @NotBlank(message = "Merk niet ingevoerd!")
    private String brand;

    @Column(name = "Type")
    @NotBlank(message = "Type niet ingevoerd!")
    private String type;

    @Column(name = "ConstructionYear")
    @NotBlank(message = "Bouwjaar niet ingevoerd!")
    private int constructionYear;


    public Car (String licensePlate, String brand, String type, int constructionYear) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.type = type;
        this.constructionYear = constructionYear;

    }


}
