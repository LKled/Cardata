package Shows;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Connect.MyDataBase;
import Model.CarModel;

//@ClassName: ShowPraiseNumber
//@Description: 查询数据库获取并返回所有车型口碑发布量数据
//@author: LYJ
//@date: 2018.8.28
public class ShowPraiseNumber {
	
//		@Title: getPraiseNumber()  
//	　　@Description: 查询数据库获取并返回所有车型口碑发布数量
//	　　@param: void 
//	　　@return: List<CarModel>
//	　　@throws: void
	public List<CarModel> getPraiseNumber(){
		ArrayList<CarModel> carList = new ArrayList<CarModel>();
		try {
			Connection connect = MyDataBase.getConnect();
			String sql="select carsort,buytime,num FROM praise_num;";
			Statement statement = connect.createStatement();
			ResultSet executeQuery = statement.executeQuery(sql);
			while(executeQuery.next())
			{
				CarModel car = new CarModel();
				car.setCarName(executeQuery.getString("carsort"));
				car.setBuytime(executeQuery.getInt("buytime"));
				car.setPraiseNum(executeQuery.getInt("num"));
				carList.add(car);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		System.out.println(carList);
		return carList;
	}
	
//		@Title: getCarName()  
//	　　@Description: 获取并返回所有车型名称
//	　　@param: void 
//	　　@return: List<String>
//	　　@throws: void
	public List<String> getCarName()
	{
		List<CarModel> carList = this.getPraiseNumber();
		List<String> carName = new ArrayList<String>();
		Iterator<CarModel> it = carList.iterator();
		while(it.hasNext())
		{
			String name = it.next().getCarName();
			if(!carName.contains(name))
				carName.add(name);
		}
		return carName;
	}
}
