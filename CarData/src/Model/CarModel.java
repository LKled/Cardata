package Model;

//@ClassName: CarModel   
//@Description: �ڱ�������������ģ�����������
//@author: LYJ
//@date: 2018.8.28
public class CarModel {
	private String carName;				//��������
	private int buytime;				//����ʱ��
	private int num;					//�ڱ���������
	
//		@Title: getCarName()  
//	����@Description: ��ó�������
//	����@param: void   
//	����@return: String
//	����@throws: void
	public String getCarName() {
		return carName;
	}
	
//		@Title: setCarName()  
//	����@Description: ���ó�������
//	����@param: String carName   
//	����@return: void
//	����@throws: void
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
//		@Title: getBuytime()  
//	����@Description: ��ù���ʱ��
//	����@param: void   
//	����@return: int
//	����@throws: void
	public int getBuytime() {
		return buytime;
	}
	
//		@Title: setBuytime()  
//	����@Description: ���ù���ʱ��
//	����@param: int time 
//	����@return: void
//	����@throws: void
	public void setBuytime(int time) {
		this.buytime = time;
	}
	
//		@Title: getPraiseNum()  
//	����@Description: ��ÿڱ���������
//	����@param: void   
//	����@return: int
//	����@throws: void
	public int getPraiseNum() 
	{
		return num;
	}
	
//		@Title: setPraiseNum()  
//	����@Description: ���ÿڱ���������
//	����@param: int num 
//	����@return: void
//	����@throws: void
	public void setPraiseNum(int num)
	{
		this.num = num;
	}

}