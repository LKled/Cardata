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
//@Description: 车型指标功能模块select下拉框与前端的数据传输
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
//	　　@Description: 1.调用函数获取所有车型名称
//					  2.封装信息
//					  3.发送信息到前端
//	　　@param: HttpServletRequest request, HttpServletResponse response 
//	　　@return: void
//	　　@throws: ServletException, IOException
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//获取信息
		List<String> allBuytype = ShowCharacter.getCarName();
		List<String> list = new ArrayList<String>();
		for(String all: allBuytype){
			list.add(all);	
		}
		
		//封装信息
		JSONObject  json=new JSONObject();
		json.put("carList", list);
		
		//发送消息
		PrintWriter out=response.getWriter();
		out.print(json);
	}

}
