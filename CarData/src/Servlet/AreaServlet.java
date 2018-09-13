package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Shows.ShowArea;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class AreaServlet
 */

//@ClassName: AreaServlet    
//@Description: 地域销售功能模块与前端的数据传输
//@author: SYN
//@date: 2018.9.4

@WebServlet("/AreaServlet")
public class AreaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AreaServlet() {
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
//	　　@Description: 1.调用函数获取地域销售信息
//					  2.处理并封装销售信息
//					  3.发送销售信息到前端
//	　　@param: HttpServletRequest request, HttpServletResponse response 
//	　　@return: void
//	　　@throws: ServletException, IOException
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");

		//获取信息
		Map<String, Integer> map = ShowArea.readdata();
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (Entry<String, Integer> entry : map.entrySet()) {

			list1.add(entry.getKey());
			list2.add(entry.getValue());
		}
		Object[] name = list1.toArray();
		Object[] value = list2.toArray();
		
		//封装信息
		List<JSONObject> list = new ArrayList<JSONObject>();
		for (int i = 0, j=0; i < list1.size()&&j<list2.size(); i++,j++) {
		    JSONObject json=new JSONObject();
			json.put("name", name[i]);
			json.put("value", value[j]);
			list.add(json);
			//System.out.println(name[i]+" "+value[j]);
		}
		
		//发送信息
		PrintWriter out=response.getWriter();
		out.print(list);
	}

}
