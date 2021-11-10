package nl.eindopdracht.reyyan.controller;

import nl.eindopdracht.reyyan.model.Car;
import nl.eindopdracht.reyyan.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/addCar")
    public Car addCar (@RequestBody Car car) {
        if (car == null) return null;
        carService.saveCar(car);
        return car;
    }

    @GetMapping("/")
    public List<Car> getAllCars() {
        return carService.findAllCars();
    }

    @GetMapping("/{carId}")
    public Car getCarById(@PathVariable("carId") Integer theId) {
        return carService.findCarById(theId);
    }

    @DeleteMapping("/deleteCar/{carId}")
    public boolean deleteCar(@PathVariable("carId") Integer theId) {
        carService.deleteCarById(theId);
        return true;
    }

}

