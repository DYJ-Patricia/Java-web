package cn.itcast.web.servlet;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User loginuser = new User();
        loginuser.setUsername(username);
        loginuser.setPassword(password);

        UserDao dao = new UserDao();
        User user = dao.login(loginuser);

        if (user == null)
            request.getRequestDispatcher("failServlet").forward(request, response);
         else {
            //登录成功
           request.setAttribute("user", user);
           request.getRequestDispatcher("successServlet").forward(request, response);

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
