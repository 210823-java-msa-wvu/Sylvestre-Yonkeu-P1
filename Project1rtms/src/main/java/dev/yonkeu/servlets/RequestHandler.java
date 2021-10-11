package dev.yonkeu.servlets;

import dev.yonkeu.Controllers.FrontControllers;
import dev.yonkeu.Controllers.loginController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RequestHandler {
    private Logger log = LogManager.getLogger(RequestHandler.class);

    // A map to hold the different controllers that we will be creating
    private Map<String, FrontControllers> controllerMap;

    {
        controllerMap = new HashMap<String, FrontControllers>();
        controllerMap.put("Users", new loginController());

//        controllerMap.put("authors", new AuthorController());
//        controllerMap.put("login", new LoginController());
//        controllerMap.put("users", new UserController());
    }

    // a method to return the appropriate controller
    public FrontControllers handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // This is where the logic will go to parse the URI and send back the appropriate controller
        StringBuilder uriString = new StringBuilder(request.getRequestURI()); // uri = /LibraryServlet/books/1
        System.out.println(uriString);

        // Remove context path
        uriString.replace(0, request.getContextPath().length() + 1, ""); // now we have => books/1
        System.out.println(uriString);

         //check first if there is a '.' - aka are we trying to access a static resource
//        if (uriString.indexOf(".") != -1) {
//            request.setAttribute("static", uriString.toString());
//            return (req, resp) -> {
//               req.getRequestDispatcher("/static/books.html").forward(req, resp);
//            };
//        }

        if (uriString.indexOf("html") != -1) {
            request.setAttribute("static", uriString.toString());
            return controllerMap.get(uriString.toString());
        }

        if (uriString.indexOf("/") != -1) {
            request.setAttribute("path", uriString.substring(uriString.indexOf("/") + 1)); // this will set the attribute 'path' to '1'
            uriString.replace(uriString.indexOf("/"), uriString.length() +1, ""); // at this point uriString = 'books'
        }

        return controllerMap.get(uriString.toString());

    }
}
