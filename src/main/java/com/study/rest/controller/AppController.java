package com.study.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/hello")
public class AppController {
    @RequestMapping(value = "/world", method = RequestMethod.GET)
    @ResponseBody
    public String getHello(ModelMap model){
        return "helloWorld";
    }
}
