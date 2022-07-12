package az.developia.springwebmvc2.model;

public class Student {
private Integer id;
private String name;
private String surname;
private String phone;
private String adress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Student(Integer id, String name, String surname, String phone, String adress) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.adress = adress;
    }
}
