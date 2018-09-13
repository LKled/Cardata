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
 * Servlet implementation class PurposeServlet
 */

//@ClassName: PurposeServlet    
//@Description: ������ȱ�㹦��ģ����ǰ�˵����ݴ���
//@author: SYN
//@date: 2018.9.4

@WebServlet("/PurposeServlet")
public class PurposeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PurposeServlet() {
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
//	����@Description: 1.��ȡ��Ҫ��ѯ�ĳ�������
//					  2.�������Ƶ��ú�����ȡ��ȱ������
//					  3.��װ���������ݵ�ǰ��
//	����@param: HttpServletRequest request, HttpServletResponse response 
//	����@return: void
//	����@throws: ServletException, IOException
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//��ȡ����
		String name =request.getParameter("name");
		
		//��ȡ����
		List<String> adv = ShowPurpose.getAdv(name);
		List<String> dis = ShowPurpose.getDis(name);
		
		Object[] key1 = adv.toArray();
		Object[] key2 = dis.toArray();
		
		//��װ����
		List<JSONObject> list = new ArrayList<JSONObject>();
		for (int i = 0; i < adv.size(); i++) {
		    JSONObject json=new JSONObject();
		    json.put("source", key1[i]);
		    json.put("target", name);
		    json.put("weight", 1);
		    json.put("name", "�ŵ�");
			list.add(json);
		}
		for (int i = 0; i < dis.size(); i++) {
		    JSONObject json=new JSONObject();
		    json.put("source", key2[i]);
		    json.put("target", name);
		    json.put("weight", 1);
		    json.put("name", "ȱ��");
			list.add(json);
		}
		
		List<JSONObject> listmap = new ArrayList<JSONObject>();
		
		JSONObject json2=new JSONObject();
		json2.put("category", 0);
		json2.put("name", name);
		listmap.add(json2);
		
		for (int i = 0; i < adv.size(); i++) {
			JSONObject json1=new JSONObject();
			json1.put("category", 1);
			json1.put("name", key1[i]);
			listmap.add(json1);
		}
		for (int i = 0; i < dis.size(); i++) {
			JSONObject json1=new JSONObject();
			json1.put("category", 2);
			json1.put("name", key2[i]);
			listmap.add(json1);
		}
		
//		System.out.println(list);
//		System.out.println(listmap);
		
		JSONObject jsonmap=new JSONObject();
		jsonmap.put("x", list);
		jsonmap.put("y", listmap);
		
		//��������
		PrintWriter out=response.getWriter();
		out.print(jsonmap);
	}

}
