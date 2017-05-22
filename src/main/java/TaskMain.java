import com.taobao.pamirs.schedule.strategy.TBScheduleManagerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Properties;

/**
 * Created by yuan4j on 2017/5/19.
 */
public class TaskMain {
    public static void main(String[] args) {
        // 初始化Spring
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/spring/spring-dao.xml");

        // 初始化调度工厂
        TBScheduleManagerFactory scheduleManagerFactory = new TBScheduleManagerFactory();

        Properties p = new Properties();
        p.put("zkConnectString", "192.168.60.48:2181");
        p.put("rootPath", "/tbschedule/lsh-atp");
        p.put("zkSessionTimeout", "60000");
        p.put("userName", "lsh-atp");
        p.put("password", "password");
        p.put("isCheckParentPath", "true");

        scheduleManagerFactory.setApplicationContext(ctx);

        try {
            scheduleManagerFactory.init(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
