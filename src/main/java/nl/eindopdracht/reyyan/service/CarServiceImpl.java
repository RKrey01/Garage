package nl.eindopdracht.reyyan.service;

import nl.eindopdracht.reyyan.model.Car;
import nl.eindopdracht.reyyan.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService{

    private final CarRepository repository;

    public CarServiceImpl(CarRepository repository) {
        this.repository = repository;
    }

    @Override
    public List <Car> findAllCars(){
        return repository.findAll();
    }

    @Override
    public Car findCarById(int carId){
        Optional<Car> result = repository.findById(carId);

        Car theCar = null;
        if (result.isPresent()){
            theCar = result.get();
        } else {
            throw new RuntimeException("Auto niet gevonden! ID - " + carId);
        }

        return theCar;
    }

    @Override
    public void saveCar(Car theCar){
        repository.save(theCar);
    }

    @Override
    public void deleteCarById(int theId){
        repository.deleteById(theId);
    }
}
