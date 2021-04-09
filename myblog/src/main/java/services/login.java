package services;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.Search;
import dao.userInfoDao;
import models.UserInfo;
import utils.ResultJSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;

public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int succ=-1;
        String msg="";
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if(username!=null&&!username.equals("")&&password!=null&&!password.equals("")){

            userInfoDao userInfoDao = new userInfoDao();
            try {
                // 查询数据库
                UserInfo userInfo = userInfoDao.getUser(username, password);
                if (userInfo.getId() > 0) {
                    // 查到用户了，也就是用户名和密码是正确
                    succ = 1;
                    // 将用户信息存放到 session
                    HttpSession session = request.getSession(); // 用来创建会话
                    // 将用户信息存放到当前session
                    session.setAttribute("userinfo", userInfo);
                } else {
                    succ = 0;
                    msg = "用户名或密码输出错误！";
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else {
            // 参数不完整，非法请求
            msg = "非法请求，参数不完整";
        }
        HashMap<String, Object> result = new HashMap<>();
        result.put("succ", succ);
        result.put("msg", msg);
        ResultJSON.write(response, result);
        }

    }

