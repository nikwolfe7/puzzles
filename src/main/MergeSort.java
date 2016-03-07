package main;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 6, 5, 0, 0, 11, 23, 56, 24, 77, 22, 123, 68, 1, 5, 0, 9, 8, 5, 3, 67, 3, 53, 65, 46, 64,
				654, 987, 5, 6, 8, 1111, 8, 714, 5, 669, 814, 61, 85, 12, 6, 4, 9, 8, 7, 4 };
		arr = mergeSort(arr);
		printArr(arr);
		checkSorted(arr);
	}

	private static void checkSorted(int[] arr) {
		if (arr.length > 1) {
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < arr[i - 1]) {
					System.out.println("NOT sorted!");
					return;
				}
			}
		}
	}

	private static void printArr(int[] arr) {
		String[] args = new String[arr.length];
		for (int i = 0; i < args.length; i++)
			args[i] = "" + arr[i];
		System.out.println("[" + String.join(",", args) + "]");
	}

	private static int[] mergeSort(int[] L) {
		int n = L.length;
		if (n > 1) {
			int m = Math.floorDiv(n, 2);
			int[] L1 = sublist(0, m, L);
			int[] L2 = sublist(m, L.length, L);
			L = merge(mergeSort(L1), mergeSort(L2));
		}
		return L;
	}

	private static int[] sublist(int i, int j, int[] list) {
		int[] sublist = new int[j - i];
		int k = 0;
		while (i < j)
			sublist[k++] = list[i++];
		return sublist;
	}

	private static int[] merge(int[] m, int[] n) {
		int[] merge = new int[m.length + n.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (k < merge.length) {
			if (i < m.length && j < n.length) {
				merge[k++] = (m[i] <= n[j]) ? m[i++] : n[j++];
			} else if (i < m.length) {
				merge[k++] = m[i++];
			} else {
				merge[k++] = n[j++];
			}
		}
		return merge;
	}

}
