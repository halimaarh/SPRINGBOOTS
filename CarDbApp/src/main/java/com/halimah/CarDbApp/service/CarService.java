package com.halimah.CarDbApp.service;

import com.halimah.CarDbApp.entity.Car;
import com.halimah.CarDbApp.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars(){
        return carRepository.findAll();
    }

    public Car addCar(Car car){
        return carRepository.save(car);
    }

    public Car updateCar(Long id, Car carDetails){
        return carRepository.findById(id).map(student -> {
            student.setCarModel(carDetails.getCarModel());
            student.setPlateNumber(carDetails.getPlateNumber());
            student.setRegistrationDate(carDetails.getRegistrationDate());
            return carRepository.save(student);
        }).orElseThrow(() -> new RuntimeException("Student not found with id" + id));
    }

    public void deleteCar(Long id){
        carRepository.deleteById(id);
    }


}

