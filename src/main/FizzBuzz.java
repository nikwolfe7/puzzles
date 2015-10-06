package main;

public class FizzBuzz {

	public static void main(String[] args) {
		printFizzBuzz(50);
	}
	
	public static void printFizzBuzz(int limit) {
		while(limit > 0) {
			String output = "";
			if(limit % 3 == 0) {
				output += "Fizz";
			}
			if(limit % 5 == 0) {
				output += "Buzz";
			}
			System.out.println(limit + ": " + output);
			limit--;
		}
	}
	
}
