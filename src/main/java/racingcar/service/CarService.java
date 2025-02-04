package racingcar.service;

import racingcar.domain.Car;
import racingcar.repository.CarRepository;

import java.util.List;

public class CarService {

    private final CarRepository carRepository = new CarRepository();

    public List<Car> saveCars(List<String> carNames){
        for(String carName : carNames){
            carRepository.save(new Car(carName));
        }
        return getCarList();
    }

    public List<Car> getCarList(){
        return carRepository.findAll();
    }


}
