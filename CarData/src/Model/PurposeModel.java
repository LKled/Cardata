package Model;

//@ClassName: PurposeModel   
//@Description: ������ȱ�㹦��ģ�����������
//@author: SYN
//@date: 2018.9.4
public class PurposeModel {
	private String buytype;				//��������
	private String adv;					//�ŵ�
	private String dis;					//ȱ��
	
//		@Title: setBuytype()  
//	����@Description: ���ó�������
//	����@param: String type
//	����@return: void
//	����@throws: void
	public void setBuytype(String type) {
		this.buytype = type;
	}
	
//		@Title: getBuytype()  
//	����@Description: ��ó�������
//	����@param: void   
//	����@return: String
//	����@throws: void
	public String getBuytype() {
		return buytype;
	}
	
//		@Title: setAdv()  
//	����@Description: �����ŵ�
//	����@param: String adv
//	����@return: void
//	����@throws: void
	public void setAdv(String adv) {
		this.adv = adv;
	}
	
//		@Title: getAdv()  
//	����@Description: ����ŵ�
//	����@param: void   
//	����@return: String
//	����@throws: void
	public String getAdv() {
		return adv;
	}
	
//		@Title: setBuytype()  
//	����@Description: ����ȱ��
//	����@param: String dis
//	����@return: void
//	����@throws: void
	public void setDis(String dis) {
		this.dis = dis;
	}
	
//		@Title: getDis()  
//	����@Description: ���ȱ��
//	����@param: void   
//	����@return: String
//	����@throws: void
	public String getDis() {
		return dis;
	}
}
