package com.nt.gl.service;

public class Node {
		public int element;
		public Node leftNode;
		public Node rightNode;

		public Node(int value) {
			element = value;
			leftNode = rightNode = null;
		}
}
