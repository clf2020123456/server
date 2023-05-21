package actions;


import dao.DayAnalysisDao;
import dao.MonthAnalysisDao;
import dao.WeekAnalysisDao;
import entity.DayAnalysis;
import entity.MonthAnalysis;
import entity.WeekAnalysis;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class AnalysisAction extends BaseAction{

    private DayAnalysisDao dayAnalysisDao;

    private MonthAnalysisDao monthAnalysisDao;

    private WeekAnalysisDao weekAnalysisDao;


    private List<DayAnalysis> list = new ArrayList<>();


    public String listAnalysis() {
        saveData();
        List<DayAnalysis> allDayAnalysis = dayAnalysisDao.getAllDayAnalysis();
        list.addAll(allDayAnalysis);
        List<WeekAnalysis> allWeekAnalysis = weekAnalysisDao.getAllWeekAnalysis();
        for (WeekAnalysis weekAnalysis : allWeekAnalysis) {
            if(weekAnalysis!=null){
                DayAnalysis dayAnalysis = new DayAnalysis();
                BeanUtils.copyProperties(weekAnalysis,dayAnalysis);
                list.add(dayAnalysis);
            }
        }
        List<MonthAnalysis> allMonthAnalysis = monthAnalysisDao.getAllMonthAnalysis();
        for (MonthAnalysis monthAnalysis : allMonthAnalysis) {
            if(monthAnalysis!=null){
                DayAnalysis dayAnalysis = new DayAnalysis();
                BeanUtils.copyProperties(monthAnalysis,dayAnalysis);
                list.add(dayAnalysis);
            }
        }
        return SUCCESS;
    }

    public void saveData(){
        dayAnalysisDao.save(new DayAnalysis());
        weekAnalysisDao.save(new WeekAnalysis());
        monthAnalysisDao.save(new MonthAnalysis());

    }

    public DayAnalysisDao getDayAnalysisDao() {
        return dayAnalysisDao;
    }

    public void setDayAnalysisDao(DayAnalysisDao dayAnalysisDao) {
        this.dayAnalysisDao = dayAnalysisDao;
    }

    public MonthAnalysisDao getMonthAnalysisDao() {
        return monthAnalysisDao;
    }

    public void setMonthAnalysisDao(MonthAnalysisDao monthAnalysisDao) {
        this.monthAnalysisDao = monthAnalysisDao;
    }

    public WeekAnalysisDao getWeekAnalysisDao() {
        return weekAnalysisDao;
    }

    public void setWeekAnalysisDao(WeekAnalysisDao weekAnalysisDao) {
        this.weekAnalysisDao = weekAnalysisDao;
    }


    public List<DayAnalysis> getList() {
        return list;
    }

    public void setList(List<DayAnalysis> list) {
        this.list = list;
    }
}
