package com.halimah.CarDbApp.controller;

import com.halimah.CarDbApp.entity.Car;
import com.halimah.CarDbApp.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/cars")

public class CarController {

        @Autowired
        private CarService carService;

        @GetMapping
        public List<Car> getAllCars(){
            return carService.getAllCars();
        }

        @PostMapping
        public Car addCars(@RequestBody Car car){
            return carService.addCar(car);
        }

        @PutMapping("/{id}")
        public Car updateCar(@PathVariable Long id, @RequestBody Car carDetails){
            return carService.updateCar(id, carDetails);
        }

        @DeleteMapping("/{id}")
        public void deleteCar(@PathVariable Long id){
            carService.deleteCar(id);
        }
    }

