package services;

import dao.ArticleInfoDao;
import models.VO.ArticleInfoVO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/artlist")
public class ListArticleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int succ=-1;
        String msg="";

        List<ArticleInfoVO> list=null;
        int page=Integer.parseInt(req.getParameter("page"));
        int prize=Integer.parseInt(req.getParameter("prize"));
        ArticleInfoDao articleInfoDao=new ArticleInfoDao();
        list=articleInfoDao.getListByPage(page,prize);
    }
}
