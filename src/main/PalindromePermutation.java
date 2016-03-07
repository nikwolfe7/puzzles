package main;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {

	public static boolean canPermutePalindrome(String s) {
		Map<Character, Integer> map = getCharCounts(s);
		int oddCount = 0;
		for(Integer i : map.values()) {
			oddCount = (i % 2 == 0) ? oddCount : oddCount + 1;
		}
		return oddCount <= 1; 
	}
	
	private static Map<Character, Integer> getCharCounts(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>(); 
		char[] arr = s.toCharArray();
		for(Character c : arr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		return map; 
	}

	public static void check(String s) {
		System.out.println(s + " is " + canPermutePalindrome(s));
	}
	
	public static void main(String[] args) {
		check("carerac");
	}

}
