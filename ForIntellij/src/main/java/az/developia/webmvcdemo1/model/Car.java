package az.developia.webmvcdemo1.model;

import az.developia.webmvcdemo1.validation.EdedOlmalidir;
import az.developia.webmvcdemo1.validation.Java3;
import lombok.*;

import javax.validation.constraints.*;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car {
    private Integer id;
    @Size(min = 2, message = "Marka minimum 2 simvol olmalıdır")
    @Size(max = 20, message = "Marka Maximum 2 simvol olmalıdır")
    @Java3
    private String brand;

    @EdedOlmalidir
    private Integer speed;
    @Past
    private Date madeDate;
    @Pattern(regexp = "[a-z0-9A-z]+}@[a-z]+\\.[a-z]{2,4}", message = "Emaili duz formatda yaz")
    private String email;







}