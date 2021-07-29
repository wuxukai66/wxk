package com.example.demo.config;

import com.example.demo.tools.AppFinal;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * author 武旭凯
 * date: 2021/7/29 10:40
 */
public class LoginIntercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute(AppFinal.USERINFO_SESSIONKEY) != null) {
            //登录状态
            return true;
        }

        return false;
    }
}
