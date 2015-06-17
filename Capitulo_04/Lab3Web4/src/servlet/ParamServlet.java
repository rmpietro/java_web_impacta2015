package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParamServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	public ParamServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Parâmetros Lidos:</title></head");
		out.println("<body>");
		out.println("<h1>Parâmetros Lidos:</h1>");
		out.println("<h3>Usuário: </h3>" + getServletContext().getInitParameter("usuario"));
		out.println("<h3>Senha: </h3>" + getServletContext().getInitParameter("senha"));
		out.println("<h3>Nome do Aluno: </h3>" + getServletConfig().getInitParameter("nome"));
		out.println("<h3>Senha: </h3>" + getServletConfig().getInitParameter("email"));
		out.println("<body>");
		out.println("</html>");
	}

}
