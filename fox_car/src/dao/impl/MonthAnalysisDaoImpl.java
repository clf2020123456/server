package dao.impl;

import dao.MonthAnalysisDao;
import entity.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

public class MonthAnalysisDaoImpl extends BaseDAO implements MonthAnalysisDao {
    @Override
    public boolean save(MonthAnalysis monthAnalysis) {
        try {
            executeHql("delete from MonthAnalysis");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        save2(monthAnalysis,"FROM Zuche","租车");
        save2(monthAnalysis,"FROM Cunche","存车");
        return true;
    }

    public void save2(MonthAnalysis monthAnalysis,String hql,String type){
        if("租车".equals(type)){
            List<Zuche> zuches = findByHQL(hql);
            StringBuilder manString = new StringBuilder();
            StringBuilder womanString = new StringBuilder();
            LocalDate today = LocalDate.now();
            LocalDate oneWeekAgo = today.minusDays(30);
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
                    if (zucheLocalDate.isAfter(oneWeekAgo) && (zucheLocalDate.isBefore(today) || zucheLocalDate.isEqual(today))) {
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
            monthAnalysis.setDate("最近三十天租车");
            monthAnalysis.setManNum(manString.toString().equals("")?"无":manString.toString().substring(0,manString.length()-1));
            monthAnalysis.setWomanNum(womanString.toString().equals("")?"无":womanString.toString().substring(0,womanString.length()-1));
            monthAnalysis.setCarType(carTypeString);
            monthAnalysis.setCarDaxiao(carDaxiaoString);
            monthAnalysis.setType(type);
            saveOrUpdate(monthAnalysis);
        }else {
            List<Cunche> cunches = findByHQL(hql);
            StringBuilder manString = new StringBuilder();
            StringBuilder womanString = new StringBuilder();
            LocalDate today = LocalDate.now();
            LocalDate oneWeekAgo = today.minusDays(30);
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
                    if (zucheLocalDate.isAfter(oneWeekAgo) && (zucheLocalDate.isBefore(today) || zucheLocalDate.isEqual(today))) {
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
            monthAnalysis.setManNum(manString.toString().equals("")?"无":manString.toString().substring(0,manString.length()-1));
            monthAnalysis.setWomanNum(womanString.toString().equals("")?"无":womanString.toString().substring(0,womanString.length()-1));
            monthAnalysis.setCarType(carTypeString);
            monthAnalysis.setCarDaxiao(carDaxiaoString);
            monthAnalysis.setType(type);
            monthAnalysis.setDate("最近三十天存车");
            saveOrUpdate(monthAnalysis);
        }

    }

    @Override
    public boolean delete(MonthAnalysis monthAnalysis) {
        this.delete(monthAnalysis);
        return true;
    }

    @Override
    public List<MonthAnalysis> getAllMonthAnalysis() {
        String hql = "FROM MonthAnalysis";
        List<MonthAnalysis> monthAnalysisList = findByHQL(hql);
        return monthAnalysisList;
    }
}
