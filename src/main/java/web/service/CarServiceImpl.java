package web.service;

import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private CarDao carDao;

    /**@Autowired  не использую так как конструктор 1,модно не писать, сам подцепит*/
    public CarServiceImpl (CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarList(HttpServletRequest request) {
        return carDao.getDaoCarList(request);
    }
}
