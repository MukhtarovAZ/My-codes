package az.developia.webmvcdemo1.model;

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
    private String brand;
    @Min(value = 100)
    @NotNull
    @Max(value = 1000)
    private Integer speed;
    @Past
    private Date madeDate;
    @Pattern(regexp = "[a-z0-9A-z]+}@[a-z]+\\.[a-z]{2,4}", message = "Emaili duz formatda yaz")
    private String email;







}