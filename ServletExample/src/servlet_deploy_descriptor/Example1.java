package servlet_deploy_descriptor;

import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Example1 extends HttpServlet {

  
    public Example1() {
        super();
        // TODO Auto-generated constructor stub
    }; // End of Constructor

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.write("<h1>This is First Example of Servlet</h1>");
	}; //End of Get Method

	
}; //End of Class
