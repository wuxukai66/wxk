package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author 武旭凯
 * date: 2021/6/27 11:30
 */
@Controller//保证Spring初始化此类的
@RequestMapping("/mvc")
@Slf4j
public class MVCController {
    @RequestMapping("/index")
    public String getIndex(){
log.error("我是Index.html");
        return "redirect:/index.html";
    }
    @RequestMapping("/index3")
    public String getIndex2(){
        log.error("我是请求转发");
        return "forward:/index.html";
    }
}
