package Model;

//@ClassName: ScoreModel   
//@Description: 用户评分功能模块的数据类型
//@author: LYJ
//@date: 2018.8.28
public class ScoreModel {
	private String carsort;				//车型
	private String cartype;				//车款
	private int score;					//评论数
	
//		@Title: getSort()  
//	　　@Description: 获得车型名称
//	　　@param: void   
//	　　@return: String
//	　　@throws: void
	public String getSort()
	{
		return carsort;
	}
	
//		@Title: setSort()  
//	　　@Description: 设置车型名称
//	　　@param: String sort
//	　　@return: void
//	　　@throws: void
	public void setSort(String sort)
	{
		this.carsort = sort;
	}
	
//		@Title: getType()  
//	　　@Description: 获得车款名称
//	　　@param: void   
//	　　@return: String
//	　　@throws: void
	public String getType()
	{
		return cartype;
	}
	
//		@Title: setType()  
//	　　@Description: 设置车款名称
//	　　@param: String type
//	　　@return: void
//	　　@throws: void
	public void setType(String type)
	{
		this.cartype = type;
	}
	
//		@Title: getScore()  
//	　　@Description: 获得评论数
//	　　@param: void   
//	　　@return: int
//	　　@throws: void
	public int getScore()
	{
		return score;
	}
	
//		@Title: setScore()  
//	　　@Description: 设置评论数
//	　　@param: int score
//	　　@return: void
//	　　@throws: void
	public void setScore(int score)
	{
		this.score = score;
	}
}
