package dao;

import dto.TbOrderDto;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yuan4j on 2017/5/16.
 */
@Repository
public interface TbOrderDao extends BaseDao<TbOrderDto, Long> {

    List<TbOrderDto> findListByDate(String date);
}
