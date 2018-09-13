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
//@Description: 车型优缺点功能模块与前端的数据传输
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
//	　　@Description: 1.获取需要查询的车型名称
//					  2.根据名称调用函数获取优缺点数据
//					  3.封装并发送数据到前端
//	　　@param: HttpServletRequest request, HttpServletResponse response 
//	　　@return: void
//	　　@throws: ServletException, IOException
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//获取名称
		String name =request.getParameter("name");
		
		//获取数据
		List<String> adv = ShowPurpose.getAdv(name);
		List<String> dis = ShowPurpose.getDis(name);
		
		Object[] key1 = adv.toArray();
		Object[] key2 = dis.toArray();
		
		//封装数据
		List<JSONObject> list = new ArrayList<JSONObject>();
		for (int i = 0; i < adv.size(); i++) {
		    JSONObject json=new JSONObject();
		    json.put("source", key1[i]);
		    json.put("target", name);
		    json.put("weight", 1);
		    json.put("name", "优点");
			list.add(json);
		}
		for (int i = 0; i < dis.size(); i++) {
		    JSONObject json=new JSONObject();
		    json.put("source", key2[i]);
		    json.put("target", name);
		    json.put("weight", 1);
		    json.put("name", "缺点");
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
		
		//发送数据
		PrintWriter out=response.getWriter();
		out.print(jsonmap);
	}

}
