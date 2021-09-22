package pl.sda.model.entity;

import org.apache.catalina.startup.HostRuleSet;
import pl.sda.model.DeparturePlace;

import javax.persistence.*;
import java.util.List;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    //@OneToMany (mappedBy = "city")
    //List<Airport> airportList;
    @OneToMany (mappedBy = "city")
    List<Hotel> hotelList;
    @OneToOne
    private DeparturePlace departurePlace; // nie get i set

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<Airport> getAirportList() {
//        return airportList;
//    }
//
//    public void setAirportList(List<Airport> airportList) {
//        this.airportList = airportList;
//    }
}
