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
//@Description: �����û�ѡ��������ѯ���ݿⲢ�����Ƽ�������Ϣ
//@author: LYJ
//@date: 2018.9.10
public class AdviseCars {
	
//		@Title: getAdviseCars()  
//	����@Description: 1.��ȡɸѡ����
//					  2.�õ���Ӧsql��䲢��ѯ���ݿ�
//					  3.�����ѯ�������������
//	����@param: List<String> condition   
//	����@return: AdviseModel
//	����@throws: void
	public static AdviseModel getAdviseCars(List<String> condition){
		AdviseModel car = new AdviseModel();
		String sort = new String();
		String price = new String();;
		String point = new String();;
		
		//��ȡ����
		Iterator<String> it = condition.iterator();
		if(it.hasNext())
			sort = it.next();
		if(it.hasNext())
			price = it.next();
		if(it.hasNext())
			point = it.next();
		
		//��ȡsql���
		String sql="select large_sort,cartype,comfort,space,config,xjb,power,control,imgs FROM advise";
		if(!sort.equals("ȫ��"))
			sql += " where kind='"+sort+"'";
		
		if(!price.equals("ȫ��")) {
			if(!sort.equals("ȫ��"))
				sql += " and";
			else
				sql += " where";
			if(price.equals("5������"))
				sql += " highCost<5";
			else if(price.equals("5-8��"))
				sql += " ((lowCost>=5 and lowCost<8) or (highCost>=5 and highCost<8))";
			else if(price.equals("8-12��"))
				sql += " ((lowCost>=8 and lowCost<12) or (highCost>=8 and highCost<12))";
			else if(price.equals("12-18��"))
				sql += " ((lowCost>=12 and lowCost<18) or (highCost>=12 and highCost<18))";
			else if(price.equals("18-25��"))
				sql += " ((lowCost>=18 and lowCost<25) or (highCost>=18 and highCost<25))";
			else if(price.equals("25-40��"))
				sql += " ((lowCost>=25 and lowCost<40) or (highCost>=25 and highCost<40))";
			else if(price.equals("40-80��"))
				sql += " ((lowCost>=40 and lowCost<80) or (highCost>=40 and highCost<80))";
			else if(price.equals("80������"))
				sql += " lowCost>=80";
			else
				System.out.println("error price");
		}
		
		if(!point.equals("ȫ��")) {
			if(point.equals("���ʶ�"))
				sql += " order by comfort desc";
			else if(point.equals("�ռ�"))
				sql += " order by space desc";
			else if(point.equals("����"))
				sql += " order by config desc";
			else if(point.equals("�Լ۱�"))
				sql += " order by xjb desc";
			else if(point.equals("����"))
				sql += " order by power desc";
			else if(point.equals("�ٿ�"))
				sql += " order by control desc";
			else
				System.out.println("error");
		}
		
		sql += ";";
		
		//System.out.println(sql);
		
		try {
			//�������ݿ�
			Connection connect = MyDataBase.getConnect();
			Statement statement = connect.createStatement();
			
			//��ѯ����
			ResultSet executeQuery = statement.executeQuery(sql);
			if(executeQuery.next())
			{
				//�����ѯ���
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

		//��������
		return car;
	}
}
