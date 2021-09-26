package pl.sda.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    @Size(min = 3, max = 50, message = "Państwo musi posiadać od {min} do {max} znaków")
    private String country;
    @NotBlank
    @Size(min = 3, max = 50, message = "Miasto musi posiadać od {min} do {max} znaków")
    private String city;
    @NotBlank
    @Size(min = 3, max = 50, message = "Adress musi posiadać od {min} do {max} znaków")
    private String address;


    public Location() {
    }

    public Integer getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullLocation(){
        return "country: " + country +
                ", city: " + city +
                ", address: " + address;
    }
    @Override
    public String toString() {
        return "country: " + country + "/n" +
                ", city: " + city + "/n" +
                ", address: " + address;
    }
}
