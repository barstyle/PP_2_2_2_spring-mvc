package web.controller;

//1. Создайте еще один контроллер, замаппленный на /cars.

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(ModelMap model) {

        model.addAttribute("messages", "5");
        return "index";
    }
}
