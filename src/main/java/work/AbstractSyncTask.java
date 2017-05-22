package work;

import com.taobao.pamirs.schedule.IScheduleTaskDealSingle;
import com.taobao.pamirs.schedule.TaskItemDefine;
import dto.TbOrderDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.List;

/**
 * Created by yuan4j on 2017/5/17.
 */
public abstract class AbstractSyncTask implements IScheduleTaskDealSingle<TbOrderDto> {
    private static final Logger logger = LoggerFactory.getLogger("AbstractSyncTask");

    public boolean execute(TbOrderDto tbOrderDto, String ownSign) throws Exception {
        if (tbOrderDto == null) {
            return true;
        }
        boolean flag = insertTbOrderCopy(tbOrderDto);
        logger.info("task execute{}",String.valueOf(flag));
        return true;
    }

    public List<TbOrderDto> selectTasks(String taskParameter, String ownSign, int taskItemNum, List<TaskItemDefine> taskItemList, int eachFetchDataNum) throws Exception {
        final List<TbOrderDto> tbOrderDtoList = this.getTbOrderDtos(taskParameter, ownSign, taskItemNum, taskItemList, eachFetchDataNum);

        return tbOrderDtoList;
    }

    protected abstract boolean insertTbOrderCopy(TbOrderDto tbOrderDto);

    protected abstract List<TbOrderDto> getTbOrderDtos(String taskParameter, String ownSign, int taskItemNum, List<TaskItemDefine> taskItemList, int eachFetchDataNum);

    public Comparator<TbOrderDto> getComparator() {
        return null;
    }
}
