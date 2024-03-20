package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Login", value = "/Login")
public class Login extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getMethod().toUpperCase();
        switch (method) {
            case "GET":
                doGet(req, resp);
                break;
            case "POST":
                doPost(req, resp);
                break;
        }
    }

}
