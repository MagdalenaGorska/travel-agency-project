package pl.sda.model.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

@Entity
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne //wiele wycieczek do 1 lokacji
    private Location departureLocation;
    @ManyToOne
    private Location arrivalLocation;
    @ManyToOne
    private Location destination;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDate dateOfDeparture;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDate dateOfArrival;
    private Integer tourLength;
    private String boardType;
    private BigDecimal priceForAdult;
    private BigDecimal priceForChild;
    private Integer howManyAdults;
    private Integer howManyChildren;

    public Tour(){}

    public Tour(Location departureLocation, Location arrivalLocation, Location destination, LocalDate dateOfDeparture, LocalDate dateOfArrival, Integer tourLength, String boardType, BigDecimal priceForAdult, BigDecimal priceForChild, Integer howManyAdults, Integer howManyChildren) {
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.destination = destination;
        this.dateOfDeparture = dateOfDeparture;
        this.dateOfArrival = dateOfArrival;
        this.tourLength = Period.between(dateOfDeparture, dateOfArrival).getDays();
        this.boardType = boardType;
        this.priceForAdult = priceForAdult;
        this.priceForChild = priceForChild;
        this.howManyAdults = howManyAdults;
        this.howManyChildren = howManyChildren;
    }

    public Integer getId() {
        return id;
    }


    public Location getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(Location departureLocation) {
        this.departureLocation = departureLocation;
    }

    public Location getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(Location arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public LocalDate getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(LocalDate dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public LocalDate getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(LocalDate dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public Integer getTourLength() {
        return Period.between(dateOfDeparture, dateOfArrival).getDays();
    }

    public void setTourLength(Integer tourLength) {
        this.tourLength = tourLength;
    }

    public String getBoardType() {
        return boardType;
    }

    public void setBoardType(String boardType) {
        this.boardType = boardType;
    }

    public BigDecimal getPriceForAdult() {
        return priceForAdult;
    }

    public void setPriceForAdult(BigDecimal priceForAdult) {
        this.priceForAdult = priceForAdult;
    }

    public BigDecimal getPriceForChild() {
        return priceForChild;
    }

    public void setPriceForChild(BigDecimal priceForChild) {
        this.priceForChild = priceForChild;
    }

    public Integer getHowManyAdults() {
        return howManyAdults;
    }

    public void setHowManyAdults(Integer howManyAdults) {
        this.howManyAdults = howManyAdults;
    }

    public Integer getHowManyChildren() {
        return howManyChildren;
    }

    public void setHowManyChildren(Integer howManyChildren) {
        this.howManyChildren = howManyChildren;
    }
}
