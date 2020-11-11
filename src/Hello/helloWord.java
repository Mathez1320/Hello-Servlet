package Hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class helloWord
 */
@WebServlet("/helloWord")
public class helloWord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public helloWord() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<!Doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Olá Mundo Servlet</title>");
		out.println("<body>");
		out.println("<h1>Olá Mundo! Obrigado pela oportunidade.</h1>");
		out.println("<Matheus de Azevedo Porciúncula>");
		out.println("</body>");
		out.println("</html>");
	}

}
