package pl.sda.model;

import pl.sda.model.entity.Airport;
import pl.sda.model.entity.City;
import pl.sda.model.entity.Hotel;

import javax.persistence.Embeddable;

@Embeddable
public class Destination{
    private Airport airportDestination;
    private City cityDestination;
    private Hotel hotelDestination;

}
