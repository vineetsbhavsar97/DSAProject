package com.nt.gl.service;

public class RightSkewedTree {
	public static Node node;
	static Node previousNode = null;
	public static Node headNode = null;

	public void Skewed(Node root, int order) {
		if (root == null) {
			return;
		}
		if (order > 0) {
			Skewed(root.rightNode, order);
		} else {
			Skewed(root.leftNode, order);
		}
		Node rightNode = root.rightNode;
		Node leftNode = root.leftNode;
		if (headNode == null) {
			headNode = root;
			root.leftNode = null;
			previousNode = root;
		} else {
			previousNode.rightNode = root;
			root.leftNode = null;
			previousNode = root;
		}
		if (order > 0) {
			Skewed(leftNode, order);
		} else {
			Skewed(rightNode, order);
		}
	}

	public void traverseRightSkewedTree(Node rootNode) {
		if (rootNode == null) {
			return;
		}
		System.out.print(rootNode.element + " ");
		traverseRightSkewedTree(rootNode.rightNode);
	}
}
