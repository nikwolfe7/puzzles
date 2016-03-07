package main;

public class BinaryTreeHeight {

	public int maxDepth(BinaryTreeNode root) {
		if(root == null) {
			return 0;
		}
		int leftHeight = maxDepth(root.left);
		int rightHeight = maxDepth(root.right);
		return (leftHeight > rightHeight) ? (leftHeight+1) : (rightHeight+1);
	}
	
	public static void main(String[] args) {
		BinaryTreeHeight solution = new BinaryTreeHeight();
		BinaryTreeNode t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13;
		
		t1 = new BinaryTreeNode(1);
		t2 = new BinaryTreeNode(2);
		t3 = new BinaryTreeNode(3);
		t4 = new BinaryTreeNode(4);
		t5 = new BinaryTreeNode(5);
		t6 = new BinaryTreeNode(6);
		t7 = new BinaryTreeNode(7);
		t8 = new BinaryTreeNode(8);
		t9 = new BinaryTreeNode(9);
		t10 = new BinaryTreeNode(10);
		t11 = new BinaryTreeNode(11);
		t12 = new BinaryTreeNode(12);
		t13 = new BinaryTreeNode(13);
		
		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t3.right = t5;
		t4.left = t6;
		t6.left = t9;
		t6.right = t10;
		t5.left = t7;
		t5.right = t8;
		t8.left = t11;
		t8.right = t12;
		t12.left = t13;
		
		System.out.println("Height of t1: " + solution.maxDepth(t1));
		System.out.println("Height of t2: " + solution.maxDepth(t2));
		System.out.println("Height of t3: " + solution.maxDepth(t3));  
		System.out.println("Height of t6: " + solution.maxDepth(t6));
		System.out.println("Height of t7: " + solution.maxDepth(t7));
		System.out.println("Height of t4: " + solution.maxDepth(t4));
	}

}
