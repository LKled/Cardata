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
//@Description: 购车推荐功能模块与前端的数据传输
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
//	　　@Description: 1.接收用户选择的筛选条件
//					  2.根据条件调用函数获得推荐汽车信息
//					  3.封装并发送推荐汽车信息到前端
//	　　@param: HttpServletRequest request, HttpServletResponse response 
//	　　@return: void
//	　　@throws: ServletException, IOException
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//接收数据
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
		
		//获取信息
		AdviseModel car = AdviseCars.getAdviseCars(condition);
		
		//System.out.println(car.getCarSort());
		
		//封装数据
		JSONObject  json = new JSONObject();
		json.put("name", car.getCarSort());
		json.put("comfort", car.getComfort());
		json.put("space", car.getSpace());
		json.put("configuration", car.getConfiguration());
		json.put("quality", car.getQuality());
		json.put("power", car.getPower());
		json.put("control", car.getControl());
		json.put("picture", car.getPicture());
		
		//发送数据
		PrintWriter out=response.getWriter();
		out.print(json);
	}

}
