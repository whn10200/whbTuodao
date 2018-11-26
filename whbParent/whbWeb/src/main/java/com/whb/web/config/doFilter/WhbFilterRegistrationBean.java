package com.whb.web.config.doFilter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author whb
 * @date 2018年11月26日 下午2:54:30 
 * @Description: 注册过滤器(1:这是一种方式)
 */
@Configuration
public class WhbFilterRegistrationBean {
	
	@Bean
	public FilterRegistrationBean<WhbWebFilter> testFilterRegistration() {
		 
		   FilterRegistrationBean<WhbWebFilter> registration = new FilterRegistrationBean<WhbWebFilter>();
		   registration.setFilter(new WhbWebFilter());
		   registration.addUrlPatterns("/*");
		   registration.addInitParameter("paramName", "paramValue");
		   registration.setName("whbWebFilter");
		   registration.setOrder(1);
		   return registration;
		 }
	
	

}
