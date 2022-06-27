package web.services;

import web.model.Car;
import web.repositories.CarRepository;
import web.repositories.CarRepositoryImpl;

import java.util.List;

// 4. Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.
public class CarServiceImpl implements CarService{

    private final CarRepository carRepository;

    public CarServiceImpl() {
            carRepository = new CarRepositoryImpl();
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.getAllCars();
    }

    @Override
    public Integer gelCountAllCars() {
        return carRepository.gelCountAllCars();
    }

    @Override
    public List<Car> getHowManyCars(int count) {
        return carRepository.getHowManyCars(count);
    }
}
