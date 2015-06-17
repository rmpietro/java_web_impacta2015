package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class TelaLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TelaLoginServlet() {
        super();
    }
    protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
    	doPost(request, response);
    }
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String method = "POST";
		String action = request.getContextPath() + "/validaLogin";
		String mensagem = (String)request.getAttribute("mensagem");	
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Atenticação de usuário</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Entre com seu usuário e senha: </h3>");
		if (mensagem != null && !mensagem.equals("")) {
			out.println("<h4>" + mensagem + "</h4>");
		}
		out.println("<form method=\""+ method +"\" action=\"" +
				action + "\">");
		out.println("<table> <tr>");
		out.println("<td>Usuário: </td><td><input type=\"text\" " +
				"name=\"usuario\" size=\"20\" > </td>");
		out.println("</tr><tr>");
		out.println("<td>Senha: </td><td><input type=\"password\" " +
				"name=\"senha\" size=\"20\" > </td>");
		out.println("</tr><tr>");
		out.println("<td></td><td><input type=\"submit\" value=\"Enviar\">" +
				" </td>");
		out.println("</tr></table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}



