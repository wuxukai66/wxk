package com.example.demo.controller;

import com.example.demo.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * author 武旭凯
 * date: 2021/6/27 11:30
 */

@RequestMapping("/mvc")
//@Controller//保证Spring初始化此类的
//@ResponseBody
@RestController
@Slf4j
public class MVCController {
    @Autowired
    private ObjectMapper objectMapper;

    @RequestMapping(value="/index6",method = RequestMethod.GET)
    @ResponseBody//返回自定义的类型，而非视图
    public String getIndex6(){
        return  "index.html";
    }

    @RequestMapping("/index5")
    public User getindex5(){
        User user=new User();
        user.setUsername("java");
        user.setPassword("hello");
        return  user;
    }





    @RequestMapping("/index4")
    @ResponseBody//返回自定义的类型，而非视图

    public String getIndex4() throws JsonProcessingException {
        User user=new User();
        user.setUsername("java");
        user.setPassword("hello");
        //将对象转换为JSON字符串
        String result=objectMapper.writeValueAsString(user);
        log.error(result);

        return result;
    }


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
