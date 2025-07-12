package cn.itcast.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/RequestDemo1")
public class Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Demo1的doPost方法被执行了");
        String msg = (String) request.getAttribute("msg");
        System.out.println(msg);
        request.setCharacterEncoding("utf-8");
        BufferedReader br=request.getReader();
        String line=null;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
}
