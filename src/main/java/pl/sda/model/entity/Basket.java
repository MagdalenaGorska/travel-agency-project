package pl.sda.model.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToMany
    @Column(length = 500)
    private List<Tour> tourList;
    @OneToOne
    private User user;

    public Basket(List<Tour> tourList) {
        this.tourList = tourList;
    }

    public Basket(){}


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }


    public List<Tour> getTourList() {
        return tourList;
    }

    public void setTourList(List<Tour> tourList) {
        this.tourList = tourList;
    }

    public void addTour(Tour tour){
        tourList.add(tour);
    }

}
