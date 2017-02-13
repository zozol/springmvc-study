package com.fuqiu.spring.mvc.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author fuqiu.lzh 2/11/17 11:30 AM
 */
@org.springframework.stereotype.Controller
public class HomeController {

    public HomeController() {
        System.out.println("hello");
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "welcome to spring mvc");
        mav.setViewName("home");
        return mav;
    }
}
