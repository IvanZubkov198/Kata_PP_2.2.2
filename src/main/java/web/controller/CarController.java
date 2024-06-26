package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;


import java.util.Collections;
import java.util.List;


@Controller
public class CarController {

    private final CarServiceImp carService;

    @Autowired
    public CarController(CarServiceImp carService) {
        this.carService = carService;
    }

    @GetMapping
    public String getCars(@RequestParam(name = "count", required = false, defaultValue = "5") int count, Model model) {
        List<Car> cars = carService.getAllCars();
        if (count >= 5) {
            model.addAttribute("cars", cars);
        } else if (count > 0) {
            model.addAttribute("cars", cars.subList(0, Math.min(count, cars.size())));
        } else {
            model.addAttribute("cars", Collections.emptyList());
        }
        return "cars";
    }
}
