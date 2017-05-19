package work;

import com.taobao.pamirs.schedule.TaskItemDefine;
import dto.TbOrderDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.TbOrderService;

import java.util.List;

/**
 * Created by yuan4j on 2017/5/19.
 */
@Component
public class tbOrderSyncTask extends AbstractSyncTask {

    private static final Logger logger = LoggerFactory.getLogger("tbOrderSyncTask");

    @Autowired
    private TbOrderService tbOrderService;

    protected List<TbOrderDto> getTbOrderDtos(String taskParameter, String ownSign, int taskItemNum, List<TaskItemDefine> taskItemList, int eachFetchDataNum) {
        String buildDate = taskItemList.get(0).getTaskItemId();
        List<TbOrderDto> result = null;
        long startTime = System.currentTimeMillis();
        logger.info("tbOrderSyncTask--Task Start : buildDate{}.Start time is : {}", buildDate, startTime);
        try {
            result = tbOrderService.getTbOrderList(buildDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("tbOrderSyncTask--Task Start : Consumption  Time {} . End time is : {}", System.currentTimeMillis() - startTime, buildDate);
        return result;
    }

}
