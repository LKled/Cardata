package Shows;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import Connect.MyDataBase;
import Model.AdviseModel;

//@ClassName: AdviseCars    
//@Description: 根据用户选择条件查询数据库并返回推荐车型信息
//@author: LYJ
//@date: 2018.9.10
public class AdviseCars {
	
//		@Title: getAdviseCars()  
//	　　@Description: 1.获取筛选条件
//					  2.得到相应sql语句并查询数据库
//					  3.处理查询结果并返回数据
//	　　@param: List<String> condition   
//	　　@return: AdviseModel
//	　　@throws: void
	public static AdviseModel getAdviseCars(List<String> condition){
		AdviseModel car = new AdviseModel();
		String sort = new String();
		String price = new String();;
		String point = new String();;
		
		//获取条件
		Iterator<String> it = condition.iterator();
		if(it.hasNext())
			sort = it.next();
		if(it.hasNext())
			price = it.next();
		if(it.hasNext())
			point = it.next();
		
		//获取sql语句
		String sql="select large_sort,cartype,comfort,space,config,xjb,power,control,imgs FROM advise";
		if(!sort.equals("全部"))
			sql += " where kind='"+sort+"'";
		
		if(!price.equals("全部")) {
			if(!sort.equals("全部"))
				sql += " and";
			else
				sql += " where";
			if(price.equals("5万以下"))
				sql += " highCost<5";
			else if(price.equals("5-8万"))
				sql += " ((lowCost>=5 and lowCost<8) or (highCost>=5 and highCost<8))";
			else if(price.equals("8-12万"))
				sql += " ((lowCost>=8 and lowCost<12) or (highCost>=8 and highCost<12))";
			else if(price.equals("12-18万"))
				sql += " ((lowCost>=12 and lowCost<18) or (highCost>=12 and highCost<18))";
			else if(price.equals("18-25万"))
				sql += " ((lowCost>=18 and lowCost<25) or (highCost>=18 and highCost<25))";
			else if(price.equals("25-40万"))
				sql += " ((lowCost>=25 and lowCost<40) or (highCost>=25 and highCost<40))";
			else if(price.equals("40-80万"))
				sql += " ((lowCost>=40 and lowCost<80) or (highCost>=40 and highCost<80))";
			else if(price.equals("80万以上"))
				sql += " lowCost>=80";
			else
				System.out.println("error price");
		}
		
		if(!point.equals("全部")) {
			if(point.equals("舒适度"))
				sql += " order by comfort desc";
			else if(point.equals("空间"))
				sql += " order by space desc";
			else if(point.equals("配置"))
				sql += " order by config desc";
			else if(point.equals("性价比"))
				sql += " order by xjb desc";
			else if(point.equals("动力"))
				sql += " order by power desc";
			else if(point.equals("操控"))
				sql += " order by control desc";
			else
				System.out.println("error");
		}
		
		sql += ";";
		
		//System.out.println(sql);
		
		try {
			//连接数据库
			Connection connect = MyDataBase.getConnect();
			Statement statement = connect.createStatement();
			
			//查询数据
			ResultSet executeQuery = statement.executeQuery(sql);
			if(executeQuery.next())
			{
				//处理查询结果
				car.setCarSort(executeQuery.getString("large_sort") + "-" + executeQuery.getString("cartype"));
				car.setComfort(executeQuery.getDouble("comfort"));
				car.setSpace(executeQuery.getDouble("space"));
				car.setConfiguration(executeQuery.getDouble("config"));
				car.setQuality(executeQuery.getDouble("xjb"));
				car.setPower(executeQuery.getDouble("power"));
				car.setControl(executeQuery.getDouble("control"));
				car.setPicture(executeQuery.getString("imgs"));
				
			}
			else
				System.out.println("no car");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//返回数据
		return car;
	}
}
