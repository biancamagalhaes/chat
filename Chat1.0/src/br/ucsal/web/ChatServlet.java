package br.ucsal.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChatServlet
 */
@WebServlet("/ChatServlet")
public class ChatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mensagem = request.getParameter("mensagem");
		
		if(request.getServletContext().getAttribute("canal") == null ) {
			request.getServletContext().setAttribute("canal","");
		}
		
		if (mensagem != null && mensagem.trim().length() > 0) {
			String canal = (String) request.getServletContext().getAttribute("canal");
			String usuario = (String) request.getSession().getAttribute("usuario");
			canal = canal + usuario+": "+mensagem + "\n" ;
			request.getServletContext().setAttribute("canal",canal);
		}
		
		response.sendRedirect("/Chat1.0/chat.jsp");
	}

}