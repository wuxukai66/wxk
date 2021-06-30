package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author 武旭凯
 * date: 2021/6/27 10:32
 */
@Controller
@RequestMapping("/user")
@Slf4j
public class MyController {
    //创建一个当前类的日志对象
    //private Logger logger= LoggerFactory.getLogger(MyController.class);
    @RequestMapping("/index2")
    public String index(String name) {
        if(name==null||name.equals("")){
            log.error("我的日志信息，级别，error");
        }
        log.info("我的日志信息，级别，info");
        log.debug("我的日志信息，级别，debug");
        log.warn("我的日志信息，级别，warn");
        log.trace("我的日志信息，级别，trace");
        return null;
    }
}
