package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.config.dao.CarDao;
import web.config.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    @Autowired
    CarDao carDao;

    @Override
    public List<Car> getCars(int count) {
//        return carDao.getCars(count);
        return null;
    }
}