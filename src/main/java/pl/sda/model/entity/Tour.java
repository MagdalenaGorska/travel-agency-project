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

}
