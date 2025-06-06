package repository;

import entity.Truck;
import java.util.ArrayList;

public class TruckRepository {
    private ArrayList<Truck> xeTai;

    public TruckRepository() {
        this.xeTai = new ArrayList<>();
    }

    public ArrayList<Truck> getAll() {
        return xeTai;
    }

    public void add(Truck truck) {
        xeTai.add(truck);
    }

    public void remove(Truck truck) {
        xeTai.remove(truck);
    }
}