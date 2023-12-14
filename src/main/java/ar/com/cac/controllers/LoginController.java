package ar.com.cac.controllers;

import java.io.IOException;

import ar.com.cac.entity.User;
import ar.com.cac.repository.LoginRepository;
import ar.com.cac.repository.MySQLLoginRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/auth/login")
public class LoginController extends HttpServlet{

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //validaciones

        LoginRepository repository = new MySQLLoginRepository();

        User user =  repository.login(username, password);

        //crar el token para enviar al front
        response.setStatus(HttpServletResponse.SC_CREATED);//201

        response.addHeader("token", user.getNombre());
        response.getWriter().print(user.getNombre());
    }
}