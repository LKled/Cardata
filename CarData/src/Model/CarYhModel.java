package Model;

//@ClassName: CarYhModel   
//@Description: ʵ���ͺĹ���ģ�����������
//@author: SYN
//@date: 2018.9.4
public class CarYhModel {
	private String buytype;			//��������
	private double maxYh;			//����ͺ�
	private double avgYh;			//ƽ���ͺ�
	private double minYh;			//����ͺ�
	
//		@Title: getBuytype()  
//	����@Description: ��ó�������
//	����@param: void   
//	����@return: String
//	����@throws: void
	public String getBuytype() {
		return buytype;
	}
	
//		@Title: setBuytype()  
//	����@Description: ���ó�������
//	����@param: String buytype
//	����@return: void
//	����@throws: void
	public void setBuytype(String buytype) {
		this.buytype = buytype;
	}
	
//		@Title: getMaxYh()  
//	����@Description: �������ͺ�
//	����@param: void   
//	����@return: double
//	����@throws: void
	public double getMaxYh() {
		return maxYh;
	}
	
//		@Title: setMaxYh()  
//	����@Description: ��������ͺ�
//	����@param: double maxYh
//	����@return: void
//	����@throws: void
	public void setMaxYh(double maxYh) {
		this.maxYh = maxYh;
	}
	
//		@Title: getAvgYh()  
//	����@Description: ���ƽ���ͺ�
//	����@param: void   
//	����@return: double
//	����@throws: void
	public double getAvgYh() {
		return avgYh;
	}
	
//		@Title: setAvgYh()  
//	����@Description: ����ƽ���ͺ�
//	����@param: double avgYh
//	����@return: void
//	����@throws: void
	public void setAvgYh(double avgYh) {
		this.avgYh = avgYh;
	}
	
//		@Title: getMinYh()  
//	����@Description: �������ͺ�
//	����@param: void   
//	����@return: double
//	����@throws: void
	public double getMinYh() {
		return minYh;
	}
	
//		@Title: setMinYh()  
//	����@Description: ��������ͺ�
//	����@param: double minYh
//	����@return: void
//	����@throws: void
	public void setMinYh(double minYh) {
		this.minYh = minYh;
	}
	
	
}
