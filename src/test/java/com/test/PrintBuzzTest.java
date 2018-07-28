package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

public class PrintBuzzTest {

	@Test
	public void testSolution1() {
		int length = 100;
		List<Object> result = PrintBuzz.solution1(length);
		assertEquals(length, result.size());
		assertNotNull(result);
		if(result.size()>0) {
			for (int i = 0; i < result.size(); i++) {
				System.out.println(result.get(i));
			}
		}
		
	}
	
	@Test
	public void testSolution2() {
		int length = 100;
		List<Object> result = PrintBuzz.solution2(length);
		assertEquals(length, result.size());
		assertNotNull(result);
		if(result.size()>0) {
			for (int i = 0; i < result.size(); i++) {
				System.out.println(result.get(i));
			}
		}
		
	}

}
