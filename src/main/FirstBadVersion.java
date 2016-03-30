package main;

public class FirstBadVersion {

	boolean[] arr = new boolean[100000];

	public int firstBadVersion(int n) {
		return n;

	}

	private boolean firstBad(int x) {
		if (x > 0) {
			return (isBadVersion(x) && !isBadVersion(x - 1));
		} else {
			return isBadVersion(x);
		}
	}

	private boolean isBadVersion(int x) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {
		FirstBadVersion fbv = new FirstBadVersion();
		
	}

}
