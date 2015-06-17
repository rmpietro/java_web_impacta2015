package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/capturadados")
public class CapturaDados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CapturaDados() {
        super();
    }

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		if (request.getCharacterEncoding() == null) {
		    request.setCharacterEncoding("UTF-8");
		}
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Cadastro realizado com sucesso!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Cadastro realizado com sucesso!</h1>");
		out.println("<h4>Nome:</h4> " + request.getParameter("nome"));
		out.println("<h4>E-mail:</h4> " + request.getParameter("email"));
		out.println("<h4>Deseja receber nossa newsletter?:</h4> " + 
				request.getParameter("newsletter"));
		out.println("<h4>Posição em que trabalha:</h4> " + 
				request.getParameter("posicao"));
		out.println("<h4>Impressões:</h4> \n" + request.getParameter("impressoes"));
		out.println("<body>");
		out.println("</html>");
	}
}




