package nl.eindopdracht.reyyan.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class CarDto {
    private Integer id;
    private String brand;
    private String type;
    private String licensePlate;
    private int constructionYear;

}
