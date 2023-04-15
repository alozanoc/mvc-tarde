package pe.edu.upao.mvctarde.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.edu.upao.mvctarde.models.Car;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingService {
    ArrayList<Car> cars = new ArrayList<>();

    public List<Car> getAllCars() {
        return cars;
    }


    public Car addCar(Car car) {
        car.setEntryTime(LocalDateTime.now());
        cars.add(car);
        return car;
    }
}
