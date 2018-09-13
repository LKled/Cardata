package Shows;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import Connect.MyDataBase;

//@ClassName: ShowArea
//@Description: ��ѯ���ݿ��ȡ�����ص�����������
//@author: SYN
//@date: 2018.9.4
public class ShowArea {
	
//		@Title: readdata()  
//	����@Description: 1.��ѯ���ݿ�
//					  2.�����ѯ�������������
//	����@param: void 
//	����@return: Map<String, Integer>
//	����@throws: void
	public static Map<String, Integer> readdata() {
		Map<String, Integer> map=new HashMap<String, Integer>();
		try {
			//�������ݿ�
			Connection connect = MyDataBase.getConnect();
//			if(connect != null)
//				System.out.println("area success");
//			else
//				System.out.println(" failed");
			
			//��ȡ����
			String sql = "SELECT province,num FROM prov";
			Statement statement = connect.createStatement();
			ResultSet executeQuery = statement.executeQuery(sql);
			
			//������
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
		
		//��������
		return map;
		
	}
//	public static void main(String[] args) throws Exception {
//		readdata();	
//		
//	}
}
