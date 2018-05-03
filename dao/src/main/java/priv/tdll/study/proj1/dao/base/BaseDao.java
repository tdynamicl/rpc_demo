package priv.tdll.study.proj1.dao.base;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseDao<T> {

    T insert(T value);

    int deleteByUniqueKey(@Param("uk") String fieldName, @Param("value") Object value);

    T selectByUniqueKey(@Param("uk") String fieldName, @Param("value") Object value);

    List<T> queryByExample(@Param("example") T example);

    T update(T value);

}
