import javax.servlet.http.*;

// ��û���
	public class indexServlet extends HttpServlet {
	protected void doGet (HttpServletRequest req, 
								HttpServletResponse resp){
		System.out.println("Get ��� ��û Test");
	}
	
	protected void doPost(HttpServletRequest req,
								HttpServletResponse resp){
		System.out.println("Post ��� Test");
	}
}
