package main;

public class Palindrome {

	public static void main(String[] args) {
		checkIfPalindrome(1);
		checkIfPalindrome(11);
		checkIfPalindrome(121);
		checkIfPalindrome(1221);
		checkIfPalindrome(12121);
		checkIfPalindrome(1121);
	}
	
	public static void checkIfPalindrome(int num) {
		if(isPalindrome(num))  {
			System.out.println(num + " is a palindrome!");
		} else { 
			System.out.println(num + " is NOT a palindrome!");
		}
	}
	
	public static boolean isPalindrome(int num) {
		String s = "" + num;
		String rev = new String(reverse(s.toCharArray()));
		return s.equals(rev);
	}
	
	public static char[] reverse(char[] arr) {
		int i, j;
		for(i = 0, j = arr.length-1; i < arr.length / 2; i++, j--) {
			swap(arr, i, j);
		}
		return arr;
	}

	private static void swap(char[] arr, int i, int j) {
		char c = arr[i];
		arr[i] = arr[j];
		arr[j] = c; 
	}
}
