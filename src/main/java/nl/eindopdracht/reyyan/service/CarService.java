package nl.eindopdracht.reyyan.service;

import nl.eindopdracht.reyyan.model.Car;
import java.util.List;

public interface CarService {

        List<Car> findAllCars();

        Car findCarById(int carId);

        void saveCar(Car theCar);

        void deleteCarById(int theId);
}
