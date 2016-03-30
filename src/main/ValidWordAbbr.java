package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ValidWordAbbr {

	Map<String,Set<String>> map = new HashMap<>();
	
	public ValidWordAbbr(String[] dictionary) {
		for(String word : dictionary) {
			String abbr = getAbbr(word);
			if(!map.containsKey(abbr)) {
				map.put(abbr, new HashSet<String>());
			} 
			map.get(abbr).add(word); 
		}
	}

	public boolean isUnique(String word) {
		String abbr = getAbbr(word);
		boolean unique = !map.containsKey(abbr);
		unique = (!unique) ? map.get(abbr).size() == 1 && map.get(abbr).contains(word) : unique;
		System.out.println(unique);
		return unique;
	}

	private String getAbbr(String word) {
		if (word.length() <= 2) {
			return word;
		} else {
			return "" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1);
		}
	}

	public static void main(String[] args) {
		ValidWordAbbr sol = new ValidWordAbbr(new String[] {"hello"});
		sol.isUnique("hello");
	}
}
