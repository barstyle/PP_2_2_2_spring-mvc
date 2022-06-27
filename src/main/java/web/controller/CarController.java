package web.controller;

//1. Создайте еще один контроллер, замаппленный на /cars.

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.services.CarService;
import web.services.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {
/*
 6. При запросе /cars выводить весь список.
 При запросе /cars?count=2 должен отобразиться список из 2 машин,
 при /cars?count=3 - из 3, и тд.
 При count ≥ 5 выводить весь список машин.
*/
    private final CarService carService;

    public CarController() {
        this.carService = new CarServiceImpl();
    }

    @GetMapping(value = "/cars")
    public String getCars(ModelMap model,
                          @RequestParam(value = "count", required = false) Integer count) {
        if (count == null) count = carService.gelCountAllCars();
        List<Car> carList = carService.getHowManyCars(count);
        model.addAttribute("cars", carList);
        return "cars";
    }
}
