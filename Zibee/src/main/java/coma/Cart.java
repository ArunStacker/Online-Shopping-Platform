package coma;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cart")
public class Cart extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the count value from request
        String countStr = request.getParameter("count");
        int count = 0;
        try {
            count = Integer.parseInt(countStr);
        } catch (NumberFormatException e) {
            // Handle parse error if necessary
        }
        
        // Use the count as needed
        System.out.println("Count received: " + count);
    }}