package com.whb.web.config.doFilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author whb
 * @date 2018年11月26日 下午2:44:21 
 * @Description: 过滤器
 */
public class WhbWebFilter implements Filter{
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		Filter.super.init(filterConfig);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("使用过滤器开始...");
		chain.doFilter(request, response);
	}

}
