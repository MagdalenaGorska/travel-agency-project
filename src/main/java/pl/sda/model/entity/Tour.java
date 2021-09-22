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

    public Integer getId() {
        return id;
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

    public String getBoardType() {
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

    public void setBoardType(String boardType) {
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
