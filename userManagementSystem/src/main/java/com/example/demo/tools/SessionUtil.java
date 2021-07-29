package com.example.demo.tools;

import com.example.demo.model.UserInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * author 武旭凯
 * date: 2021/7/24 10:30
 */
public class SessionUtil {
    /**
     * 获取session中的用户对象
     * @param request
     * @return
     */
    public static UserInfo getUserBySession(HttpServletRequest request){
        HttpSession session=request.getSession(false);
        UserInfo userInfo= null;
        if(session!=null &&
                (userInfo= (UserInfo)session.getAttribute(AppFinal.USERINFO_SESSIONKEY))!=null){

        }
        return userInfo;
    }
}
