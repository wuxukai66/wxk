package com.example.demo.controller;

import com.example.demo.config.AppFinal;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.UserInfo;
import com.example.demo.tools.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * author 武旭凯
 * date: 2021/7/31 14:52
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {
        @Resource
    private UserMapper userMapper;
    /**
     * 用户注册
     * @return
     */
    @RequestMapping("/reg")
    public ResponseBody<Integer> register(UserInfo userInfo){
        int data=userMapper.register(userInfo);
        return new ResponseBody<>(0,"",data);
    }

    /**
     * 查询所有用户列表
     * @return
     */
    @RequestMapping("/ulist")
    public ResponseBody<List<UserInfo>> getUserList(){
            List<UserInfo> data=new ArrayList<UserInfo>();
            data=userMapper.getUserList();
            return new ResponseBody<>(0,"",data);

    }

    /**
     * 登陆方法
     * @return
     */
    @RequestMapping("/login")
    public ResponseBody<UserInfo> login(UserInfo userInfo, HttpServletRequest request){
        UserInfo user=userMapper.login(userInfo);
           if(user !=null && user.getId()>0){
               //登陆成功，存储session
               HttpSession session=request.getSession();
               session.setAttribute(AppFinal.USERINFO_SESSION_KEY,user);
           }
        return new ResponseBody<>(0,"",user);
    }
    @RequestMapping("/islogin")
    public ResponseBody<UserInfo> isLogin(HttpServletRequest request){
        UserInfo userInfo=null;
        HttpSession session=request.getSession(false);
        if(session !=null && session .getAttribute(AppFinal.USERINFO_SESSION_KEY)!=null){
            //获取用户id
            userInfo=(UserInfo) session .getAttribute(AppFinal.USERINFO_SESSION_KEY);
        }
        return new ResponseBody<>(0,"",userInfo);
    }
    @RequestMapping("/logout")
    public ResponseBody<Integer> logout(HttpServletRequest request){
        int data=0;
        HttpSession session=request.getSession(false);
        if(session!= null && session.getAttribute(AppFinal.USERINFO_SESSION_KEY)!=null){
            session.removeAttribute(AppFinal.USERINFO_SESSION_KEY);
            data=1;
        }
        return new ResponseBody<>(0,"",data);
    }
}
