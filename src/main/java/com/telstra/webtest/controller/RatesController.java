package com.telstra.webtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/rates")
public class RatesController {
    @RequestMapping("/")
    public ModelAndView index() {
        ModelMap model = new ModelMap();
        return new ModelAndView("rates/index", model);
    }
}
