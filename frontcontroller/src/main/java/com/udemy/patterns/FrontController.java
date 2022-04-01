package com.udemy.patterns;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FrontController", value = "*.do")
public class FrontController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        CommandHelper commandHelper = new CommandHelper();
        Command command = commandHelper.getCommand(requestURI);
        String view = command.execute(request,response);
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.dispatch(request,response,view);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
