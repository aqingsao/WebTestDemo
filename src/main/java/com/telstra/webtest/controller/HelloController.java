package com.telstra.webtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping("hello")
    public ModelAndView hello() {
        System.out.println("Hello----------");
        return new ModelAndView("hello");
    }
    @RequestMapping("/")
    public void test(){
        System.out.println("test-------");
    }
}
