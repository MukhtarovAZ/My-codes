package az.developia.webmvcdemo1.model;

public class Car {
    private Integer id;
    private String brand;
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
}
