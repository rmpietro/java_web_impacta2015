package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Usuario;

@WebServlet("/sistema")
public class TelaSistemaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TelaSistemaServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		
		Usuario user = (Usuario)request.getSession().getAttribute("usuario");

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Sistema de Cadastro</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>" + request.getAttribute("mensagem") + "</h1>");
		out.println("Bem vindo ao sistema, Sr./Sra. " + user.getUsuario());
		out.println("<br /><br /><br /><br />");
		out.println("<a href='logout'>Sair do Sistema</a>");		
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}



