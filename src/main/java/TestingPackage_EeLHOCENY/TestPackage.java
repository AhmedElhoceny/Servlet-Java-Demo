package TestingPackage_EeLHOCENY;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestPackage")
public class TestPackage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public TestPackage() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		var userName = request.getParameter("username");
		
		var OurPrintWriter = response.getWriter();
		if(userName == null)
			userName = "UnKnown";
		
		OurPrintWriter.println("HELLO FRIEND " + userName);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		var ourPrinter = response.getWriter();
		
		var name = request.getParameter("username");
		
		ourPrinter.print(name);
	}

}
