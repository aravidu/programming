package com.ara.programming.recursion;

public class CreateBstFromArray {

	public static void main(String[] args) {
		int[] arr = {5,7,10,14,8,1,20};
		
		System.out.println(createBst(arr).getData());
		System.out.println(searchBst(9));
	}
	
	private static TreeNode createBst(int[] arr) {
		TreeNode root = new TreeNode(arr[0]); 
		for (int i=1;i<arr.length;i++) {
			int val = arr[i];
			if (val<root.getData()) {
				handleLeftChild(root,val);
			} else {
				handleRightChild(root,val);
			}
		}
		return root;
	}
	
	private static void handleLeftChild(TreeNode root, int left) {
		TreeNode existingLeft = root.getLeft();
		if (existingLeft==null) {
			TreeNode leftNode = new TreeNode(left);
			root.setLeft(leftNode);
		} else {
			// left not null
			handleLeftChild(existingLeft, left);
		}
	}
	
	private static void handleRightChild(TreeNode root, int right) {
		TreeNode existingRight = root.getRight();
		if (existingRight==null) {
			TreeNode rightNode = new TreeNode(right);
			root.setRight(rightNode);
		} else {
			// right not null
			handleRightChild(existingRight, right);
		}
	}

	private static boolean searchBst(int val) {
		boolean exists = false;
		return exists;
	}
	
}

class TreeNode {
	private int data;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
}
