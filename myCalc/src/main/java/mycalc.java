import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class mycalc extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setCharacterEncoding("utf-8");
            response.setContentType("text/html");
            String num1=request.getParameter("num1");
            String num2=request.getParameter("num2");
            int total=Integer.parseInt(num1)+Integer.parseInt(num2);
        PrintWriter writer=response.getWriter();
        writer.println("结果是："+total);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doPost(request,response);
    }
}
