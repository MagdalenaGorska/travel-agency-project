package pl.sda.model;

import pl.sda.model.entity.Airport;
import pl.sda.model.entity.City;

import javax.persistence.*;

@Entity
public class DeparturePlace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private  Airport airportDeparture;
    @OneToOne
    private  City cityDeparture;

    public Integer getId() {
        return id;
    }

    public Airport getAirportDeparture() {
        return airportDeparture;
    }

    public void setAirportDeparture(Airport airportDeparture) {
        this.airportDeparture = airportDeparture;
    }

    public City getCityDeparture() {
        return cityDeparture;
    }

    public void setCityDeparture(City cityDeparture) {
        this.cityDeparture = cityDeparture;
    }
}
