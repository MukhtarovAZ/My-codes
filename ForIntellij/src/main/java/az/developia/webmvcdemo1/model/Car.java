package az.developia.webmvcdemo1.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car {
    private Integer id;
    @Size(min=2,message = "Marka minimum 2 simvol olmalıdır")
    @Size(max = 20,message ="Marka Maximum 2 simvol olmalıdır" )
    private String brand;
    @Min(value = 100)
    @NotNull
    @Max(value = 1000)
    private Integer speed;

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
}
