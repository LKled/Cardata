package Model;

//@ClassName: CarModel   
//@Description: 口碑发布数量功能模块的数据类型
//@author: LYJ
//@date: 2018.8.28
public class CarModel {
	private String carName;				//车款名称
	private int buytime;				//购买时间
	private int num;					//口碑发布数量
	
//		@Title: getCarName()  
//	　　@Description: 获得车款名称
//	　　@param: void   
//	　　@return: String
//	　　@throws: void
	public String getCarName() {
		return carName;
	}
	
//		@Title: setCarName()  
//	　　@Description: 设置车款名称
//	　　@param: String carName   
//	　　@return: void
//	　　@throws: void
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
//		@Title: getBuytime()  
//	　　@Description: 获得购买时间
//	　　@param: void   
//	　　@return: int
//	　　@throws: void
	public int getBuytime() {
		return buytime;
	}
	
//		@Title: setBuytime()  
//	　　@Description: 设置购买时间
//	　　@param: int time 
//	　　@return: void
//	　　@throws: void
	public void setBuytime(int time) {
		this.buytime = time;
	}
	
//		@Title: getPraiseNum()  
//	　　@Description: 获得口碑发布数量
//	　　@param: void   
//	　　@return: int
//	　　@throws: void
	public int getPraiseNum() 
	{
		return num;
	}
	
//		@Title: setPraiseNum()  
//	　　@Description: 设置口碑发布数量
//	　　@param: int num 
//	　　@return: void
//	　　@throws: void
	public void setPraiseNum(int num)
	{
		this.num = num;
	}

}