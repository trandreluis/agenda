package br.edu.ifpb.ads.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiroServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		
		PrintWriter out = resposta.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("Seja bem-vindo! - response by: servlet");
		out.println("</body>");
		out.println("</html>");
		
	}
	
}
