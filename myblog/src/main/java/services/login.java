package services;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.Search;
import dao.userInfoDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

            Search search=new Search();
            try {
                succ=search.search(username,password);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        PrintWriter writer=response.getWriter();
        ObjectMapper mapper=new ObjectMapper();
        HashMap<String,Object> map=new HashMap<>();
        map.put("succ",succ);
        map.put("msg",msg);
        String str=mapper.writeValueAsString(map);
        writer.println(str);
    }
}
