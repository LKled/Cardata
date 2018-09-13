package Test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import Model.CarYhModel;
import Shows.ShowYouHao;

public class ShowYouHaoTest {
	private ShowYouHao sy = new ShowYouHao();
	@Test
	public void testGetYouData() {
		List<CarYhModel> cy =sy.getYouData();
		for(CarYhModel i:cy) {
			System.out.println(i.getBuytype()+' '+
					' '+i.getAvgYh()+' '+i.getMaxYh()+
					' '+i.getMinYh());
		}
	}

}
