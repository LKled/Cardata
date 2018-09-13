package Model;

//@ClassName: AdviseModel   
//@Description: 购车推荐功能模块的数据类型
//@author: LYJ
//@date: 2018.9.10
public class AdviseModel {
	private String carsort;				//车款
	private double comfort;				//舒适度
	private double space;				//空间
	private double configuration;		//配置
	private double quality;				//性价比
	private double power;				//动力
	private double control;				//操控
	private String picture;				//汽车图片url
	
	
//		@Title: getCarSort()  
//	　　@Description: 获得车款名称
//	　　@param: void   
//	　　@return: String
//	　　@throws: void
	public String getCarSort()
	{
		return carsort;
	}
	
//		@Title: setCarSort()  
//	　　@Description: 设置车款名称
//	　　@param: String sort   
//	　　@return: void
//	　　@throws: void
	public void setCarSort(String sort)
	{
		this.carsort = sort;
	}

//		@Title: getComfort()  
//	　　@Description: 获得舒适度评分
//	　　@param: void   
//	　　@return: Double
//	　　@throws: void
	public double getComfort()
	{
		return comfort;
	}
	
//		@Title: setComfort()  
//	　　@Description: 设置舒适度评分
//	　　@param: Double comfort
//	　　@return: void
//	　　@throws: void
	public void setComfort(double comfort)
	{
		this.comfort = comfort;
	}
	
//		@Title: getSpace()  
//	　　@Description: 获得空间评分
//	　　@param: void   
//	　　@return: Double
//	　　@throws: void
	public double getSpace()
	{
		return space;
	}
	
//		@Title: setSpace()  
//	　　@Description: 设置空间评分
//	　　@param: Double space
//	　　@return: void
//	　　@throws: void
	public void setSpace(double space)
	{
		this.space = space;
	}
	
//		@Title: getConfiguration()  
//	　　@Description: 获得配置评分
//	　　@param: void   
//	　　@return: Double
//	　　@throws: void
	public double getConfiguration()
	{
		return configuration;
	}
	
//		@Title: setConfiguration()  
//	　　@Description: 设置配置评分
//	　　@param: Double configuration
//	　　@return: void
//	　　@throws: void
	public void setConfiguration(double configuration)
	{
		this.configuration = configuration;
	}

//		@Title: getQuality()  
//	　　@Description: 获得性价比评分
//	　　@param: void   
//	　　@return: Double
//	　　@throws: void
	public double getQuality()
	{
		return quality;
	}
	
//		@Title: setQuality()  
//	　　@Description: 设置性价比评分
//	　　@param: Double quality
//	　　@return: void
//	　　@throws: void
	public void setQuality(double quality)
	{
		this.quality = quality;
	}
	
//		@Title: getPower()  
//	　　@Description: 获得动力评分
//	　　@param: void   
//	　　@return: Double
//	　　@throws: void
	public double getPower()
	{
		return power;
	}
	
//		@Title: setPower()  
//	　　@Description: 设置动力评分
//	　　@param: Double power
//	　　@return: void
//	　　@throws: void
	public void setPower(double power)
	{
		this.power = power;
	}
	
//		@Title: getControl()  
//	　　@Description: 获得操控评分
//	　　@param: void   
//	　　@return: Double
//	　　@throws: void
	public double getControl()
	{
		return control;
	}
	
//		@Title: setControl()  
//	　　@Description: 设置操控评分
//	　　@param: Double control
//	　　@return: void
//	　　@throws: void
	public void setControl(double control)
	{
		this.control = control;
	}
	
//		@Title: setPicture()  
//	　　@Description: 设置图片url
//	　　@param: String pic
//	　　@return: void
//	　　@throws: void
	public void setPicture(String pic)
	{
		this.picture = pic;
	}
	
//		@Title: getPicture()  
//	　　@Description: 获得汽车图片url
//	　　@param: void   
//	　　@return: String
//	　　@throws: void
	public String getPicture()
	{
		return picture;
	}
}
