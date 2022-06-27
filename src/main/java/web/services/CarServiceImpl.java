package web.services;

import web.model.Car;
import web.repositories.CarRepository;
import web.repositories.CarRepositoryImpl;

import java.util.List;

// 4. Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.
public class CarServiceImpl implements CarService{

    private final CarRepository carService;

    public CarServiceImpl() {
            carService = new CarRepositoryImpl();
    }

    @Override
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @Override
    public Integer gelCountAllCars() {
        return carService.gelCountAllCars();
    }

    @Override
    public List<Car> getHowManyCars(int count) {
        return carService.getHowManyCars(count);
    }
}
