package Shows;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Connect.MyDataBase;
import Model.CarYhModel;

//@ClassName: ShowYouHao
//@Description: ��ѯ���ݿ��ȡ���������г��͵�ʵ���ͺ�����
//@author: SYN
//@date: 2018.9.4
public class ShowYouHao {
	
//		@Title: getYouData()  
//	����@Description: ��ѯ���ݿ��ȡ���������г��͵�ʵ���ͺ�����
//	����@param: void 
//	����@return: List<CarYhModel>
//	����@throws: void
	public List<CarYhModel> getYouData(){
		List<CarYhModel> lis= new ArrayList<CarYhModel>();
		
		try {
			Connection connect = MyDataBase.getConnect();
//			if(connect != null)
//				System.out.println("yh success");
//			else
//				System.out.println("yh failed");
		
			String sql="SELECT standerdfuel_max,standerdfuel_avg,standerdfuel_min,carsort from youhao";
			Statement createStatement = connect.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(sql);
			while(executeQuery.next()){
				CarYhModel carYhModel = new CarYhModel();
				double max = executeQuery.getDouble("standerdfuel_max");
				carYhModel.setMaxYh(max);
				double avg = executeQuery.getDouble("standerdfuel_avg");
				carYhModel.setAvgYh(avg);
				double min = executeQuery.getDouble("standerdfuel_min");
				carYhModel.setMinYh(min);
				String carsort = executeQuery.getString("carsort");
				carYhModel.setBuytype(carsort);
				lis.add(carYhModel);
				//System.out.println(carYhModel.getAvgYh()+" "+carYhModel.getMaxYh()+" "+carYhModel.getMinYh()+" "+carYhModel.getBuytype());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lis;
	}

}
