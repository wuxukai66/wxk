package com.example.demo.controller;

import com.example.demo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    @RequestMapping("/login")
    @ResponseBody//当前方法返回为数据而非视图
    public String login(User user, HttpServletRequest request){
        if(user.getUsername().equals("root")&&user.getPassword().equals("root")){
            //登录信息存储到session
            HttpSession session=request.getSession();
            session.setAttribute("userinfo",user);
            return "登陆成功";
        }
        return "登陆失败";
    }

}
