package demo.Controller;

import demo.Service.DemoService;
import demo.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author:dongwn
 * @Description:
 * @Date: 2018/9/18 15:04
 * @Version: ean-basicV1.0
 */
@WebServlet(name = "SimpleServlet",urlPatterns = "/simple")
public class DemoController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        User user = new User();
        user.setUsername("张三");
        out.write(DemoService.sayHello());
        out.write(user.getUsername());
        out.close();
    }

}
