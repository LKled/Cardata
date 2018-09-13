package Model;

//@ClassName: CarYhModel   
//@Description: 实测油耗功能模块的数据类型
//@author: SYN
//@date: 2018.9.4
public class CarYhModel {
	private String buytype;			//车款名称
	private double maxYh;			//最高油耗
	private double avgYh;			//平均油耗
	private double minYh;			//最低油耗
	
//		@Title: getBuytype()  
//	　　@Description: 获得车款名称
//	　　@param: void   
//	　　@return: String
//	　　@throws: void
	public String getBuytype() {
		return buytype;
	}
	
//		@Title: setBuytype()  
//	　　@Description: 设置车款名称
//	　　@param: String buytype
//	　　@return: void
//	　　@throws: void
	public void setBuytype(String buytype) {
		this.buytype = buytype;
	}
	
//		@Title: getMaxYh()  
//	　　@Description: 获得最高油耗
//	　　@param: void   
//	　　@return: double
//	　　@throws: void
	public double getMaxYh() {
		return maxYh;
	}
	
//		@Title: setMaxYh()  
//	　　@Description: 设置最高油耗
//	　　@param: double maxYh
//	　　@return: void
//	　　@throws: void
	public void setMaxYh(double maxYh) {
		this.maxYh = maxYh;
	}
	
//		@Title: getAvgYh()  
//	　　@Description: 获得平均油耗
//	　　@param: void   
//	　　@return: double
//	　　@throws: void
	public double getAvgYh() {
		return avgYh;
	}
	
//		@Title: setAvgYh()  
//	　　@Description: 设置平均油耗
//	　　@param: double avgYh
//	　　@return: void
//	　　@throws: void
	public void setAvgYh(double avgYh) {
		this.avgYh = avgYh;
	}
	
//		@Title: getMinYh()  
//	　　@Description: 获得最低油耗
//	　　@param: void   
//	　　@return: double
//	　　@throws: void
	public double getMinYh() {
		return minYh;
	}
	
//		@Title: setMinYh()  
//	　　@Description: 设置最低油耗
//	　　@param: double minYh
//	　　@return: void
//	　　@throws: void
	public void setMinYh(double minYh) {
		this.minYh = minYh;
	}
	
	
}
