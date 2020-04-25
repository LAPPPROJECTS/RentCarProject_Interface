package car;

import java.util.Collection;
import java.util.HashSet;

public class CarRepository {
    private final Collection<Car> cars = new HashSet<>();

    public void add(Car car) {
        cars.add(car);
    }
}
