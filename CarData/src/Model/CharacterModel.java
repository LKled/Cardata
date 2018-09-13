package Model;

//@ClassName: CharacterModel   
//@Description: 车型指标功能模块的数据类型
//@author: LYJ
//@date: 2018.8.28
public class CharacterModel {
	private String carsort;				//车型
	private double comfort;				//舒适度
	private double space;				//空间
	private double surface;				//外观
	private double interior;			//内饰
	private double power;				//动力
	private double control;				//操控
	private double consumption;			//油耗
	
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
	
//		@Title: getSurface()  
//	　　@Description: 获得外观评分
//	　　@param: void   
//	　　@return: Double
//	　　@throws: void
	public double getSurface()
	{
		return surface;
	}
	
//		@Title: setSurface()  
//	　　@Description: 设置外观评分
//	　　@param: Double surface
//	　　@return: void
//	　　@throws: void
	public void setSurface(double surface)
	{
		this.surface = surface;
	}
	
//		@Title: getInterior()  
//	　　@Description: 获得内饰评分
//	　　@param: void   
//	　　@return: Double
//	　　@throws: void
	public double getInterior()
	{
		return interior;
	}
	
//		@Title: setInterior()  
//	　　@Description: 设置内饰评分
//	　　@param: Double interior
//	　　@return: void
//	　　@throws: void
	public void setInterior(double interior)
	{
		this.interior = interior;
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
	
//		@Title: getConsumption()  
//	　　@Description: 获得油耗评分
//	　　@param: void   
//	　　@return: Double
//	　　@throws: void
	public double getConsumption()
	{
		return consumption;
	}
	
//		@Title: setConsumption()  
//	　　@Description: 设置油耗评分
//	　　@param: Double consumption
//	　　@return: void
//	　　@throws: void
	public void setConsumption(double consumption)
	{
		this.consumption = consumption;
	}
}
