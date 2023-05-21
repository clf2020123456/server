package dao.impl;

import dao.WeekAnalysisDao;
import entity.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

public class WeekAnalysisDaoImpl extends BaseDAO implements WeekAnalysisDao {

    @Override
    public boolean save(WeekAnalysis weekAnalysis) {
        try {
            executeHql("delete from WeekAnalysis");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        save2(weekAnalysis,"FROM Zuche","租车");
        save2(weekAnalysis,"FROM Cunche","存车");
        return true;
    }

    public void save2(WeekAnalysis weekAnalysis,String hql,String type){
        if("租车".equals(type)){
            List<Zuche> zuches = findByHQL(hql);
            StringBuilder manString = new StringBuilder();
            StringBuilder womanString = new StringBuilder();
            LocalDate today = LocalDate.now();
            LocalDate oneWeekAgo = today.minusDays(7);
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
            weekAnalysis.setDate("最近七天租车");
            weekAnalysis.setManNum(manString.toString().equals("")?"无":manString.toString().substring(0,manString.length()-1));
            weekAnalysis.setWomanNum(womanString.toString().equals("")?"无":womanString.toString().substring(0,womanString.length()-1));
            weekAnalysis.setCarType(carTypeString);
            weekAnalysis.setCarDaxiao(carDaxiaoString);
            weekAnalysis.setType(type);
            saveOrUpdate(weekAnalysis);
        }else {
            List<Cunche> cunches = findByHQL(hql);
            StringBuilder manString = new StringBuilder();
            StringBuilder womanString = new StringBuilder();
            LocalDate today = LocalDate.now();
            LocalDate oneWeekAgo = today.minusDays(7);
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
            weekAnalysis.setManNum(manString.toString().equals("")?"无":manString.toString().substring(0,manString.length()-1));
            weekAnalysis.setWomanNum(womanString.toString().equals("")?"无":womanString.toString().substring(0,womanString.length()-1));
            weekAnalysis.setCarType(carTypeString);
            weekAnalysis.setCarDaxiao(carDaxiaoString);
            weekAnalysis.setType(type);
            weekAnalysis.setDate("最近七天存车");
            saveOrUpdate(weekAnalysis);
        }

    }

    @Override
    public boolean delete(WeekAnalysis weekAnalysis) {
        this.delete(weekAnalysis);
        return true;
    }

    @Override
    public List<WeekAnalysis> getAllWeekAnalysis() {
        String hql = "FROM WeekAnalysis";
        List<WeekAnalysis> weekAnalysisList = findByHQL(hql);
        return weekAnalysisList;
    }
}
