package com.whb.web.config.doFilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.springframework.core.annotation.Order;

/**
 * @author whb
 * @date 2018年11月26日 下午2:44:21 
 * @Description: 另一种方式的过滤器
 */
@Order(value=2)
@WebFilter
public class OtherWhbWebFilter implements Filter{
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		Filter.super.init(filterConfig);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("另一种方式的过滤器开始了...");
		chain.doFilter(request, response);
	}

}
