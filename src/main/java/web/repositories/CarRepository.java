package web.repositories;

import web.model.Car;

import java.util.List;

public interface CarRepository {
    List<Car> getAllCars();
    Integer gelCountAllCars();
    List<Car> getHowManyCars(int count);
}
