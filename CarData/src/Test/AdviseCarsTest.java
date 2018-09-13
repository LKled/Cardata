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
		condition.add("小型车");
		condition.add("5万以下");
		condition.add("舒适度");
		AdviseModel am = ac.getAdviseCars(condition);
		
		Assert.assertEquals("长安汽车-悦翔V3", am.getCarSort());
	}

}
