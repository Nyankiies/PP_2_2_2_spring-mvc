package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao{

    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("mazda",6));
        carList.add(new Car("BMW",3));
        carList.add(new Car("UAZ",2312));
        carList.add(new Car("Ferrai", 1615));
        carList.add(new Car("Honfa",11223));

    }
    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
