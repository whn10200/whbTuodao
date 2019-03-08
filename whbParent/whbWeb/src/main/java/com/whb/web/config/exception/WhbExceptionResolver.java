package com.whb.web.config.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author whb
 * @date 2018年11月29日 下午1:53:36 
 * @Description: 自定义异常返回配置
 */
@Component
public class WhbExceptionResolver implements HandlerExceptionResolver {
	
	Logger logger = LoggerFactory.getLogger(WhbExceptionResolver.class);

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		logger.info("统一异常日志输出："+ex.getMessage());
		request.setAttribute("exception", ex.toString());
		request.setAttribute("exceptionStack", ex);
		return new ModelAndView("error/exception");
	}

}
