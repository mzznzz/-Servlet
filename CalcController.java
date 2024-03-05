package ch08;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CalcController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		String opp = request.getParameter("op");
		
		long result = 0;
		
		switch(request.getParameter("op")) {
			case "+": result = n1+n2;break;
			case "-": result = n1-n2;break;
			case "/": result = n1/n2;break;
			case "*": result = n1*n2;break;
		}
		request.setAttribute("result", result);
		request.setAttribute("n1", n1);
		request.setAttribute("n2", n2);
		request.setAttribute("op", opp);
		getServletContext().getRequestDispatcher("/ch08/calcResult.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
