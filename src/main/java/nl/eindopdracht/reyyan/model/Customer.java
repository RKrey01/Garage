package nl.eindopdracht.reyyan.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "customer")
public class Customer {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CustomerId")
    private int id;

    @Column(name = "firstName")
    @NotBlank(message = "Veld is leeg!")
    private String firstName;

    @Column(name = "lastName")
    @NotBlank(message = "Veld is leeg!")
    private String lastName;

    @Column(name = "address")
    @NotBlank(message = "Veld is leeg!")
    private String address;

    @Column(name = "zipcode")
    @NotBlank(message = "Veld is leeg!")
    private String zipcode;

    @Column(name = "phoneNumber")
    @NotBlank(message = "Veld is leeg!")
    private Integer phoneNumber;

    @Column(name = "email", unique = true) // niet de zelfde email registreren.
    @NotBlank(message = "Veld is leeg!")
    @Email
    private String email;


    public Customer(Integer id, String firstName, String lastName, String address, String zipcode, Integer phoneNumber, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zipcode = zipcode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
