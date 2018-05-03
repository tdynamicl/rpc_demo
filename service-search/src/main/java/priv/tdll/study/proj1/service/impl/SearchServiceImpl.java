package priv.tdll.study.proj1.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import priv.tdll.study.proj1.dao.ProductDao;
import priv.tdll.study.proj1.entity.Product;
import priv.tdll.study.proj1.service.SearchService;

import java.util.List;
import java.util.UUID;

@Service("searchServiceImpl")
public class SearchServiceImpl implements SearchService {

    @Autowired
    private ProductDao productDao;

    public JSONObject search(String keyword) throws Exception {
        JSONObject resp = new JSONObject();
        List<Product> products = productDao.queryByName(keyword);
        resp.put("products", products);
        return resp;
    }
}
