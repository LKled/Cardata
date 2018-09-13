package Shows;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import Connect.MyDataBase;

//@ClassName: ShowArea
//@Description: 查询数据库获取并返回地域销售数据
//@author: SYN
//@date: 2018.9.4
public class ShowArea {
	
//		@Title: readdata()  
//	　　@Description: 1.查询数据库
//					  2.处理查询结果并返回数据
//	　　@param: void 
//	　　@return: Map<String, Integer>
//	　　@throws: void
	public static Map<String, Integer> readdata() {
		Map<String, Integer> map=new HashMap<String, Integer>();
		try {
			//连接数据库
			Connection connect = MyDataBase.getConnect();
//			if(connect != null)
//				System.out.println("area success");
//			else
//				System.out.println(" failed");
			
			//获取数据
			String sql = "SELECT province,num FROM prov";
			Statement statement = connect.createStatement();
			ResultSet executeQuery = statement.executeQuery(sql);
			
			//处理结果
			String str=null;
			int num=0;
			while(executeQuery.next()){
				str = executeQuery.getString("province");
				num = executeQuery.getInt("num");
				map.put(str, num);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//返回数据
		return map;
		
	}
//	public static void main(String[] args) throws Exception {
//		readdata();	
//		
//	}
}
