package com.wubin.datacenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.citic.datacenter.dao")
@EnableAutoConfiguration(exclude = {
	org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
public class DatacenterApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DatacenterApplication.class, args);
	}
	
}
