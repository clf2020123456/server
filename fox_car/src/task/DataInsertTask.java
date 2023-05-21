package task;

import dao.DayAnalysisDao;
import dao.MonthAnalysisDao;
import dao.WeekAnalysisDao;
import entity.DayAnalysis;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class DataInsertTask implements ServletContextListener {

    @Autowired
    DayAnalysisDao dayAnalysisDao;
    @Autowired
    WeekAnalysisDao weekAnalysisDao;
    @Autowired
    MonthAnalysisDao monthAnalysisDao;

    private Timer timer;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        timer = new Timer();

        // 设置每天的执行时间为 00:00:00
        Calendar dailyTime = Calendar.getInstance();
        dailyTime.set(Calendar.HOUR_OF_DAY, 0);
        dailyTime.set(Calendar.MINUTE, 0);
        dailyTime.set(Calendar.SECOND, 0);

        // 设置每周的执行时间为每周一的 00:00:00
        Calendar weeklyTime = Calendar.getInstance();
        weeklyTime.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        weeklyTime.set(Calendar.HOUR_OF_DAY, 0);
        weeklyTime.set(Calendar.MINUTE, 0);
        weeklyTime.set(Calendar.SECOND, 0);

        // 设置每月的执行时间为每月1号的 00:00:00
        Calendar monthlyTime = Calendar.getInstance();
        monthlyTime.set(Calendar.DAY_OF_MONTH, 1);
        monthlyTime.set(Calendar.HOUR_OF_DAY, 0);
        monthlyTime.set(Calendar.MINUTE, 0);
        monthlyTime.set(Calendar.SECOND, 0);

        // 创建每天执行的任务
        TimerTask dailyTask = new TimerTask() {
            @Override
            public void run() {
                // TODO: 在这里编写每天插入数据到 t_day_analysis 的逻辑
                DayAnalysis dayAnalysis = new DayAnalysis();
                dayAnalysis.setWomanNum("asdsad");
                dayAnalysisDao.save(dayAnalysis);
                System.out.println("Inserting data into t_day_analysis");
            }
        };
        timer.scheduleAtFixedRate(dailyTask, dailyTime.getTime(), 5 * 1000);
        // 创建每周执行的任务
        TimerTask weeklyTask = new TimerTask() {
            @Override
            public void run() {
                // TODO: 在这里编写每周插入数据到 t_week_analysis 的逻辑
                System.out.println("Inserting data into t_week_analysis");
            }
        };

        // 创建每月执行的任务
        TimerTask monthlyTask = new TimerTask() {
            @Override
            public void run() {
                // TODO: 在这里编写每月插入数据到 t_month_analysis 的逻辑
                System.out.println("Inserting data into t_month_analysis");
            }
        };

        // 安排每天执行任务
        timer.scheduleAtFixedRate(dailyTask, dailyTime.getTime(), 24 * 60 * 60 * 1000);

        // 安排每周执行任务
        timer.scheduleAtFixedRate(weeklyTask, weeklyTime.getTime(), 7 * 24 * 60 * 60 * 1000);

        // 安排每月执行任务
        timer.scheduleAtFixedRate(monthlyTask, monthlyTime.getTime(), 30 * 24 * 60 * 60 * 1000);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        timer.cancel();
    }
}
