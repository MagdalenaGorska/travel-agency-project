package pl.sda.entity;

import pl.sda.model.BoardType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate dateOfDeparture;
    private LocalDate dateOfArrival;
    private Integer tourLength;
    private BoardType boardType;
    private BigDecimal priceForAdult;
    private BigDecimal priceForChild;
    private Integer howManyAdults;
    private Integer howManyChildren;

    public Tour(){}

    public Tour(LocalDate dateOfDeparture, LocalDate dateOfArrival, Integer tourLength
            , BoardType boardType, BigDecimal priceForAdult, BigDecimal priceForChild
            , Integer howManyAdults, Integer howManyChildren) {
        this.dateOfDeparture = dateOfDeparture;
        this.dateOfArrival = dateOfArrival;
        this.tourLength = tourLength;
        this.boardType = boardType;
        this.priceForAdult = priceForAdult;
        this.priceForChild = priceForChild;
        this.howManyAdults = howManyAdults;
        this.howManyChildren = howManyChildren;
    }

    public LocalDate getDateOfDeparture() {
        return dateOfDeparture;
    }

    public LocalDate getDateOfArrival() {
        return dateOfArrival;
    }

    public Integer getTourLength() {
        return tourLength;
    }

    public BoardType getBoardType() {
        return boardType;
    }

    public BigDecimal getPriceForAdult() {
        return priceForAdult;
    }

    public BigDecimal getPriceForChild() {
        return priceForChild;
    }

    public Integer getHowManyAdults() {
        return howManyAdults;
    }

    public Integer getHowManyChildren() {
        return howManyChildren;
    }

    public void setDateOfDeparture(LocalDate dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public void setDateOfArrival(LocalDate dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public void setTourLength(Integer tourLength) {
        this.tourLength = tourLength;
    }

    public void setBoardType(BoardType boardType) {
        this.boardType = boardType;
    }

    public void setPriceForAdult(BigDecimal priceForAdult) {
        this.priceForAdult = priceForAdult;
    }

    public void setPriceForChild(BigDecimal priceForChild) {
        this.priceForChild = priceForChild;
    }

    public void setHowManyAdults(Integer howManyAdults) {
        this.howManyAdults = howManyAdults;
    }

    public void setHowManyChildren(Integer howManyChildren) {
        this.howManyChildren = howManyChildren;
    }
}
