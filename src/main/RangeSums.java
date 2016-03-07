package main;

import java.util.Arrays;

public class RangeSums {
	public int countRangeSum(int[] nums, int lower, int upper) {
		int[][] arr = new int[nums.length][nums.length];
		printVec(nums);
		Arrays.sort(nums);
		printVec(nums);
		int sumsCount = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int val = sum(nums, i, j);
				arr[i][j] = val;
				if (val >= lower && val <= upper) {
					sumsCount++;
				}
			}
		}
		printMatrix(arr, lower, upper);
		System.out.println("Range Sums: " + sumsCount);
		return sumsCount;
	}
	
	private void printVec(int[] arr) {
		System.out.print("[ ");
		for(int x : arr)
			System.out.print(x + " ");
		System.out.println("]\n");
	}

	private void printMatrix(int[][] arr, int lower, int upper) {
		if (arr.length > 0) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i; j < arr[0].length; j++) {
					int val = arr[i][j];
					if (val >= lower && val <= upper) {
						System.out.print(arr[i][j] + "\t");
					} else {
						System.out.print(".\t");
					}
				}
				System.out.println();
			}
		}
	}

	private int sum(int[] arr, int begin, int end) {
		int s = 0;
		for (int i = begin; i <= end; i++) {
			s += arr[i];
		}
		return s;
	}

	public static void main(String[] args) {
		RangeSums rs = new RangeSums();
		int[] nums = new int[] { -2, 5, 1, 2, 3, -5, -4, 6, 1, 2, 4, 1, 3, 9, 0, 0, -3, 4, 5, 7, 5, 3, 2, 5, 1, 2, 5, 1, 3, 8, 9, 0, -2, -7, -9 };
		int lower, upper;
		lower = -6;
		upper = 6;
		rs.countRangeSum(nums, lower, upper);
	}
}
