import javax.servlet.http.*;

// 夸没规侥
	public class indexServlet extends HttpServlet {
	protected void doGet (HttpServletRequest req, 
								HttpServletResponse resp){
		System.out.println("Get 规侥 夸没 Test");
	}
	
	protected void doPost(HttpServletRequest req,
								HttpServletResponse resp){
		System.out.println("Post 规侥 Test");
	}
}
