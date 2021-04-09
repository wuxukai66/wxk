package services;

import dao.ArticleInfoDao;
import utils.ResultJSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
@WebServlet("/upart")
public class UpdataServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int succ=-1;
        String msg="";
        int id=Integer.parseInt(req.getParameter("id"));
        String title=req.getParameter("title");
        String content=req.getParameter("content");
        if(title!=null&&id>0&&content!=null&&!title.equals("")&&!content.equals("")){
            ArticleInfoDao articleInfoDao=new ArticleInfoDao();
            try {
                succ=articleInfoDao.upArt(id,title,content);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }else{
            msg="无效的参数";
        }
        HashMap<String, Object> result = new HashMap<>();
        result.put("succ", succ);
        result.put("msg", msg);
        ResultJSON.write(resp, result);
    }
}
