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

import Shows.ShowPurpose;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class SelectServlet
 */

//@ClassName: SelectServlet    
//@Description: ������ȱ�㹦��ģ��select��������ǰ�˵����ݴ���
//@author: SYN
//@date: 2018.9.4

@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectServlet() {
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
		
		//��ȡ����
		List<String> allBuytype = ShowPurpose.getCarName();
		List<String> list = new ArrayList<String>();
		for(String all: allBuytype){
			list.add(all);	
		}
		
		//��װ����
		JSONObject  json=new JSONObject();
		json.put("carList", list);
		
		//��������
		PrintWriter out=response.getWriter();
		out.print(json);
	}

}
