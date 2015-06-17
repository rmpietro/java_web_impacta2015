package servlets;

import java.io.IOException;

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

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		//Passos para implementa��o do Servlet:
		//Captura de par�metros passados
		//Valida��o dos par�metros e configura��o de mensagem de retorno
		//Configura��o da url para navega��o conforme seja a valida��o:
			//Caso seja com sucesso, encaminhamento para a p�gina inicial do sistema
			//Caso seja invalidada, encaminhamento para a tela de login com envio de
				//mensagem de erro anexada como atributo.
		
		String usuario = request.getParameter("login");
		String senha = request.getParameter("senha");
		String message = null;
		String urlForward = "login.jsp";
		
		if (usuario == null || usuario.equals("")) {
			message = "Insira um usu�rio v�lido";
		} else if (senha == null || senha.equals("")) {
			message = "Insira uma senha v�lida";
		} else if (!(usuario.equals("aluno") && senha.equals("impacta123"))) {
			message = "Usu�rio ou senha digitados n�o conferem!";
		} else {
			urlForward = "sistema.jsp";
		}
		
		request.setAttribute("message", message);
		RequestDispatcher dispatcher = request.getRequestDispatcher(urlForward);
		dispatcher.forward(request, response);
	}
}




