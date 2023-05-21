package dao;

import entity.Biotech;
import entity.CarType;

import java.util.List;

public interface CarTypeDao {

    public boolean save(CarType carType);

    public boolean del(CarType carType);

    public List<CarType> listCarType();
}
