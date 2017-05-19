package service;

import dto.TbOrderDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yuan4j on 2017/5/16.
 */
@Service
public interface TbOrderService {
    /**
     * 插入单据
//     * @param tbOrderDto
     * @throws Exception
     */
    void insert() throws Exception;

    /**
     * 获取TbOrderDto list
     * @param buildDate
     * @return
     */
    List<TbOrderDto> getTbOrderList(String buildDate);
}
