package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/oi")
public class OiMundoServelet extends HttpServlet {
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException  {
			
	PrintWriter out = resp.getWriter();	
	out.println("<html>");
	out.println("<body>");
	out.println("ola mundo");
	out.println("</body>");
	out.println("</html>");
		
	System.out.println("Funciona");
	}
}
