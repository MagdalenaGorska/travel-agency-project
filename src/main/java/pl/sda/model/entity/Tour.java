package pl.sda.model.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private DeparturePlace departurePlace;
    //@Embedded
    //private Destination destination;
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


    public Tour(DeparturePlace departurePlace, Destination destination, LocalDate dateOfDeparture, LocalDate dateOfArrival, Integer tourLength, String boardType, BigDecimal priceForAdult, BigDecimal priceForChild, Integer howManyAdults, Integer howManyChildren) {
        this.departurePlace = departurePlace;
        //this.destination = destination;
        this.dateOfDeparture = dateOfDeparture;
        this.dateOfArrival = dateOfArrival;
        this.tourLength = tourLength;
        this.boardType = boardType;
        this.priceForAdult = priceForAdult;
        this.priceForChild = priceForChild;
        this.howManyAdults = howManyAdults;
        this.howManyChildren = howManyChildren;
    }

    public Integer getId() {
        return id;
    }

    public DeparturePlace getDeparturePlace() {
        return departurePlace;
    }

    public void setDeparturePlace(DeparturePlace departurePlace) {
        this.departurePlace = departurePlace;
    }

//    public Destination getDestination() {
//        return destination;
//    }
//
//    public void setDestination(Destination destination) {
//        this.destination = destination;
//    }

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
        return tourLength;
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
