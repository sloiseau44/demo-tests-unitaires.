package dev.utils;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringUtilsTest {
	@Parameters
	public static Collection<Object[]> datas(){
		List<Object[]> datas = new ArrayList<Object[]>();
		datas.add(new Object[]{"chien", "chine", 2});
		datas.add(new Object[]{"chat", "chats", 1});
		datas.add(new Object[]{"machins", "machine", 1});
		datas.add(new Object[]{"aviron", "avion", 1});
		return datas;
		
	}
	
	@Parameter public String valTest1;
	@Parameter (value=1) public  String valTest2;
	@Parameter (value=2) public  int resultat;
	
	@Test
	public void testLevenshteinDistanceParam(){
		assertEquals(resultat, StringUtils.levenshteinDistance(valTest1, valTest2));
	}

	@Test
	public void testLevenshteinDistance(){		
		assertEquals(2,StringUtils.levenshteinDistance("chien", "chine"));	
		assertEquals(1,StringUtils.levenshteinDistance("chat", "chats"));	
		assertEquals(1,StringUtils.levenshteinDistance("machins", "machine"));	
		assertEquals(1,StringUtils.levenshteinDistance("aviron", "avion"));			
	}
	
	@Test (expected   = NullPointerException.class)
	public void testLevenshteinDistanceNull(){
		StringUtils.levenshteinDistance("chien", null);
	}
}
