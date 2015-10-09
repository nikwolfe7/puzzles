package main;

public class Palindrome {

	public static void main(String[] args) {
		int num = 123454321;
		if(isPalindrome(num)) 
			System.out.println(num + " is a palindrome!");
		else 
			System.out.println(num + " is NOT a palindrome!");
		
	}
	
	public static boolean isPalindrome(int num) {
		char[] arr = ("" + num).toCharArray();
		char[] rev = new char[arr.length];
		rev = reversePalindrome(arr, rev, 0, rev.length-1);
		String a, b;
		a = new String(arr);
		b = new String(rev);
		return a.equals(b);
	}
	
	public static char[] reversePalindrome(char[] arr, char[] rev, int i, int j) {
		if(j >= 0) {
			rev[j] = arr[i];
			reversePalindrome(arr, rev, (i+1), (j-1));
		} 
		return rev;
	}

}
