package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BinaryTreePaths {

	public List<String> binaryTreePaths(BinaryTreeNode root) {
		List<String> paths = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		findPaths(root, paths, path);
		return paths;
	}
	
	public void findPaths(BinaryTreeNode node, List<String> paths, List<Integer> path) {
		if(node == null) {
			return;
		}
		path.add(node.val);
		if(node.right == null && node.left == null) {
			addPath(path, paths);
		} else {
			findPaths(node.left, paths, new ArrayList<>(path));
			findPaths(node.right, paths, new ArrayList<>(path));
		}
	}
	
	private void addPath(List<Integer> path, List<String> paths) {
		List<String> arr = path.stream().map(a -> a.toString()).collect(Collectors.toList());
		String s = String.join("->", arr);
		paths.add(s);
	}
	
	public static void main(String[] args) {
		BinaryTreeNode n1 = new BinaryTreeNode(1);
		BinaryTreeNode n2 = new BinaryTreeNode(2);
		BinaryTreeNode n3 = new BinaryTreeNode(3);
		BinaryTreeNode n5 = new BinaryTreeNode(5);
		n1.left = n2;
		n1.right = n3;
		n2.right = n5; 
		
		BinaryTreePaths solution = new BinaryTreePaths();
		List<String> paths = solution.binaryTreePaths(n1);
		for(String path : paths) System.out.println(path);
	}

}
