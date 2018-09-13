package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import Model.ScoreModel;
import Shows.ShowScores;

public class ShowScoresTest {
	private ShowScores ss = new ShowScores();
	@Test
	public void testGetScores() {
		ArrayList<ScoreModel> sm = ss.getScores();
		for(ScoreModel i:sm) {
			System.out.println(i.getType()+' '+i.getSort()+' '+i.getScore());
		}
	}

	@Test
	public void testGetTop() {
		String carsort = "MPV";
		HashMap<String,Integer> t = new HashMap<String,Integer>();
		t.put("Èð·çM3", 18);
		t.put("Ù¤Í¾im", 18);
		t.put("Ó¢ÖÂ737", 17);
		t.put("î£ÐÐS50", 16);
		t.put("ÍþÍúM50F", 16);
		
		Assert.assertEquals(t, ss.getTop(carsort));
		
	}

}
