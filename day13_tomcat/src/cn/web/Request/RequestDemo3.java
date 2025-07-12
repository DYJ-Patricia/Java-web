package cn.web.Request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/Demo3")
public class RequestDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String agent= request.getHeader("User-Agent");
        System.out.println("User-Agent:"+agent);
        String refer=request.getHeader("Referer");
        System.out.println("refer:"+refer);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
