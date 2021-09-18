package pl.sda.entity;

import org.springframework.format.annotation.DateTimeFormat;
import pl.sda.model.BoardType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date dateOfDeparture;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date dateOfArrival;
    private Integer tourLength;
    private String boardType;
    private Integer priceForAdult;
    private Integer priceForChild;
    private Integer howManyAdults;
    private Integer howManyChildren;

    public Tour(){}

    public Tour(Date dateOfDeparture, Date dateOfArrival, Integer tourLength
            , String boardType, Integer priceForAdult, Integer priceForChild
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

    public Date getDateOfDeparture() {
        return dateOfDeparture;
    }

    public Date getDateOfArrival() {
        return dateOfArrival;
    }

    public Integer getTourLength() {
        return tourLength;
    }

    public String getBoardType() {
        return boardType;
    }

    public Integer getPriceForAdult() {
        return priceForAdult;
    }

    public Integer getPriceForChild() {
        return priceForChild;
    }

    public Integer getHowManyAdults() {
        return howManyAdults;
    }

    public Integer getHowManyChildren() {
        return howManyChildren;
    }

    public void setDateOfDeparture(Date dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public void setDateOfArrival(Date dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public void setTourLength(Integer tourLength) {
        this.tourLength = tourLength;
    }

    public void setBoardType(String boardType) {
        this.boardType = boardType;
    }

    public void setPriceForAdult(Integer priceForAdult) {
        this.priceForAdult = priceForAdult;
    }

    public void setPriceForChild(Integer priceForChild) {
        this.priceForChild = priceForChild;
    }

    public void setHowManyAdults(Integer howManyAdults) {
        this.howManyAdults = howManyAdults;
    }

    public void setHowManyChildren(Integer howManyChildren) {
        this.howManyChildren = howManyChildren;
    }
}
