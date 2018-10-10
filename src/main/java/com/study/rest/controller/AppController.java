package com.study.rest.controller;

import com.study.rest.entity.Remind;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController // метод будет возвращать только JSON объекты
@RequestMapping(value = "/hello")
public class AppController {
    @RequestMapping(value = "/world", method = RequestMethod.GET)
    @ResponseBody
    public Remind getHello(){
        return createMockRemaind();
    }

    private Remind createMockRemaind() {
        Remind remind = new Remind();
        remind.setId(1);
        remind.setRemindDate(new Date();
        remind.setTitle("My first remind");
        return remind;
    }
}
