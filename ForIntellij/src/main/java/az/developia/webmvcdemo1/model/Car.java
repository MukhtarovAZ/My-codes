package az.developia.webmvcdemo1.model;

import javax.validation.constraints.*;
import java.util.Date;

public class Car {
    private Integer id;
    @Size(min=2,message = "Marka minimum 2 simvol olmalıdır")
    @Size(max = 20,message ="Marka Maximum 2 simvol olmalıdır" )
    private String brand;
    @Min(value = 100)
    @NotNull
    @Max(value = 1000)
    private Integer speed;
    @Past
    private Date madeDate;

    @Pattern(regexp = "[a-z0-9A-z]+}@[a-z]+\\.[a-z]{2,4}",message = "Emaili duz formatda yaz")
    private String email;
    //  +994-55-555-5555

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Car(Integer id, String brand, Integer speed) {
        this.id = id;
        this.brand = brand;
        this.speed = speed;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }
    public Date getMadeDate(){
        return madeDate;
    }

    public void setMadeDate(Date madeDate) {
        this.madeDate = madeDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
