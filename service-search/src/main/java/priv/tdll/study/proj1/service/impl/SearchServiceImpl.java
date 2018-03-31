package priv.tdll.study.proj1.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;
import priv.tdll.study.proj1.entity.Product;
import priv.tdll.study.proj1.service.SearchService;

import java.util.UUID;

@Service("searchServiceImpl")
public class SearchServiceImpl implements SearchService {

    public JSONObject search(String keyword) throws Exception {
        JSONObject resp = new JSONObject();
        Product product = new Product();
        String[] chars = keyword.split("");
        StringBuilder sb = new StringBuilder();
        for (int i=0; i< chars.length; i++) {
            sb.append(i).append(chars[i]);
        }
        resp.put("content", sb.toString());
        product.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        product.setAmount(chars.length);
        resp.put("product", product);
        return resp;
    }
}
