package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.CarModel;
import Shows.ShowPraiseNumber;
import net.sf.json.JSONObject;


/**
 * Servlet implementation class PraiseServlet
 */

//@ClassName: PraiseServlet    
//@Description: 口碑发布数量功能模块与前端的数据传输
//@author: LYJ
//@date: 2018.8.28

@WebServlet("/PraiseServlet")
public class PraiseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PraiseServlet() {
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
//	　　@Description: 1.调用函数获取各车型的口碑发布量数据
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
		ShowPraiseNumber showPraise = new ShowPraiseNumber();
		List<CarModel> carList = showPraise.getPraiseNumber();
		List<String> carName = showPraise.getCarName();
		List<Integer> praise2015 = new ArrayList<Integer>();
		List<Integer> praise2016 = new ArrayList<Integer>();
		List<Integer> praise2017 = new ArrayList<Integer>();
		List<Integer> praise2018 = new ArrayList<Integer>();
		
		//处理数据
		Iterator<String> it = carName.iterator();
		while(it.hasNext())
		{
			String name = it.next();
			Iterator<CarModel> carIt = carList.iterator();
			while(carIt.hasNext())
			{
				CarModel car = carIt.next();
				if(car.getCarName().equals(name) && car.getBuytime() == 2015)
				{
					praise2015.add(car.getPraiseNum());
					break;
				}
			}
		}
		
		it = carName.iterator();
		while(it.hasNext())
		{
			String name = it.next();
			Iterator<CarModel> carIt = carList.iterator();
			while(carIt.hasNext())
			{
				CarModel car = carIt.next();
				if(car.getCarName().equals(name) && car.getBuytime() == 2016)
				{
					praise2016.add(car.getPraiseNum());
					break;
				}
			}
		}
		
		it = carName.iterator();
		while(it.hasNext())
		{
			String name = it.next();
			Iterator<CarModel> carIt = carList.iterator();
			while(carIt.hasNext())
			{
				CarModel car = carIt.next();
				if(car.getCarName().equals(name) && car.getBuytime() == 2017)
				{
					praise2017.add(car.getPraiseNum());
					break;
				}
			}
		}
		
		it = carName.iterator();
		while(it.hasNext())
		{
			String name = it.next();
			Iterator<CarModel> carIt = carList.iterator();
			while(carIt.hasNext())
			{
				CarModel car = carIt.next();
				if(car.getCarName().equals(name) && car.getBuytime() == 2018)
				{
					praise2018.add(car.getPraiseNum());
					break;
				}
			}
		}
		
//		System.out.println(praise2015);
//		System.out.println(praise2016);
//		System.out.println(praise2017);
//		System.out.println(praise2018);
		
		//封装数据
		JSONObject  json=new JSONObject();
		json.put("name", carName);
		json.put("p2015", praise2015);
		json.put("p2016", praise2016);
		json.put("p2017", praise2017);
		json.put("p2018", praise2018);
		json.put("num", carName.size());
		
		//发送数据
		PrintWriter out=response.getWriter();
		out.print(json);
	}

}
