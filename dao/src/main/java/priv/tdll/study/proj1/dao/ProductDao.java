package priv.tdll.study.proj1.dao;

import org.apache.ibatis.annotations.Param;
import priv.tdll.study.proj1.dao.base.BaseDao;
import priv.tdll.study.proj1.entity.Product;

import java.util.List;

public interface ProductDao extends BaseDao<Product> {

    List<Product> queryByName(@Param("name") String name);

}
