package com.zener.bst;

public class BST {
	
	public static Node createNewNode(int val) {
		Node node = new Node();
		node.data = val;
		node.left = null;
		node.right = null;
		return node;
	}
	
	public static Node insert(Node node, int val) {
		
		if(node == null) {
			node = createNewNode(val);
		}else {
			if(val < node.data) {
				node.left = insert(node.left,val);
			}else{
				node.right = insert(node.right,val);
			}
		}
		return node;
	}
	
	public static Node delete(Node node, int val) {
		if(node == null) {
			return null;
		}
		if(val < node.data) {
			node.left = delete(node.left,val);
		}else if(val > node.data) {
			node.right = delete(node.right,val);
		}else {
			if(node.left==null || node.right==null) {
				Node temp = null;
				temp = node.left == null?node.right:node.left;
				return temp;
			}else {
				Node successor = getSuccessor(node);
				node.data = successor.data;
				node.right = delete(node.right,successor.data);
			}
		}
		return node;
	}
	
	public static Node getSuccessor(Node node) {
		if(node == null) {
			return null;
		}
		Node temp = node.right;
		while(temp.left != null) {
			temp = temp.left;
		}
		return temp;
	}

}
