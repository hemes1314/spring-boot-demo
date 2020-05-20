package com.wubin.datacenter.action.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wubin.datacenter.model.demo.YyBean;
import com.wubin.datacenter.service.demo.YyService;

@Controller
@RequestMapping("/demo")
public class DemoAction {
	
	private static final Logger logger = LogManager.getLogger(DemoAction.class.getName());

	@Resource
	private YyService yyService;
	
	@RequestMapping(value="/index/{id}",method = RequestMethod.GET)
    public @ResponseBody
    String hello(@PathVariable(value = "id") String  id){

		logger.info("hello......");
        return id+"hello";
    }
	
	@RequestMapping("/hello")
	@ResponseBody
	Map<String, Object> hello() {
		ArrayList<String> users =  new ArrayList<String>(){{
            add("freewolf");
            add("tom");
            add("jerry");
        }};
		Map<String, Object> map = new HashMap<>();
		map.put("status", 0);
		map.put("message", "");
		map.put("result", users);
		return map;
	}
	
	@RequestMapping("/yyList")
	@ResponseBody
	List<YyBean> yyList() {
		return yyService.findAll();
	}
}
