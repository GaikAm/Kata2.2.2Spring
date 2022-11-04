package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {


    @GetMapping(value = "/cars")
    public String printTable(Model model, @RequestParam(required = false, defaultValue = "5") Integer count) {
        if(count.compareTo(5) > 0 || count.compareTo(0) < 0) {
            count = 5;
        }
        List<Car> carsList = Arrays.asList(
                new Car("Hyundai", 13, (short) 10),
                new Car("Toyota", 3, (short) 3),
                new Car("BMW", 5, (short) 15),
                new Car("Mercedes", 13, (short) 40),
                new Car("Hyundai", 2, (short) 20));
        model.addAttribute("carsList", carsList.subList(0, count));
        return "cars";
    }
}
