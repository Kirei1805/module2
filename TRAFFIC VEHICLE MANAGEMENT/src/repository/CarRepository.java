package repository;

import entity.Car;
import java.util.ArrayList;

public class CarRepository {
    private ArrayList<Car> oto;

    public CarRepository() {
        this.oto = new ArrayList<>();
    }

    public ArrayList<Car> getAll() {
        return oto;
    }

    public void add(Car car) {
        oto.add(car);
    }

    public void remove(Car car) {
        oto.remove(car);
    }
}