package Model;

//@ClassName: AdviseModel   
//@Description: �����Ƽ�����ģ�����������
//@author: LYJ
//@date: 2018.9.10
public class AdviseModel {
	private String carsort;				//����
	private double comfort;				//���ʶ�
	private double space;				//�ռ�
	private double configuration;		//����
	private double quality;				//�Լ۱�
	private double power;				//����
	private double control;				//�ٿ�
	private String picture;				//����ͼƬurl
	
	
//		@Title: getCarSort()  
//	����@Description: ��ó�������
//	����@param: void   
//	����@return: String
//	����@throws: void
	public String getCarSort()
	{
		return carsort;
	}
	
//		@Title: setCarSort()  
//	����@Description: ���ó�������
//	����@param: String sort   
//	����@return: void
//	����@throws: void
	public void setCarSort(String sort)
	{
		this.carsort = sort;
	}

//		@Title: getComfort()  
//	����@Description: ������ʶ�����
//	����@param: void   
//	����@return: Double
//	����@throws: void
	public double getComfort()
	{
		return comfort;
	}
	
//		@Title: setComfort()  
//	����@Description: �������ʶ�����
//	����@param: Double comfort
//	����@return: void
//	����@throws: void
	public void setComfort(double comfort)
	{
		this.comfort = comfort;
	}
	
//		@Title: getSpace()  
//	����@Description: ��ÿռ�����
//	����@param: void   
//	����@return: Double
//	����@throws: void
	public double getSpace()
	{
		return space;
	}
	
//		@Title: setSpace()  
//	����@Description: ���ÿռ�����
//	����@param: Double space
//	����@return: void
//	����@throws: void
	public void setSpace(double space)
	{
		this.space = space;
	}
	
//		@Title: getConfiguration()  
//	����@Description: �����������
//	����@param: void   
//	����@return: Double
//	����@throws: void
	public double getConfiguration()
	{
		return configuration;
	}
	
//		@Title: setConfiguration()  
//	����@Description: ������������
//	����@param: Double configuration
//	����@return: void
//	����@throws: void
	public void setConfiguration(double configuration)
	{
		this.configuration = configuration;
	}

//		@Title: getQuality()  
//	����@Description: ����Լ۱�����
//	����@param: void   
//	����@return: Double
//	����@throws: void
	public double getQuality()
	{
		return quality;
	}
	
//		@Title: setQuality()  
//	����@Description: �����Լ۱�����
//	����@param: Double quality
//	����@return: void
//	����@throws: void
	public void setQuality(double quality)
	{
		this.quality = quality;
	}
	
//		@Title: getPower()  
//	����@Description: ��ö�������
//	����@param: void   
//	����@return: Double
//	����@throws: void
	public double getPower()
	{
		return power;
	}
	
//		@Title: setPower()  
//	����@Description: ���ö�������
//	����@param: Double power
//	����@return: void
//	����@throws: void
	public void setPower(double power)
	{
		this.power = power;
	}
	
//		@Title: getControl()  
//	����@Description: ��òٿ�����
//	����@param: void   
//	����@return: Double
//	����@throws: void
	public double getControl()
	{
		return control;
	}
	
//		@Title: setControl()  
//	����@Description: ���òٿ�����
//	����@param: Double control
//	����@return: void
//	����@throws: void
	public void setControl(double control)
	{
		this.control = control;
	}
	
//		@Title: setPicture()  
//	����@Description: ����ͼƬurl
//	����@param: String pic
//	����@return: void
//	����@throws: void
	public void setPicture(String pic)
	{
		this.picture = pic;
	}
	
//		@Title: getPicture()  
//	����@Description: �������ͼƬurl
//	����@param: void   
//	����@return: String
//	����@throws: void
	public String getPicture()
	{
		return picture;
	}
}
