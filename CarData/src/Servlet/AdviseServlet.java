package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.AdviseModel;
import Shows.AdviseCars;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class AdviseServlet
 */

//@ClassName: AdviseServlet    
//@Description: �����Ƽ�����ģ����ǰ�˵����ݴ���
//@author: LYJ
//@date: 2018.9.10

@WebServlet("/AdviseServlet")
public class AdviseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AdviseServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//		@Title: doPost()  
//	����@Description: 1.�����û�ѡ���ɸѡ����
//					  2.�����������ú�������Ƽ�������Ϣ
//					  3.��װ�������Ƽ�������Ϣ��ǰ��
//	����@param: HttpServletRequest request, HttpServletResponse response 
//	����@return: void
//	����@throws: ServletException, IOException
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//��������
		String sort = request.getParameter("sort");
		String price = request.getParameter("price");
		String point = request.getParameter("point");
//		System.out.println(sort);
//		System.out.println(price);
//		System.out.println(point);
		
		List<String> condition = new ArrayList<String>();
		condition.add(sort);
		condition.add(price);
		condition.add(point);
		
		//��ȡ��Ϣ
		AdviseModel car = AdviseCars.getAdviseCars(condition);
		
		//System.out.println(car.getCarSort());
		
		//��װ����
		JSONObject  json = new JSONObject();
		json.put("name", car.getCarSort());
		json.put("comfort", car.getComfort());
		json.put("space", car.getSpace());
		json.put("configuration", car.getConfiguration());
		json.put("quality", car.getQuality());
		json.put("power", car.getPower());
		json.put("control", car.getControl());
		json.put("picture", car.getPicture());
		
		//��������
		PrintWriter out=response.getWriter();
		out.print(json);
	}

}
