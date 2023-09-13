import javax.servlet.http.*;
// 웬만해선 * 안 쓰는게 좋긴한데 지금은 하드 코딩중이니까

public class FirstServlet extends HttpServlet {
	protected void doGet (HttpServletRequest req, 
								HttpServletResponse resp){
	// HttpServlet doGet 메서드 오버라이딩
		System.out.println("서블릿 실행...");
	}
}