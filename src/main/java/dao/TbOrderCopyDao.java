package dao;

import dto.TbOrderDto;
import org.springframework.stereotype.Repository;

/**
 * Created by yuan4j on 2017/5/19.
 */
@Repository
public interface TbOrderCopyDao extends BaseDao<TbOrderDto, Long> {
    
}
