package com.nt.gl;

import com.nt.gl.service.Node;
import com.nt.gl.service.RightSkewedTree;

public class Main {
	public static void main(String[] args) {
		RightSkewedTree tree = new RightSkewedTree();
		RightSkewedTree.node = new Node(50);
		RightSkewedTree.node.leftNode = new Node(30);
		RightSkewedTree.node.rightNode = new Node(60);
		RightSkewedTree.node.leftNode.leftNode = new Node(10);
		RightSkewedTree.node.rightNode.leftNode = new Node(55);
		int order = 0;
		tree.Skewed(RightSkewedTree.node, order);
		tree.traverseRightSkewedTree(RightSkewedTree.headNode);
	}
}
