package dao;

import entity.MonthAnalysis;
import entity.WeekAnalysis;

import java.util.List;

public interface WeekAnalysisDao {

    boolean save(WeekAnalysis weekAnalysis);

    boolean delete(WeekAnalysis weekAnalysis);

    List<WeekAnalysis> getAllWeekAnalysis();
}
