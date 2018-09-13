package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import Model.PurposeModel;
import Shows.ShowPurpose;

public class ShowPurposeTest {
	private ShowPurpose sp = new ShowPurpose();
	@Test
	public void testGetCarList() {
		List<PurposeModel> cl = sp.getCarList();
		for(PurposeModel i:cl) {
			System.out.println(i.getBuytype()+' '+i.getAdv()+' '+i.getDis());
		}
	}

	@Test
	public void testGetAdv() {
		String carname = "ECϵ��";
		List<String> advantage = new ArrayList();
		advantage.add("ʱ�ж���");
		advantage.add("��������");
		Assert.assertEquals(advantage, sp.getAdv(carname));
	}

	@Test
	public void testGetDis() {
		String carname = "ECϵ��";
		List<String> disadvantage = new ArrayList();
		disadvantage.add("�ռ����");
		disadvantage.add("���ϲ���");
		Assert.assertEquals(disadvantage, sp.getDis(carname));
	}

	@Test
	public void testGetCarName() {
		List<String> carname = sp.getCarName();
		for(String i:carname) {
			System.out.println(i);
		}
	}

}
