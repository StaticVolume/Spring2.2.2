package web.Dao;

import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface CarDao {
    List<Car> getDaoCarList(HttpServletRequest request);

}
