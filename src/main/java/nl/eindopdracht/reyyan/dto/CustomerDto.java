package nl.eindopdracht.reyyan.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class CustomerDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String address;
    private String zipcode;
    private Integer phoneNumber;
    private String email;
}
