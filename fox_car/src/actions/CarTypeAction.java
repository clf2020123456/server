package actions;

import entity.Biotech;
import entity.CarType;
import net.sf.json.JSONArray;
import net.sf.json.util.JSONUtils;
import org.apache.struts2.json.JSONUtil;
import service.CarTypeService;

import java.util.ArrayList;
import java.util.List;

public class CarTypeAction extends BaseAction{

    private CarTypeService carTypeService;

    private CarType carType;
    private String jsonString;
    private List<CarType> list = new ArrayList<>();

    public String saveCarType() {
        carTypeService.save(carType);
        return SUCCESS;
    }
    public String listCarType() {
        list = carTypeService.listCarType();
        return SUCCESS;
    }
    public String listCarType1() {
        jsonString =  JSONArray.fromObject(carTypeService.listCarType()).toString();
        return SUCCESS;
    }
    public String deleteCarType() {
        carTypeService.del(carType);
        return SUCCESS;
    }

    public CarTypeService getCarTypeService() {
        return carTypeService;
    }

    public void setCarTypeService(CarTypeService carTypeService) {
        this.carTypeService = carTypeService;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public List<CarType> getList() {
        return list;
    }

    public void setList(List<CarType> list) {
        this.list = list;
    }


    public String getJsonString() {
        return jsonString;
    }
    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }
}
