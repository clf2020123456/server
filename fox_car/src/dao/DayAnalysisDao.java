package dao;

import entity.DayAnalysis;
import java.util.List;

public interface DayAnalysisDao {

    boolean save(DayAnalysis dayAnalysis);

    boolean delete(DayAnalysis dayAnalysis);

    List<DayAnalysis> getAllDayAnalysis();
}
