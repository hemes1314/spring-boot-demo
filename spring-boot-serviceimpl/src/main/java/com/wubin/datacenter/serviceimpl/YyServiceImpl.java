package com.wubin.datacenter.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wubin.datacenter.dao.demo.YyMapper;
import com.wubin.datacenter.model.demo.YyBean;
import com.wubin.datacenter.service.demo.YyService;

@Service
public class YyServiceImpl implements YyService {

	@Resource
	private YyMapper yyMapper;
	
	@Override
	public List<YyBean> findAll() {

		return yyMapper.findAll();
	}

}
