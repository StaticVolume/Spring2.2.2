package web.Dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getDaoCarList(HttpServletRequest request) {

        List<Car> cars = new ArrayList<>();
        /** пишу без цикла, потому что хочу создать вменяемые навзвания и параметры возраста и мощности машин.
        /* но вопрос остаётся, необходимо ли запрашивать пользователя ввести информацию о 5 машинах и загрузить их
        /* базу данных? Если нет, то нет вопросов, если да, будет обидно потерять 1 день работы....до слёзок. */
            cars.add(new Car("Toyota Corolla", 127,15));
            cars.add(new Car("Toyota LandCruiser 200", 250, 10));
            cars.add(new Car("Mazda Demio", 15, 5));
            cars.add(new Car("BMW x3", 210, 3));
            cars.add(new Car("Lada Xray", 157,6));
            /***************************************************************************************************/
        if (request.getParameter("count") != null) {

            int count = Integer.parseInt(request.getParameter("count"));
            if (count >= 0 && count < 5) {
                for(int countCars = cars.size(); countCars > count; --countCars) {
                    cars.remove(countCars - 1);
                }
            }
        }

        return cars;
    }
}
