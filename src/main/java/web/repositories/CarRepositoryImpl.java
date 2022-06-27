package web.repositories;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepositoryImpl implements CarRepository {
    @Override
    public List<Car> getAllCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Mazda", "CX-30", 32_060.330));
        carList.add(new Car("Mazda", "CX-50", 39_190.690));
        carList.add(new Car("Mazda", "CX-60", 45_540.740));
        carList.add(new Car("Mazda", "CX-5", 35_500.000));
        carList.add(new Car("Mazda", "CX-9", 42_100.300));
        return carList;
    }

    @Override
    public Integer gelCountAllCars() {
        return getAllCars().size();
    }
}
