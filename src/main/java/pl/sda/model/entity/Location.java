package pl.sda.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String country;
    private String city;
    private String address;
    @OneToMany
    List<Tour> tourList;


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
