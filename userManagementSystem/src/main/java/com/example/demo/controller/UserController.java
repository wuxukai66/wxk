package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.UserInfo;
import com.example.demo.tools.AppFinal;
import com.example.demo.tools.ResponseBody;
import com.example.demo.tools.SessionUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

/**
 * author 武旭凯
 * date: 2021/7/22 17:50
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserMapper userMapper;

    //登陆方法
    @RequestMapping("/login")
    public ResponseBody<UserInfo> login(@RequestParam String username, @RequestParam String password
            , HttpServletRequest request) {
        UserInfo userInfo = userMapper.login(username, password);
        int status = -1;
        String message = "用户名或者密码错误";
        if (userInfo != null && userInfo.getId() > 0) {
            //登陆成功
            status = 0;
            message = "";
            //将用户信息存储到session中
            HttpSession session = request.getSession();
            session.setAttribute(AppFinal.USERINFO_SESSIONKEY, userInfo);
        }
        return new ResponseBody<>(status, message, userInfo);


    }

    //查询当前登陆用户的权限
    @RequestMapping("/checkadmin")
    public ResponseBody<Integer> checkAdmin(HttpServletRequest request) {
        int data = 0;
        HttpSession session = request.getSession(false);
        UserInfo userInfo = null;
        if (session != null && (userInfo = (UserInfo) session.getAttribute(AppFinal.USERINFO_SESSIONKEY)) != null) {
            data = userInfo.getIsadmin();
        }


        return new ResponseBody<>(0, "", data);
    }

    //添加用户方法
    @RequestMapping("/add")
    public ResponseBody<Integer> add(UserInfo userInfo, HttpServletRequest request) {
        int data = 0;
        int status = 0;
        String message = "";

        //安全效验
        UserInfo user = SessionUtil.getUserBySession(request);
        if (user == null) {
            status = -1;
            message = "未登录，请先登录";
        } else if (userInfo.getIsadmin() == 1) {//要添加一个超级管理员
            if (user.getIsadmin() == 0) {
                status = -2;
                message = "权限不够";
            } else if (user.getIsadmin() == 1) {
                //当前登录用户为超级管路员
                data = userMapper.add(userInfo);
                status = 0;
            }

        } else if (userInfo.getIsadmin() == 0) {
            data = userMapper.add(userInfo);
        }
        return new ResponseBody<>(status, message, data);
    }

    @RequestMapping("/getuser")
    public ResponseBody<UserInfo> getUser(@RequestParam int uid) {

        int status = -1;
        String message = "未知错误";
        UserInfo userInfo = userMapper.getUser(uid);
        if (userInfo != null) {
            //todo:权限检验
            status = 0;
            message = "";
        }
        return new ResponseBody<>(status, message, userInfo);
    }

    @RequestMapping("/update")
    public ResponseBody<Integer> update(UserInfo userInfo) {
        int data = 0;
        data = userMapper.update(userInfo);
        return new ResponseBody<>(0, "", data);
    }

    @RequestMapping("/list")
    public ResponseBody<HashMap<String, Object>> getList(String name, String address, String email, int cpage,
                                                         int psize, HttpServletRequest request) {

        //权限检验
        UserInfo userInfo = SessionUtil.getUserBySession(request);
        if (userInfo == null) {
            return new ResponseBody<>(-1, "当前用户未登录", null);
        }
        Integer isadmin = null;
        if (userInfo.getIsadmin() == 0) {
            isadmin = 0;
        }
        name = name.equals("") ? null : name;
        address = address.equals("") ? null : address;
        email = email.equals("") ? null : email;
        //跳过查询的条数
        int skipCount = 0;
        skipCount = (cpage - 1) * psize;
        //查询一页的列表信息
        List<UserInfo> list = userMapper.getListBypage(name, address, email, skipCount, psize, isadmin);
        //查询满足条件的数据条数
        int tcount = userMapper.getCount(name, address, email, isadmin);
        //总页数
        int tpage = (int) Math.ceil(tcount / (psize * 1.0));
        HashMap<String, Object> data = new HashMap<>();
        data.put("list", list);
        data.put("tcount", tcount);
        data.put("tpage", tpage);
        return new ResponseBody<>(0, "", data);
    }

    @RequestMapping("/del")
    public ResponseBody<Integer> del(@RequestParam int id, HttpServletRequest request) {
        //todo:权限效验
        UserInfo userInfo = SessionUtil.getUserBySession(request);
        if (userInfo == null) {
            //未登录
            return new ResponseBody<>(-1, "未登录", 0);
        }
        //判断删除的是不是自己
        if (id == userInfo.getId()) {
            //删除的是自己
            return new ResponseBody<>(-2, "不能删除自己", 0);
        }

        Integer isadmin = null;
        if (userInfo.getIsadmin() == 0) {
            isadmin = 0;
        }
        int result = userMapper.del(id, isadmin);
        return new ResponseBody<>(0, "", result);
    }

    //多条数据的删除
    @RequestMapping("dels")
    public ResponseBody<Integer> dels(String ids) {
        int result = 0;
        result = userMapper.dels(ids.split(","));
        return new ResponseBody<>(0, "", result);
    }
}