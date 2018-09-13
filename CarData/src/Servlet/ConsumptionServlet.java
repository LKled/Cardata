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

import Model.CarYhModel;
import Shows.ShowYouHao;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class ConsumptionServlet
 */

//@ClassName: ConsumptionServlet    
//@Description: 实测油耗功能模块与前端的数据传输
//@author: SYN
//@date: 2018.9.4

@WebServlet("/ConsumptionServlet")
public class ConsumptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsumptionServlet() {
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
//	　　@Description: 1.调用函数获取各车型的油耗数据
//					  2.处理并封装数据
//					  3.发送数据到前端
//	　　@param: HttpServletRequest request, HttpServletResponse response 
//	　　@return: void
//	　　@throws: ServletException, IOException
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//获取数据
		ShowYouHao showYouHao = new ShowYouHao();
		List<Double> yhMax = new ArrayList<Double>();
		List<Double> yhAvg = new ArrayList<Double>();
		List<Double> yhMin = new ArrayList<Double>();
		List<String> yhType = new ArrayList<String>();
		List<CarYhModel> youData = showYouHao.getYouData();
		
		//处理数据
		for (CarYhModel yh : youData) {
			yhMax.add(yh.getMaxYh());
			yhAvg.add(yh.getAvgYh());
			yhMin.add(yh.getMinYh());
			yhType.add(yh.getBuytype());

		}
		
//		System.out.println(yhMax);
//		System.out.println(yhMin);
//		System.out.println(yhAvg);
//		System.out.println(yhType);
		
		//封装数据
		JSONObject json = new JSONObject();
		json.put("yhMax", yhMax);
		json.put("yhAvg", yhAvg);
		json.put("yhMin", yhMin);
		json.put("yhType", yhType);
		
		//发送数据
		PrintWriter writer = response.getWriter();
		writer.print(json);
	}

}
