package repository;

import entity.Motorcycle;
import java.util.ArrayList;

public class MotorcycleRepository {
    private ArrayList<Motorcycle> xeMay;

    public MotorcycleRepository() {
        this.xeMay = new ArrayList<>();
    }

    public ArrayList<Motorcycle> getAll() {
        return xeMay;
    }

    public void add(Motorcycle motorcycle) {
        xeMay.add(motorcycle);
    }

    public void remove(Motorcycle motorcycle) {
        xeMay.remove(motorcycle);
    }
}