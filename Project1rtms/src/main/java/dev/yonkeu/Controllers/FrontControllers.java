package dev.yonkeu.Controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface FrontControllers {
    void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;
}
