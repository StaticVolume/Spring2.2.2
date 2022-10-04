package web.service;

import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface CarService {
    public List<Car> getCarList(HttpServletRequest request);

}
