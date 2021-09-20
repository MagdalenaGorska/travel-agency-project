package pl.sda.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.sda.entity.Airport;
import pl.sda.entity.City;

@Data
@AllArgsConstructor
public class TourDto {

    private Integer id;

    private Airport airportDto;

    private City cityDto;

}
