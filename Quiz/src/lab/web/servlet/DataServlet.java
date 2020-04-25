package lab.web.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lab.web.vo.DataVO;

@WebServlet("/Data.do")
public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ArrayList<DataVO> list = new ArrayList<>();
	
    public DataServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("/DataList.jsp").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		int age = Integer.parseInt(request.getParameter("age"));
		DataVO data = new DataVO();
		data.setName(name);
		data.setAge(age);
		data.setTel(tel);
		list.add(data); //데이터가 3개 이상일 때는 map에 담아줄 수 없기 때문에 DataVO타입을 담을 수 있는 list 객체를 생성해서 데이터를 저장해줌.
		
		response.sendRedirect("/Quiz/Data.do");
		
		
		/*
		 디스패쳐는 나의 서버(프로젝트) 안에서만 찾을 것이기 때문에 프로젝트 주소가 필요 없음.
		 리다이렉트는 내 프로젝트 안에서만 찾을게 아니기 때문에 프로젝트 주소를 꼭 적어주어야 함.
		 */
		
		
		
		
	}

}
