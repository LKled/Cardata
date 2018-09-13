package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.CharacterModel;
import Shows.ShowCharacter;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class CharacterServlet
 */

//@ClassName: CharacterServlet    
//@Description: 车型指标功能模块与前端的数据传输
//@author: LYJ
//@date: 2018.8.30

@WebServlet("/CharacterServlet")
public class CharacterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CharacterServlet() {
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
//					  2.根据名称调用函数获取指标数据
//					  3.封装并发送信息到前端
//	　　@param: HttpServletRequest request, HttpServletResponse response 
//	　　@return: void
//	　　@throws: ServletException, IOException
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//获取名称
		String car = request.getParameter("cname");
		
		//获取数据
		CharacterModel character = new ShowCharacter().getCharacter(car);
		
		//封装数据
		JSONObject json = new JSONObject();
		json.put("name", car);
		json.put("comfort", character.getComfort());
		json.put("space", character.getSpace());
		json.put("surface", character.getSurface());
		json.put("interior", character.getInterior());
		json.put("power", character.getPower());
		json.put("control", character.getControl());
		json.put("consumption", character.getConsumption());
		json.put("carsort", character.getCarSort());
	
		//发送数据
		PrintWriter writer = response.getWriter();
		writer.print(json);
	}

}
