package main;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 4, 5, 1, 2, 3, 3, 4, 2, 5, 7, 3, 2 };
		while (!isSorted(arr)) {
			int i, j;
			for (i = 0; i < arr.length-1; i++) {
				j = i + 1;
				swap(arr, i, j);
			}
		}
		System.out.println("sorted!");
		for (int a : arr)
			System.out.print(a + " ");
	}
	
	
	private static void swap(int[] list, int a, int b) {
		if(list[a] < list[b]) {
			int temp = list[a];
			list[a] = list[b];
			list[b] = temp;
		}
	}
	
	private static boolean isSorted(int[] list) {
		boolean sorted = true;
		for(int i = 1; i < list.length; i++) {
			if(list[i-1] < list[i]) {
				sorted = false;
				break;
			}
		}
		return sorted;
	}

}
