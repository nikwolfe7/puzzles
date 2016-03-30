package main;

import java.util.LinkedList;
import java.util.regex.Pattern;

public class GoogleThing {

	public int solution(String S) {
		String[] arr = S.split(Pattern.quote("\n"));
		LinkedList<String> list = new LinkedList<String>();
		String path = "";
		int totalPathLength = 0; 
		int currDepth = -1;
		for(int i = 0; i < arr.length; i++) {
			String str = arr[i];
			int depth = leadingSpaces(str);
			// keep appending to 
			if(depth > currDepth) {
				if(!isImage(str)) {
					list.add(str);
					currDepth = depth;
				} else {
					totalPathLength += path.length();
				}
			} else if(depth < currDepth) {
				
			}
		}
		return 0;
	}
	
	private String catLinks(LinkedList<String> list) {
		return "/" + String.join("/", list);
	}
	
	private boolean isImage(String s) {
		return s.contains(".gif") || s.contains(".jpeg") || s.contains(".gif");
	}
	
	private int leadingSpaces(String s) {
		int num = s.length();
		s = s.trim();
		return num - s.length();
	}
	

	public static void main(String[] args) {
		GoogleThing gt = new GoogleThing();
		int val = gt.solution("dir1\n dir11\n dir12\n  picture.jpeg\n  dir121\n  file1.txt\ndir2\n file2.gif");
		System.out.println(val);
	}
}
