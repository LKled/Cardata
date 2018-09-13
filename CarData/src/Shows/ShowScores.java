package Shows;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Connect.MyDataBase;
import Model.ScoreModel;

//@ClassName: ShowScores
//@Description: 根据车型名称查询数据库并返回该车型Top5的车款的评论数
//@author: LYJ
//@date: 2018.8.28
public class ShowScores {
	
//		@Title: getScores()  
//	　　@Description: 查询数据库获取并返回所有车型评论数据
//	　　@param: void 
//	　　@return: List<ScoreModel>
//	　　@throws: void
	public ArrayList<ScoreModel> getScores(){
		ArrayList<ScoreModel> carList = new ArrayList<ScoreModel>();
		try {
			Connection connect = MyDataBase.getConnect();
			String sql="select carsort,cartype,num FROM scores;";
			Statement statement = connect.createStatement();
			ResultSet executeQuery = statement.executeQuery(sql);
			
			while(executeQuery.next())
			{
				ScoreModel car = new ScoreModel();
				car.setSort(executeQuery.getString("carsort"));
				car.setType(executeQuery.getString("cartype"));
				car.setScore(executeQuery.getInt("num"));
				carList.add(car);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carList;
	}
	
//		@Title: getTop()  
//	　　@Description: 根据车型名称获取前五的车款的评论信息
//	　　@param: String sort
//	　　@return: Map<String,Integer>
//	　　@throws: void
	public Map<String,Integer> getTop(String sort)
	{
		ArrayList<ScoreModel> carList = this.getScores();
		Iterator<ScoreModel> it = carList.iterator();
		ScoreModel car = new ScoreModel();
		HashMap<String,Integer> top = new HashMap<String,Integer>();
		while(it.hasNext() && top.size() < 5)
		{
			car = it.next();
			if(car.getSort().equals(sort))
			{
				top.put(car.getType(), car.getScore());
			}
		}
		
		return top;
	}
}
