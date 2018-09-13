package Test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import Model.CarModel;
import Shows.ShowPraiseNumber;

public class ShowPraiseNumberTest {
	private ShowPraiseNumber sp = new ShowPraiseNumber();
	@Test
	public void testGetPraiseNumber() {
		List<CarModel> car = sp.getPraiseNumber();
		for(CarModel i:car) {
			System.out.println(i.getCarName()+' '+i.getBuytime()+' '+i.getPraiseNum());
		}
	}

	@Test
	public void testGetCarName() {
		List<String> carname = sp.getCarName();
		for(String i:carname) {
			System.out.println(i);
		}
	}

}
