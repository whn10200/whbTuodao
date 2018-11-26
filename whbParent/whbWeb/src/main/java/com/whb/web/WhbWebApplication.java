package com.whb.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author whb
 * @date 2018年9月27日 下午4:06:07 
 * @Description: TODO
 */
@SpringBootApplication(scanBasePackages = "com.whb.web")
@ServletComponentScan(value="com.whb.web.config.doFilter")  //配合@WebFilter使用
public class WhbWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhbWebApplication.class, args);
	}
}
