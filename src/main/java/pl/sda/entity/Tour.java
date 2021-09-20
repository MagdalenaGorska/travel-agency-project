package pl.sda.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

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

    public Tour(LocalDate dateOfDeparture, LocalDate dateOfArrival, Integer tourLength
            , String boardType, BigDecimal priceForAdult, BigDecimal priceForChild
            , Integer howManyAdults, Integer howManyChildren) {
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


    public LocalDate getDateOfDeparture() {
        return dateOfDeparture;
    }

    public LocalDate getDateOfArrival() {
        return dateOfArrival;
    }

    public Integer getTourLength() {
        return Period.between(dateOfDeparture, dateOfArrival).getDays();
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
