package Model;

//@ClassName: PurposeModel   
//@Description: 车型优缺点功能模块的数据类型
//@author: SYN
//@date: 2018.9.4
public class PurposeModel {
	private String buytype;				//车型名称
	private String adv;					//优点
	private String dis;					//缺点
	
//		@Title: setBuytype()  
//	　　@Description: 设置车款名称
//	　　@param: String type
//	　　@return: void
//	　　@throws: void
	public void setBuytype(String type) {
		this.buytype = type;
	}
	
//		@Title: getBuytype()  
//	　　@Description: 获得车款名称
//	　　@param: void   
//	　　@return: String
//	　　@throws: void
	public String getBuytype() {
		return buytype;
	}
	
//		@Title: setAdv()  
//	　　@Description: 设置优点
//	　　@param: String adv
//	　　@return: void
//	　　@throws: void
	public void setAdv(String adv) {
		this.adv = adv;
	}
	
//		@Title: getAdv()  
//	　　@Description: 获得优点
//	　　@param: void   
//	　　@return: String
//	　　@throws: void
	public String getAdv() {
		return adv;
	}
	
//		@Title: setBuytype()  
//	　　@Description: 设置缺点
//	　　@param: String dis
//	　　@return: void
//	　　@throws: void
	public void setDis(String dis) {
		this.dis = dis;
	}
	
//		@Title: getDis()  
//	　　@Description: 获得缺点
//	　　@param: void   
//	　　@return: String
//	　　@throws: void
	public String getDis() {
		return dis;
	}
}
