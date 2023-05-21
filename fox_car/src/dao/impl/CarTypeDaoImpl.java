package dao.impl;

import dao.CarTypeDao;
import entity.Biotech;
import entity.CarType;

import java.util.List;

public class CarTypeDaoImpl extends BaseDAO implements CarTypeDao {
    @Override
    public boolean save(CarType carType) {
        return saveOrUpdate(carType);
    }

    @Override
    public boolean del(CarType carType) {
        this.delete(carType);
        return true;
    }

    @Override
    public List<CarType> listCarType() {
        StringBuffer sb;
        sb = new StringBuffer("FROM CarType");

        List<CarType> lst = findByHQL(sb.toString());
        return lst;
    }
}
