package FirstAPP;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet("/FirstAPP")
public class FirstAPP extends HttpServlet{

	public void init(ServletConfig config) {
		System.out.println("Servlet Intialized");
	}
	public void service(ServletRequest request, ServletResponse responce) throws ServletException,IOException {
		responce.setContentType("text/html");
		PrintWriter out = responce.getWriter();
		out.println("<html><head><title>Output</title></head>");
		out.println("<body>");
		out.println("<h1 style='color:red'><marquee>Welcome to servlet coding...</marquee></h1>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
	public void destroy() {
		
		System.out.println("Servlet DeInstallation");
		
	}

}
