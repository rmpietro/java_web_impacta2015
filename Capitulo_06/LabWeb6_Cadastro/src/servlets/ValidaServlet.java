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
		//Passos para implementação do Servlet:
		//Captura de parâmetros passados
		//Validação dos parâmetros e configuração de mensagem de retorno
		//Configuração da url para navegação conforme seja a validação:
			//Caso seja com sucesso, encaminhamento para a página inicial do sistema
			//Caso seja invalidada, encaminhamento para a tela de login com envio de
				//mensagem de erro anexada como atributo.
	}
}




