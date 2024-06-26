package web.service;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("BMW", "M5", 2007, 1_200_000));
        cars.add(new Car("Mercedes-Benz", "E200", 2010, 1_800_000));
        cars.add(new Car("Nissan", "GTR_R35", 2017, 3_300_000));
        cars.add(new Car("Lamborgini", "Urus", 2022, 22_000_000));
        cars.add(new Car("Toyota", "Tundra", 2016, 9_000_000));
        return cars;
    }
}
