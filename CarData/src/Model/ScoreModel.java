package Model;

//@ClassName: ScoreModel   
//@Description: �û����ֹ���ģ�����������
//@author: LYJ
//@date: 2018.8.28
public class ScoreModel {
	private String carsort;				//����
	private String cartype;				//����
	private int score;					//������
	
//		@Title: getSort()  
//	����@Description: ��ó�������
//	����@param: void   
//	����@return: String
//	����@throws: void
	public String getSort()
	{
		return carsort;
	}
	
//		@Title: setSort()  
//	����@Description: ���ó�������
//	����@param: String sort
//	����@return: void
//	����@throws: void
	public void setSort(String sort)
	{
		this.carsort = sort;
	}
	
//		@Title: getType()  
//	����@Description: ��ó�������
//	����@param: void   
//	����@return: String
//	����@throws: void
	public String getType()
	{
		return cartype;
	}
	
//		@Title: setType()  
//	����@Description: ���ó�������
//	����@param: String type
//	����@return: void
//	����@throws: void
	public void setType(String type)
	{
		this.cartype = type;
	}
	
//		@Title: getScore()  
//	����@Description: ���������
//	����@param: void   
//	����@return: int
//	����@throws: void
	public int getScore()
	{
		return score;
	}
	
//		@Title: setScore()  
//	����@Description: ����������
//	����@param: int score
//	����@return: void
//	����@throws: void
	public void setScore(int score)
	{
		this.score = score;
	}
}
