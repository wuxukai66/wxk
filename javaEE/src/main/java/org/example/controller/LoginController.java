package org.example.controller;

import org.example.Service.LoginService;
import org.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

/**
 * author 武旭凯
 * date: 2021/6/8 10:44
 */
@Controller
public class LoginController {


    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    //第一种注入(查询)，属性注入
        //@Autowired
    private LoginService loginService;
    public void sayHi(){
        //参数检验
        loginService.sayHi();
    }

   @Bean
            public User user1(){
                User user=new User();
                user.setName("悟空");
                user.setPassword("呆子");
                return user;
            }
    @Bean
    public User user2(){
        User user=new User();
        user.setName("八戒");
        user.setPassword("2呆子");
        return user;
    }


}
