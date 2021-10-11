package dev.yonkeu.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.yonkeu.models.Users;
import dev.yonkeu.services.UsersServices;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UsersServlet extends HttpServlet {

    ObjectMapper om = new ObjectMapper();
    UsersServices usersService = new UsersServices();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().write(om.writeValueAsString(usersService.getAllUsers()));
    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        Users u = om.readValue(request.getReader(), Users.class);
//        u.setEmp_id((usersService.add(a).getId()));
//
//        response.getWriter().write(om.writeValueAsString(u));
//    }


}
