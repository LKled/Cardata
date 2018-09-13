package Test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import Model.CharacterModel;
import Shows.ShowCharacter;

public class ShowCharacterTest {
	private ShowCharacter sc = new ShowCharacter();
	@Test
	public void testGetCharacter() {
		List<CharacterModel> carList = sc.getCharacter();
		for(CharacterModel i:carList) {
			System.out.println(i.getCarSort()+' '+i.getComfort()+' '
					+i.getConsumption()+' '+i.getControl()+' '+i.getPower()
					+' '+i.getSpace()+' '+i.getSurface());
		}
	}

	@Test
	public void testGetCarName() {
		List<String> carname = sc.getCarName();
		for(String i:carname) {
			System.out.println(i);
		}
	}

	@Test
	public void testGetCharacterString() {
		String car = "ÏÄÀÊ 2017¿î 380TSI Ë«ÀëºÏ ÊæÏí°æ 6×ù";
		CharacterModel cm = sc.getCharacter(car);		
		Assert.assertEquals(5, cm.getComfort(),0.001);
		Assert.assertEquals(5, cm.getConsumption(),0.001);
		Assert.assertEquals(5, cm.getControl(),0.001);
		Assert.assertEquals(5, cm.getPower(),0.001);
		Assert.assertEquals(5, cm.getSpace(),0.001);
		Assert.assertEquals(4, cm.getSurface(),0.001);
	}

}
