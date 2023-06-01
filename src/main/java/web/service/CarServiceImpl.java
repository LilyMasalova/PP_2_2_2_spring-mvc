package web.service;
import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private final List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Ford",  "black"));
        cars.add(new Car(2, "Ferrari",  "red"));
        cars.add(new Car(3, "BMW",  "black"));
        cars.add(new Car(4, "Toyota",  "white"));
        cars.add(new Car(5, "Tesla",  "yellow"));
    }
    @Override
    public List<Car> getAllCars() {
        return cars;
    }
    @Override
    public List<Car> getSomeCars(List<Car> cars, int count) {
          return (count>=5) ? getAllCars() : cars.stream().limit(count).collect(Collectors.toList());



    }


}
