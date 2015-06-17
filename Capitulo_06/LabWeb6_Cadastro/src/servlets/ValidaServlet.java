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
	}
}




