package dev.yonkeu.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.yonkeu.services.UsersServices;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class loginController implements FrontControllers {
    private UsersServices userservices = new UsersServices();
    private ObjectMapper om = new ObjectMapper();
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Integer level = userservices.Adminlevel(username);
        System.out.println("user level:" + level);

        if (userservices.login(username, password)){
            switch(level){
                case 1: //Requestor
                    response.sendRedirect("static/Requestor.html");
                    break;
                case 2: //Direct Supervisor
                    response.sendRedirect("static/DirSup.html");
                    break;
                case 3: //Department head
                    response.sendRedirect("static/DepHead.html");
                    break;
                case 4: //Benefit Coordinator
                    response.sendRedirect("static/Benco.html");
                    break;
                default:

                    response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unsuccesful login, Please try again");
                    break;
            }
        }
    }
}
