package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import Shows.AdviseCars;
import Model.AdviseModel;

public class AdviseCarsTest {
	private AdviseCars ac = new AdviseCars();
	@Test
	public void testGetAdviseCars() {
		List<String> condition = new ArrayList<String>();
		condition.add("С�ͳ�");
		condition.add("5������");
		condition.add("���ʶ�");
		AdviseModel am = ac.getAdviseCars(condition);
		
		Assert.assertEquals("��������-����V3", am.getCarSort());
	}

}
