package com.whb.web.config.interceptor;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

public class WhbInterceptorConfig extends WebMvcConfigurationSupport {
	
	/*@Resource
	WhbWebInterceptor whbWebInterceptor;*/

	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new WhbWebInterceptor()).addPathPatterns("/**");
		super.addInterceptors(registry);
	}
}
