package Shows;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Connect.MyDataBase;
import Model.PurposeModel;

//@ClassName: ShowPurpose
//@Description: 查询数据库获取并返回指定车型的优缺点信息
//@author: SYN && LYJ
//@date: 2018.9.4
public class ShowPurpose {
	
//		@Title: getCarList()  
//	　　@Description: 查询数据库获取并返回所有车型优缺点数据
//	　　@param: void 
//	　　@return: List<PurposeModel>
//	　　@throws: void
	public static List<PurposeModel> getCarList(){
		List<PurposeModel> carList = new ArrayList<PurposeModel>();
		try {
			Connection connect = MyDataBase.getConnect();
			String sql = "SELECT * FROM advantage;";
			Statement statement = connect.createStatement();
			ResultSet executeQuery = statement.executeQuery(sql);
		
			while(executeQuery.next()) {
				PurposeModel car = new PurposeModel();
				car.setBuytype(executeQuery.getString("buytype"));
				car.setAdv(executeQuery.getString("adv"));
				car.setDis(executeQuery.getString("disadv"));
				//System.out.println(executeQuery.getString("disadv"));
				carList.add(car);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return carList;
	}
	
//		@Title: getAdv()  
//	　　@Description: 根据车型名称获取并返回该车型的优点信息
//	　　@param: String name
//	　　@return: List<String>
//	　　@throws: void
	public static List<String> getAdv(String name){
		List<PurposeModel> carList = getCarList();
		List<String> map = new ArrayList<String>();
		
		Iterator<PurposeModel> it = carList.iterator();
		PurposeModel car = new PurposeModel();
		while(it.hasNext()) {
			car = it.next();
			if(car.getBuytype().equals(name))
				break;
		}
		
		String adv = car.getAdv();
		//System.out.println(adv);
		String[] obj=adv.split("/");
		for (int i = 0; i < obj.length; i++) {
			map.add(obj[i]);
		}
		//System.out.println(map);
		return map;
	}
	
//		@Title: getDis()  
//	　　@Description: 根据车型名称获取并返回该车型的缺点信息
//	　　@param: String name
//	　　@return: List<String>
//	　　@throws: void
	public static List<String> getDis(String name){
		List<PurposeModel> carList = getCarList();
		//System.out.println(name);
		List<String> map=new ArrayList<String>();
		
		Iterator<PurposeModel> it = carList.iterator();
		PurposeModel car = new PurposeModel();
		while(it.hasNext()) {
			car = it.next();
			if(car.getBuytype().equals(name))
				break;
		}
		
		String dis = car.getDis();
		//System.out.println(dis);
		String[] obj=dis.split(",");
		for (int i = 0; i < obj.length; i++) {
			map.add(obj[i]);
		}
		//System.out.println(map);
		return map;
	}
	
//		@Title: getCarName()  
//	　　@Description: 返回所有车型名称
//	　　@param: void
//	　　@return: List<String>
//	　　@throws: void
	public static List<String> getCarName(){
		List<PurposeModel> carList = getCarList();
		Iterator<PurposeModel> it = carList.iterator();
		List<String> cars = new ArrayList<String>();
		
		while(it.hasNext()){
			String name = it.next().getBuytype();
			cars.add(name);
		}
		return cars;
	}
}
