package Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import Shows.ShowArea;

public class ShowAreaTest {
	private ShowArea sa = new ShowArea();
	
	@Test
	public void testReaddata() {
		Map<String, Integer> s = sa.readdata();
		for (Entry<String, Integer> i : s.entrySet()) {
			System.out.println(i);
		}
	}
}
