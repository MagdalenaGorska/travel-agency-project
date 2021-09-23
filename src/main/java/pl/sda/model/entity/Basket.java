package pl.sda.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToMany
    private List<Tour> tourList;

    public Basket(List<Tour> tourList) {
        this.tourList = tourList;
    }

    public Basket(){}

    public Integer getId() {
        return id;
    }


    public List<Tour> getTourList() {
        return tourList;
    }

    public void setTourList(List<Tour> tourList) {
        this.tourList = tourList;
    }
}
