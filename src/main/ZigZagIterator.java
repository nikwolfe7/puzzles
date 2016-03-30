package main;

import java.util.Arrays;
import java.util.List;
/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */

public class ZigZagIterator {

	List<Integer> v1, v2;
	int v1count, v2count;
	
	public ZigZagIterator(List<Integer> v1, List<Integer> v2) {
		this.v1 = v1;
		this.v2 = v2;
		this.v1count = 0;
		this.v2count = 0;
	}
	
	public int next() {
		if (v2count >= v2.size()) {
			return v1.get(v1count++);
		} else if (v1count >= v1.size()) {
			return v2.get(v2count++);
		} else if (v1count == v2count) {
			return v1.get(v1count++);
		} else if (v1count > v2count) {
			return v2.get(v2count++);
		} else if (v1count < v2count) {
			return v1.get(v1count++);
		} else {
			return 0;
		}
	}
	
	public boolean hasNext() {
		return (v1count < v1.size() || v2count < v2.size()); 
	}
	
	public static void main(String[] args) {
		ZigZagIterator i = new ZigZagIterator(Arrays.asList(1,3,5,7,9), Arrays.asList(2,4,6,8));
		while (i.hasNext())
			System.out.println(i.next());
	}

}
