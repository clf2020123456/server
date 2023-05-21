package dao.impl;

import dao.DayAnalysisDao;
import entity.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

public class DayAnalysisDaoImpl extends BaseDAO implements DayAnalysisDao {

    public boolean save(DayAnalysis dayAnalysis) {
        try {
            executeHql("delete from DayAnalysis");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        save2(dayAnalysis,"FROM Zuche","租车");
        save2(dayAnalysis,"FROM Cunche","存车");
        return true;

    }

    public void save2(DayAnalysis dayAnalysis,String hql,String type){
        if("租车".equals(type)){
            List<Zuche> zuches = findByHQL(hql);
            StringBuilder manString = new StringBuilder();
            StringBuilder womanString = new StringBuilder();
            LocalDate today = LocalDate.now();
            String carTypeString="";
            String carDaxiaoString = "";
            int xny=0;
            int yc=0;
            int xxc=0;
            int jcxc=0;
            int zxc=0;
            int dxc=0;
            if (!zuches.isEmpty()) {
                for (Zuche zuch : zuches) {
                    Date zucheStartDate = zuch.getZuche_start_date();
                    LocalDate zucheLocalDate = zucheStartDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    if (zucheLocalDate.equals(today)) {
                        String hql2 = "FROM User where username='"+zuch.getUsername()+"'";
                        List<User> users = findByHQL(hql2);
                        if(users!=null&&users.size()>0){
                            for (User user : users) {
                                if(user.getSex().equals("男")){
                                    manString.append(user.getName()).append("-").append(zuch.getCar_no()).append("、");
                                }else {
                                    womanString.append(user.getName()).append("-").append(zuch.getCar_no()).append("、");
                                }
                            }
                        }
                        if(zuch.getCar_pinpai()!=null){
                            String hql3 = "FROM CarType where pinpai='"+zuch.getCar_pinpai()+"'";
                            List<CarType> carTypes = findByHQL(hql3);
                            if(carTypes!=null&&carTypes.size()>0){
                                for (CarType carType : carTypes) {
                                    if(carType.getType().equals("新能源")){
                                        xny++;
                                    }else if(carType.getType().equals("油车")){
                                        yc++;
                                    }else if(carType.getDaxiao().equals("小型车")){
                                        xxc++;
                                    }else if(carType.getDaxiao().equals("紧凑型车")){
                                        jcxc++;
                                    }else if(carType.getDaxiao().equals("中型车")){
                                        zxc++;
                                    }else if(carType.getDaxiao().equals("大型车")){
                                        dxc++;
                                    }
                                }
                            }
                        }
                    }

                }
            }
            carTypeString="新能源"+xny+"辆-油车"+yc+"辆";
            carDaxiaoString="小型车"+xxc+"辆-紧凑型车"+jcxc+"辆-中型车"+zxc+"辆-大型车"+dxc+"辆";
            dayAnalysis.setDate("最近一天租车");
            dayAnalysis.setManNum(manString.toString().equals("")?"无":manString.toString().substring(0,manString.length()-1));
            dayAnalysis.setWomanNum(womanString.toString().equals("")?"无":womanString.toString().substring(0,womanString.length()-1));
            dayAnalysis.setCarType(carTypeString);
            dayAnalysis.setCarDaxiao(carDaxiaoString);
            dayAnalysis.setType(type);
            saveOrUpdate(dayAnalysis);
        }else {
            List<Cunche> cunches = findByHQL(hql);
            StringBuilder manString = new StringBuilder();
            StringBuilder womanString = new StringBuilder();
            LocalDate today = LocalDate.now();
            String carTypeString="";
            String carDaxiaoString = "";
            int xny=0;
            int yc=0;
            int xxc=0;
            int jcxc=0;
            int zxc=0;
            int dxc=0;
            if (!cunches.isEmpty()) {
                for (Cunche zuch : cunches) {
                    Date zucheStartDate = zuch.getCunche_start_date();
                    LocalDate zucheLocalDate = zucheStartDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    if (zucheLocalDate.equals(today)) {
                        String hql2 = "FROM User where username='"+zuch.getUsername()+"'";
                        List<User> users = findByHQL(hql2);
                        if(users!=null&&users.size()>0){
                            for (User user : users) {
                                if(user.getSex().equals("男")){
                                    manString.append(user.getName()).append("-").append(zuch.getCar_no()).append("、");
                                }else {
                                    womanString.append(user.getName()).append("-").append(zuch.getCar_no()).append("、");
                                }
                            }
                        }
                        if(zuch.getCar_pinpai()!=null){
                            String hql3 = "FROM CarType where pinpai='"+zuch.getCar_pinpai()+"'";
                            List<CarType> carTypes = findByHQL(hql3);
                            if(carTypes!=null&&carTypes.size()>0){
                                for (CarType carType : carTypes) {
                                    if(carType.getType().equals("新能源")){
                                        xny++;
                                    }else if(carType.getType().equals("油车")){
                                        yc++;
                                    }
                                    if(carType.getDaxiao().equals("小型车")){
                                        xxc++;
                                    }else if(carType.getDaxiao().equals("紧凑型车")){
                                        jcxc++;
                                    }else if(carType.getDaxiao().equals("中型车")){
                                        zxc++;
                                    }else if(carType.getDaxiao().equals("大型车")){
                                        dxc++;
                                    }
                                }
                            }
                        }
                    }

                }
            }
            carTypeString="新能源"+xny+"辆-油车"+yc+"辆";
            carDaxiaoString="小型车"+xxc+"辆-紧凑型车"+jcxc+"辆-中型车"+zxc+"辆-大型车"+dxc+"辆";
            dayAnalysis.setManNum(manString.toString().equals("")?"无":manString.toString().substring(0,manString.length()-1));
            dayAnalysis.setWomanNum(womanString.toString().equals("")?"无":womanString.toString().substring(0,womanString.length()-1));
            dayAnalysis.setCarType(carTypeString);
            dayAnalysis.setCarDaxiao(carDaxiaoString);
            dayAnalysis.setType(type);
            dayAnalysis.setDate("最近一天存车");
            saveOrUpdate(dayAnalysis);
        }

    }

    @Override
    public boolean delete(DayAnalysis dayAnalysis) {
        this.delete(dayAnalysis);
        return true;
    }

    @Override
    public List<DayAnalysis> getAllDayAnalysis() {
        String hql = "FROM DayAnalysis";
        List<DayAnalysis> dayAnalysisList = findByHQL(hql);
        return dayAnalysisList;
    }
}
