package service;

import entity.Car;
import repository.CarRepository;

public class CarService implements ICarService {
    private CarRepository carRepository;

    public CarService() {
        this.carRepository = new CarRepository();
    }

    @Override
    public void addCar(Car car) {
        carRepository.add(car);
    }

    @Override
    public void displayCars() {
        for (Car car : carRepository.getAll()) {
            System.out.println(car.toString());
        }
    }

    @Override
    public void removeCar(String licensePlate) {
        for (Car car : carRepository.getAll()) {
            if (car.getLicensePlate().equals(licensePlate)) {
                carRepository.remove(car);
                break;
            }
        }
    }
}