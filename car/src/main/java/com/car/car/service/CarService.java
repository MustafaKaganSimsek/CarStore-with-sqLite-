package com.car.car.service;

import com.car.car.dto.CarAdminDto;
import com.car.car.dto.mappers.CarMapper;
import com.car.car.model.Car;
import com.car.car.repository.CarRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor

public class CarService {

    private final CarRepository carRepository;
    private final CarMapper mapper;



    public void createCar(CarAdminDto carAdminDto) {
        Car car = mapper.carAdminToCar(carAdminDto);
        carRepository.save(car);
    }

    public List<CarAdminDto> getCar(){
        List<Car> car = carRepository.findAll();

        return mapper.carToCarAdminDto(car);

    }

    public void deleteCar(int id){
        Optional<Car> optionalcar = carRepository.findById(id);
        if (!optionalcar.isPresent()) {
            throw new RuntimeException("Not Found Object");
        }
        carRepository.deleteById(id);
    }

    public void deleteAllCar(){
        carRepository.deleteAll();
    }

    public boolean isPresent(int carId) {
        Optional<Car> car = carRepository.findById(carId);
        return car.isPresent();
    }
}
