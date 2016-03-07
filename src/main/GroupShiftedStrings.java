package main;

import java.util.ArrayList;
import java.util.List;

public class GroupShiftedStrings {

	public static List<List<String>> groupStrings(String[] strings) {
		List<List<String>> groups = new ArrayList<>();
		for(int i = 0; i < strings.length; i++) {
			String s = strings[i];
			List<String> grp = new ArrayList<>();
		}
		
		
		return groups;
	}

	public static void main(String[] args) {
		String[] strs = {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};
		System.out.println(groupStrings(strs));
	}

}
