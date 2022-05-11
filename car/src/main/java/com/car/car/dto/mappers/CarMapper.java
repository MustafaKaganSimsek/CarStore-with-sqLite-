package com.car.car.dto.mappers;


import com.car.car.dto.CarAdminDto;
import com.car.car.dto.CarDto;
import com.car.car.model.Car;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {

    Car carAdminToCar(CarAdminDto carAdminDto);
    CarAdminDto carToCarAdminDto(Car car);

    //Car carDtoToCar(CarDto carDto);
    CarDto carToCarDto(Car car);

    List<CarAdminDto> carToCarAdminDto(List<Car> car);
}
