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
		//Passos para implementa��o do Servlet:
		//Obtenha a sess�o atual do usu�rio logado
		//Verifique se a sess�o capturada existe ou � v�lida e,
		//nesse segundo caso, invalide-a.
		//Redirecione o usu�rio para a p�gina de login inicial da aplica��o.
	}

}
