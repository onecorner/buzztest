package com.test;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @Author jhon
 * @since 2018-07-28 22:37:12
 * @desc print charactor by rule
 */
public class PrintBuzz {


	/**
	 * if the number is divisible by 3 print fizzy
	 * if the number is divisible by 5 print buzz
	 * if multiples of both 3 and 5 print fizzbuzz
	 * 
	 * @param numberRange:
	 *            a number used by "for" loop
	 */
	public static List<Object> solution1(int numberRange) {
		List<Object> result = new LinkedList<Object>();
		if (numberRange <= 0) {
			return new LinkedList<Object>();
		}
		for (int i = 1; i <= numberRange; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				result.add("FizzBuzz");
			} else {
				if (i % 3 == 0) {
					result.add("Fizz");
				} else if (i % 5 == 0) {
					result.add("Buzz");
				} else {
					result.add(i);
				}
			}
		}
		return result;
	}
	
	
	
	/**
	 * if the number is divisible by 3 print fizzy
	 * if the number is divisible by 5 print buzz
	 * if multiples of both 3 and 5 print fizzbuzz
	 * new requirements:
	 * 	    a number is fizz it is divisible by 3 or if it has a 3 in it
	 *      a numebr is buzz it is divisible by 5 or if it has a 5 in it
	 * @param numberRange:
	 *            a number used by "for" loop
	 */
	public static List<Object> solution2(int numberRange) {
		List<Object> result = new LinkedList<Object>();
		if (numberRange <= 0) {
			return new LinkedList<Object>();
		}
		for (int i = 1; i <= numberRange; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				result.add("FizzBuzz");
			} else {
				if (i % 3 == 0 || Pattern.compile(".*[3]+.*").matcher(i+"").matches()) {
					result.add("Fizz");
				} else if (i % 5 == 0  || Pattern.compile(".*[5]+.*").matcher(i+"").matches()) {
					result.add("Buzz");
				} else {
					result.add(i);
				}
			}
		}
		return result;
	}

}
