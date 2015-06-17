package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/sair")
public class SairServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SairServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		//Passos para implementação do Servlet:
		//Obtenha a sessão atual do usuário logado
		//Verifique se a sessão capturada existe ou é válida e,
		//nesse segundo caso, invalide-a.
		//Redirecione o usuário para a página de login inicial da aplicação.
	}

}
