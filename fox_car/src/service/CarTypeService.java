package service;

import entity.Biotech;
import entity.CarType;

import java.util.List;

public interface CarTypeService {

    public boolean save(CarType carType);

    public void del(CarType carType);

    public List<CarType> listCarType();

}
