package work;

import com.taobao.pamirs.schedule.IScheduleTaskDealSingle;
import com.taobao.pamirs.schedule.TaskItemDefine;
import dto.TbOrderDto;

import java.util.Comparator;
import java.util.List;

/**
 * Created by yuan4j on 2017/5/17.
 */
public abstract class AbstractSyncTask implements IScheduleTaskDealSingle<TbOrderDto> {


    public boolean execute(TbOrderDto tbOrderDto, String ownSign) throws Exception {

        return true;
    }

    public List<TbOrderDto> selectTasks(String taskParameter, String ownSign, int taskItemNum, List<TaskItemDefine> taskItemList, int eachFetchDataNum) throws Exception {
        final List<TbOrderDto> tbOrderDtoList = this.getTbOrderDtos(taskParameter, ownSign, taskItemNum, taskItemList, eachFetchDataNum);

        return tbOrderDtoList;
    }

    protected abstract List<TbOrderDto> getTbOrderDtos(String taskParameter, String ownSign, int taskItemNum, List<TaskItemDefine> taskItemList, int eachFetchDataNum);

    public Comparator<TbOrderDto> getComparator() {
        return null;
    }
}
