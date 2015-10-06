package main;

public class Replace {

	public static void main(String[] args) {
		System.out.println(replace("Mississippi",'i','s'));
		System.out.println(replaceRecursive("Mississippi",'i','s'));
	}
	
	public static String replace(String str, char ch, char rp) {
		char[] arr = str.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch)
				arr[i] = rp;
		}
		return new String(arr);
	}
	
	public static String replaceRecursive(String str, char ch, char rp) {
		return replaceRecHelper(str.toCharArray(), 0, ch, rp);
	}
	
	public static String replaceRecHelper(char[] arr, int i, char ch, char rp) {
		if (i < arr.length) {
			if (arr[i] == ch)
				arr[i] = rp;
			replaceRecHelper(arr, (i+1), ch, rp);
		} 
		return new String(arr);
	}

}
