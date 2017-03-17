package br.edu.ifpb.ads.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="adicionaContato", urlPatterns={"/cadastro", "/adicionaContato"})
public class PrimeiroServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		
		PrintWriter out = resposta.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("Nome: "+requisicao.getParameter("nome")+"<br/>");
		out.println("E-mail: "+requisicao.getParameter("email")+"<br/>");
		out.println("Telefone: "+requisicao.getParameter("telefone")+"<br/>");
		out.println("Data de Nascimento: "+requisicao.getParameter("dataNascimento"));
		out.println("</body>");
		out.println("</html>");
		
	}
	
}
