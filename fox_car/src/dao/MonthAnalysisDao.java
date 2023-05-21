package dao;

import entity.MonthAnalysis;

import java.util.List;

public interface MonthAnalysisDao {

    boolean save(MonthAnalysis monthAnalysis);

    boolean delete(MonthAnalysis monthAnalysis);

    List<MonthAnalysis> getAllMonthAnalysis();
}
