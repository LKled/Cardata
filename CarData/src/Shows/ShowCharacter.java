package Shows;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Connect.MyDataBase;
import Model.CharacterModel;

//@ClassName: ShowCharacter
//@Description: ��ѯ���ݿ��ȡ���������г������ƺͳ���ָ������
//@author: LYJ
//@date: 2018.8.28
public class ShowCharacter {
	
//		@Title: getCharacter()  
//	����@Description: ��ѯ���ݿ��ȡ���г���
//	����@param: void 
//	����@return: List<CharacterModel>
//	����@throws: void
	public static List<CharacterModel> getCharacter(){
		List<CharacterModel> carList = new ArrayList<CharacterModel>();
		try {
			Connection connect = MyDataBase.getConnect();
			String sql="select cartype,comfort,space,appearance,interior,power,control,fuelconsumption FROM charac;";
			Statement statement = connect.createStatement();
			ResultSet executeQuery = statement.executeQuery(sql);
			while(executeQuery.next())
			{
				CharacterModel car = new CharacterModel();
				car.setCarSort(executeQuery.getString("cartype"));
				car.setComfort(executeQuery.getDouble("comfort"));
				car.setSpace(executeQuery.getDouble("space"));
				car.setSurface(executeQuery.getDouble("appearance"));
				car.setInterior(executeQuery.getDouble("interior"));
				car.setPower(executeQuery.getDouble("power"));
				car.setControl(executeQuery.getDouble("control"));
				car.setConsumption(executeQuery.getDouble("fuelconsumption"));
				carList.add(car);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carList;
	}
	
//		@Title: getCarName()  
//	����@Description: ��ȡ���г�������
//	����@param: void 
//	����@return: List<String>
//	����@throws: void
	public static List<String> getCarName(){
		List<CharacterModel> carList = getCharacter();
		Iterator<CharacterModel> it = carList.iterator();
		List<String> carname = new ArrayList<String>();
		while(it.hasNext())
		{
			String name = it.next().getCarSort();
			carname.add(name);
		}
		return carname;
	}
	
//		@Title: getCharacter()  
//	����@Description: ���ݳ������ƻ�ȡ�����ظó��͵ĳ���ָ����������
//	����@param: void 
//	����@return: CharacterModel
//	����@throws: void
	public CharacterModel getCharacter(String name)
	{
		List<CharacterModel> carList = getCharacter();
		Iterator<CharacterModel> it = carList.iterator();
		CharacterModel car = new CharacterModel();
		while(it.hasNext())
		{
			car = it.next();
			String carName = car.getCarSort();
			if(carName.equals(name))
				break;
		}
		return car;
	}
}
