package Assignment_BST;

import java.util.concurrent.atomic.AtomicInteger;

//A class to store a BST node
class Node1 {
	int data;
	Node1 left = null, right = null;

	Node1(int data) {
		this.data = data;
	}
}

public class Problem2 {

	// Recursive function to insert a key into a BST
	public static Node1 insert(Node1 root, int key) {
		// if the root is null, create a new node and return it
		if (root == null) {
			return new Node1(key);
		}

		// if the given key is less than the root node, recur for the left subtree
		if (key < root.data) {
			root.left = insert(root.left, key);
		}

		// if the given key is more than the root node, recur for the right subtree
		else {
			root.right = insert(root.right, key);
		}

		return root;
	}

	// Function to find the k'th largest node in the BST.
	// Here, `i` denotes the total number of nodes processed so far
	public static Node1 kthLargest(Node1 root, AtomicInteger i, int k) {
		// base case
		if (root == null) {
			return null;
		}

		// search in the right subtree
		Node1 left = kthLargest(root.right, i, k);

		// if k'th largest is found in the left subtree, return it
		if (left != null) {
			return left;
		}

		// if the current node is k'th largest, return its value
		if (i.incrementAndGet() == k) {
			return root;
		}

		// otherwise, search in the left subtree
		return kthLargest(root.left, i, k);
	}

	// Function to find the k'th largest node in the BST
	public static Node1 kthLargest(Node1 root, int k) {
		// maintain index to count the total number of nodes processed so far
		AtomicInteger i = new AtomicInteger(0);

		// traverse the tree in an inorder fashion and return k'th node
		return kthLargest(root, i, k);
	}

	public static void main(String[] args) {
		int[] keys = { 15, 10, 20, 8, 12, 16, 25 };

		Node1 root = null;
		for (int key : keys) {
			root = insert(root, key);
		}

		int k = 2;
		Node1 node = kthLargest(root, k);

		if (node != null) {
			System.out.println(node.data);
		} else {
			System.out.println("Invalid Input");
		}
	}

}
