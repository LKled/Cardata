package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Shows.ShowScores;
import net.sf.json.JSONObject;


/**
 * Servlet implementation class ScoreServlet
 */

//@ClassName: ScoreServlet    
//@Description: 用户评分功能模块与前端的数据传输
//@author: LYJ
//@date: 2018.8.28

@WebServlet("/ScoreServlet")
public class ScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScoreServlet() {
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
//					  2.根据名称调用函数获取用户评分数据
//					  3.封装并发送数据到前端
//	　　@param: HttpServletRequest request, HttpServletResponse response 
//	　　@return: void
//	　　@throws: ServletException, IOException
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//获取名称
		String sort = request.getParameter("name");
		
		//获取数据
		Map<String, Integer> top = new ShowScores().getTop(sort);
		ArrayList<String> key=new ArrayList<String>();
		ArrayList<Integer> value=new ArrayList<Integer>();
		
		for(Entry<String, Integer> topn:top.entrySet()){
			key.add(topn.getKey());
			value.add(topn.getValue());
		}
		
		//封装数据
		JSONObject  json=new JSONObject();
		json.put("x", key);
		json.put("y", value);
		
		//发送数据
		PrintWriter out=response.getWriter();
		out.print(json);
	}

}
