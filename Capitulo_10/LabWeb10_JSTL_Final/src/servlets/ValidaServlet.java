package servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validaServlet")
public class ValidaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ValidaServlet() {
        super();
     }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String usuario = request.getParameter("login");
		String senha = request.getParameter("senha");
		String message = null;
		String urlForward = "login.jsp";
		
		if (usuario == null || usuario.equals("")) {
			message = "Insira um usuário válido";
		} else if (senha == null || senha.equals("")) {
			message = "Insira uma senha válida";
		} else if (!(usuario.equals("aluno") && senha.equals("impacta123"))) {
			message = "Usuário ou senha digitados não conferem!";
		} else {
			urlForward = "sistema.jsp";
		}
		
		request.setAttribute("message", message);
		RequestDispatcher dispatcher = request.getRequestDispatcher(urlForward);
		dispatcher.forward(request, response);
	}
}




