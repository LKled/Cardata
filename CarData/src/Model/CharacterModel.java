package Model;

//@ClassName: CharacterModel   
//@Description: ����ָ�깦��ģ�����������
//@author: LYJ
//@date: 2018.8.28
public class CharacterModel {
	private String carsort;				//����
	private double comfort;				//���ʶ�
	private double space;				//�ռ�
	private double surface;				//���
	private double interior;			//����
	private double power;				//����
	private double control;				//�ٿ�
	private double consumption;			//�ͺ�
	
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
	
//		@Title: getSurface()  
//	����@Description: ����������
//	����@param: void   
//	����@return: Double
//	����@throws: void
	public double getSurface()
	{
		return surface;
	}
	
//		@Title: setSurface()  
//	����@Description: �����������
//	����@param: Double surface
//	����@return: void
//	����@throws: void
	public void setSurface(double surface)
	{
		this.surface = surface;
	}
	
//		@Title: getInterior()  
//	����@Description: �����������
//	����@param: void   
//	����@return: Double
//	����@throws: void
	public double getInterior()
	{
		return interior;
	}
	
//		@Title: setInterior()  
//	����@Description: ������������
//	����@param: Double interior
//	����@return: void
//	����@throws: void
	public void setInterior(double interior)
	{
		this.interior = interior;
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
	
//		@Title: getConsumption()  
//	����@Description: ����ͺ�����
//	����@param: void   
//	����@return: Double
//	����@throws: void
	public double getConsumption()
	{
		return consumption;
	}
	
//		@Title: setConsumption()  
//	����@Description: �����ͺ�����
//	����@param: Double consumption
//	����@return: void
//	����@throws: void
	public void setConsumption(double consumption)
	{
		this.consumption = consumption;
	}
}
