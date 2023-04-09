package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.Optional;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(value = "count", required = false) Optional<Integer> count, Model model) {
        model.addAttribute("cars",carService.getCars(count.orElse(0)));
        return "car";
    }
//    public String getCarshtml(@RequestParam(value = "alco", required = false) String str, Model model) {
//        model.addAttribute("alco", "Get Fucking Attribute");
//        return "cars";
//    }
}
