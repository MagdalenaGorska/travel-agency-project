package pl.sda.entity;

import pl.sda.model.BoardType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    public Tour(){}
    public Tour(LocalDate dateOfDeparture, LocalDate dateOfArrival, Integer tourLength, BoardType boardType) {
        this.dateOfDeparture = dateOfDeparture;
        this.dateOfArrival = dateOfArrival;
        this.tourLength = tourLength;
        this.boardType = boardType;
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
}
