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

import Shows.ShowCharacter;
import net.sf.json.JSONObject;


/**
 * Servlet implementation class CarSelectServlet
 */

//@ClassName: CarSelectServlet    
//@Description: ����ָ�깦��ģ��select��������ǰ�˵����ݴ���
//@author: LYJ
//@date: 2018.8.30

@WebServlet("/CarSelectServlet")
public class CarSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarSelectServlet() {
        super();
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
//	����@Description: 1.���ú�����ȡ���г�������
//					  2.��װ��Ϣ
//					  3.������Ϣ��ǰ��
//	����@param: HttpServletRequest request, HttpServletResponse response 
//	����@return: void
//	����@throws: ServletException, IOException
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//��ȡ��Ϣ
		List<String> allBuytype = ShowCharacter.getCarName();
		List<String> list = new ArrayList<String>();
		for(String all: allBuytype){
			list.add(all);	
		}
		
		//��װ��Ϣ
		JSONObject  json=new JSONObject();
		json.put("carList", list);
		
		//������Ϣ
		PrintWriter out=response.getWriter();
		out.print(json);
	}

}
