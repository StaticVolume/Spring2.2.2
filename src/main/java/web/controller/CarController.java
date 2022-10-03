package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String printCarList(HttpServletRequest request, Model model) {
        List<Car> cars = carService.getCarList();
        if (request.getParameter("count") != null) {

            int count = Integer.parseInt(request.getParameter("count"));
            if (count >= 0 && count < 5) {
                for(int countCars = cars.size(); countCars > count; --countCars) {
                    cars.remove(countCars - 1);
                }
            }
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
