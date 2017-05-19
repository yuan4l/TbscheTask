package work;

import com.taobao.pamirs.schedule.TaskItemDefine;
import dto.TbOrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.TbOrderService;

import java.util.List;

/**
 * Created by yuan4j on 2017/5/19.
 */
@Component
public class tbOrderSyncTask extends AbstractSyncTask {

    @Autowired
    private TbOrderService tbOrderService;

    protected List<TbOrderDto> getTbOrderDtos(String taskParameter, String ownSign, int taskItemNum, List<TaskItemDefine> taskItemList, int eachFetchDataNum) {
        String buildDate = taskItemList.get(0).getTaskItemId();

        return null;
    }

}
