package priv.tdll.study.proj1.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import priv.tdll.study.proj1.service.SearchService;

@Controller
public class IndexController {

    @Autowired
    private SearchService searchService;

    @ResponseBody
    @RequestMapping(value = "/index.do", method = RequestMethod.GET)
    public JSONObject index () throws Exception{
        JSONObject resp = new JSONObject();
        resp.put("v1", "123");
        resp.put("v2", "aa23");

        return resp;
    }

    @ResponseBody
    @RequestMapping(value = "/search.do", method = RequestMethod.POST)
    public JSONObject search (@RequestBody JSONObject param) throws Exception{
        String keyword = param.getString("keyword");
        return searchService.search(keyword);
    }

}
