package com.whb.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author whb
 * @date 2018年9月28日 下午2:00:51 
 * @Description: TODO
 */
@Controller
public class TestController {
	
	Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/test")
    public ModelAndView index(ModelAndView modelAndView) {
    	logger.info("test开始了");
        modelAndView.setViewName("index");
        modelAndView.addObject("title", "拓道金服电子合同！");
        return modelAndView;
    }
}
