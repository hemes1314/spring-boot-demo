package com.wubin.datacenter.dao.demo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wubin.datacenter.model.demo.YyBean;

@Repository
public interface YyMapper {

	public List<YyBean> findAll();
}
