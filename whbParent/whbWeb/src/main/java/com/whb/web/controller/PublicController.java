package com.whb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author whb
 * @date 2018年9月28日 下午2:00:51 
 * @Description: TODO
 */
@Controller
public class PublicController {

    @RequestMapping(value = "/")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        modelAndView.addObject("title", "拓道金服电子合同！");
        return modelAndView;
    }
}
