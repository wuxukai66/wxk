package services;

import dao.ArticleInfoDao;
import models.ArticleInfo;
import models.UserInfo;
import utils.ResultJSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

public class myarticle extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            int succ=-1;
            String msg="";
        List<ArticleInfo> list=null;
        HttpSession session=request.getSession(false);
        if(session==null){
            msg="请先登录！";
        }else{
            UserInfo userinfo=(UserInfo) session.getAttribute("userinfo");
            int uid=userinfo.getId();
            ArticleInfoDao articleInfoDao = new ArticleInfoDao();
            try {
                list=articleInfoDao.getListByUID(uid);
                succ=1;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            HashMap<String, Object> result = new HashMap<>();
            result.put("succ", succ);
            result.put("msg", msg);
            result.put("list", list);
            ResultJSON.write(response,result);
        }

    }
}
