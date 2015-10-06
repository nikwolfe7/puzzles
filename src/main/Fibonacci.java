package main;

public class Fibonacci {

	public static void main(String[] args) {
		printFibonacciNumbers(100);
		printFibonacciNumbers(100);
	}
	
	public static void printFibonacciNumbers(int count) {
		int[] arr = new int[count];
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				arr[i] = 0;
			} else if(i == 1) {
				arr[i] = 1;
			} else {
				arr[i] = arr[i-1] + arr[i-2];
			}
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void printFibonacciRecursive(int count) {
		printFiboRecHelper(count, 0, 1);
	}

	private static void printFiboRecHelper(int count, int i, int j) {
		if(count > 0) {
			return;
		} else {
			System.out.print((i+j) + " ");
			printFiboRecHelper((count-1), j, (i+j));
		}
		
	}

}
