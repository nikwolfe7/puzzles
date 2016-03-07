package main;

public class TernaryTreeHeight {

	public int maxDepth(TernaryTreeNode root) {
		if(root == null) {
			return 0;
		}
		int leftHeight = maxDepth(root.left);
		int centerHeight = maxDepth(root.center);
		int rightHeight = maxDepth(root.right);
		return (leftHeight > centerHeight) ? (leftHeight+1) : ((centerHeight > rightHeight) ? (centerHeight+1) : (rightHeight+1));
	}

	public static void main(String[] args) {
		TernaryTreeHeight solution = new TernaryTreeHeight();
		TernaryTreeNode t1, t2, t3, t4, t5, t6;
		t1 = new TernaryTreeNode(1);
		t2 = new TernaryTreeNode(2);
		t3 = new TernaryTreeNode(3);
		t4 = new TernaryTreeNode(4);
		t5 = new TernaryTreeNode(5);
		t6 = new TernaryTreeNode(6);
		t1.left = t2;
		t1.center = t3;
		t1.right = t4;
		t2.left = t5;
		t5.left = t6;
		
		System.out.println("Height: " + solution.maxDepth(t5));

	}

}
