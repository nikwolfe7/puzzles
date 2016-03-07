package main;

public class HasPathSum {

	public boolean hasPathSum(BinaryTreeNode root, int sum) {
		return false;
	}
	
	public static void main(String[] args) {
		HasPathSum solution = new HasPathSum();
		BinaryTreeNode t1, t2, t3, t4, t5, t6, t7, t8, t9;
		
		t1 = new BinaryTreeNode(5);
		t2 = new BinaryTreeNode(4);
		t3 = new BinaryTreeNode(8);
		t4 = new BinaryTreeNode(11);
		t5 = new BinaryTreeNode(13);
		t6 = new BinaryTreeNode(4);
		t7 = new BinaryTreeNode(7);
		t8 = new BinaryTreeNode(2);
		t9 = new BinaryTreeNode(1);
		
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t4.left = t7;
		t4.right = t8;
		t3.left = t5;
		t3.right = t6;
		t6.right = t9;
		
		int path = 22; 
		System.out.println("Has path sum = " + path + ": " + solution.hasPathSum(t1, path));
		
	}

}
