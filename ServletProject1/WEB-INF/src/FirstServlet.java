import javax.servlet.http.*;
// �����ؼ� * �� ���°� �����ѵ� ������ �ϵ� �ڵ����̴ϱ�

public class FirstServlet extends HttpServlet {
	protected void doGet (HttpServletRequest req, 
								HttpServletResponse resp){
	// HttpServlet doGet �޼��� �������̵�
		System.out.println("���� ����...");
	}
}