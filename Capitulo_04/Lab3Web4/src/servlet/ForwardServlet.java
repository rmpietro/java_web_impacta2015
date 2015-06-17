package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ForwardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		int paramRecebido = Integer.parseInt(request.getParameter("chave"));
		if (paramRecebido == 1) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("params");
			dispatcher.forward(request, response);
		} else if (paramRecebido == 2) {
			response.sendRedirect("http://www.impacta.com.br");
		} else {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Erro!</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>O parâmetro passado é inválido!</h1>");
			out.println("<body>");
			out.println("</html>");
		}
	}

}
