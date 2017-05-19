package dao;

import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yuan4j on 2017/5/16.
 */
public interface BaseDao<T extends Serializable, ID extends Serializable> {

    int insert(T entity);

    int update(T entity);

    int updateByFilter(@Param("update") T entity, @Param("expect") T filter);

    int delete(ID id);

    int deleteByFilter(T filter);

    T get(ID id);

    T findOne(T params);

    List<T> findList(T params);

    int count(T params);
}
