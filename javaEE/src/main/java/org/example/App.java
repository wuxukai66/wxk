package org.example;

import javafx.application.Application;
import org.example.controller.LoginController;
import org.example.controller.URLController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.awt.AppContext;

/**
 * author 武旭凯
 * date: 2021/6/8 10:32
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //LoginController loginController= (LoginController) context.getBean("loginController");
        //System.out.println(loginController);
        LoginController loginController=context.getBean(LoginController.class);
        LoginController loginController2= (LoginController) context.getBean("loginController");
        System.out.println(loginController==loginController2);

//        URLController urlController= (URLController) context.getBean("URLController");
//        System.out.println(urlController);
        //关闭容器
        ((ClassPathXmlApplicationContext)context).close();
    }
}
