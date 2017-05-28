package full_length_example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name ="CurrencyServlet", urlPatterns={"/currency"})
public class CurrencyServlet extends HttpServlet {

	public static double Rate =66;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String Samount = request.getParameter("amount");
		if(Samount!=null){
			double amount =Double.parseDouble(Samount);
			double usd =amount/Rate;
			pw.println("USD ="+ usd);
		}else if(Samount.isEmpty()){
			pw.write("<h3>Amount is required!</h3>");
		}
		
		
	}; // End of Method Get

}; //End of class
