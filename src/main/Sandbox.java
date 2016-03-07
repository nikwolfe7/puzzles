package main;

public class Sandbox {

	public static void main(String[] args) {
		int x = 10;
		for(int i = x/2 + 1; i <= x; i++) {
			System.out.println(x + " % " + i + " = " + (x % i));
		}
		testReverse("a");
		testReverse("aa");
		testReverse("aabaa");
		testReverse("aba");
		testReverse("aaaabbbbbbbbbdddddaaaa");
	}
	
	public static void testReverse(String s) {
		System.out.println(s + " : " + reverse(s));
	}
	
	public static String reverse(String s) {
		char[] arr = s.toCharArray();
		int i, j;
		for(i = 0, j = arr.length-1; i < arr.length / 2; i++, j--) {
			char c = arr[i];
			arr[i] = arr[j];
			arr[j] = c;
		}
		return new String(arr);
	}

}
