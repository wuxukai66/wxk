package services;

import dao.ArticleInfoDao;
import models.UserInfo;
import utils.ResultJSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

@WebServlet("/addart")
public class AddArtServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int succ = -1;
        String msg = "";
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        HttpSession session = req.getSession(false);
        if (session != null && session.getAttribute("userinfo") != null) {
            UserInfo userInfo = (UserInfo) session.getAttribute("userinfo");
            ArticleInfoDao articleInfoDao = new ArticleInfoDao();
            try {
                succ = articleInfoDao.add(title, content, userInfo.getId());
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        } else {
            msg = "请先登录!";
        }
        HashMap<String, Object> result = new HashMap<>();
        result.put("succ", succ);
        result.put("msg", msg);
        ResultJSON.write(resp, result);
    }
}