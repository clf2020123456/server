package service.impl;


import dao.CarTypeDao;
import dao.UserDAO;
import entity.Biotech;
import entity.CarType;
import service.CarTypeService;

import java.util.List;

public class CarTypeServiceImpi implements CarTypeService {

    private CarTypeDao carTypeDao;

    private UserDAO userdao;

    @Override
    public boolean save(CarType carType) {
        return carTypeDao.save(carType);
    }

    @Override
    public List<CarType> listCarType() {
        List<CarType> list = carTypeDao.listCarType();
        return list;
    }
    @Override
    public void del(CarType carType) {
        // TODO Auto-generated method stub
        carTypeDao.del(carType);
    }
    public void setCartypedao(CarTypeDao carTypeDao) {
        this.carTypeDao = carTypeDao;
    }


    public UserDAO getUserdao() {
        return userdao;
    }

    public void setUserdao(UserDAO userdao) {
        this.userdao = userdao;
    }
}
