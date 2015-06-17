package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Usuario;

@WebServlet("/validaLogin")
public class ValidaLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ValidaLoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
	
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		String urlRedirecionamento = "/login";
		String mensagem = null;
		
		
		if (usuario.equals("") || usuario == null) {
			mensagem = "Usuário inválido!";
		} else if (senha.equals("") || senha == null) {
			mensagem = "Senha inválida!";
		} else if (usuario.equals("aluno") && senha.equals("impacta123")) {
			mensagem = "Usuário autenticado em nosso sistema!";
			Usuario user = new Usuario(usuario, senha);
			request.getSession().setAttribute("usuario", user);
			urlRedirecionamento = "/sistema";
		} else {
			mensagem = "Dados de acesso inválidos!";
		}
		
		request.setAttribute("mensagem", mensagem);
		RequestDispatcher dispatcher = request.getRequestDispatcher(urlRedirecionamento);
		dispatcher.forward(request, response);
	}

}
