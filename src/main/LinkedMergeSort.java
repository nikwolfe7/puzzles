package main;

public class LinkedMergeSort {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 6, 5, 0, 0, 11, 23, 56, 24, 77, 22, 123, 68, 1, 5, 0, 9, 8, 5, 3, 67, 3, 53, 65, 46, 64,
				654, 987, 5, 6, 8, 1111, 8, 714, 5, 669, 814, 61, 85, 12, 6, 4, 9, 8, 7, 4 };
		
	}
	
	private static LinkedNode convertToLinkedList(int[] args) {
		if(args.length >= 1) {
			LinkedNode node = new LinkedNode(args[0]);
			for(int i = 1; i < args.length; i++) {
				LinkedNode n = new LinkedNode(args[i]); 
				
			}
			return node;
		} else {
			return null;
		}
	}

}
