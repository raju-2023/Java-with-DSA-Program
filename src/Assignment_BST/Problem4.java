package Assignment_BST;

class Node3 {
	int data;
	Node3 left = null, right = null;

	Node3(int data) {
		this.data = data;
	}
}

public class Problem4 {
	// Recursive function to insert a key into a BST
	public static Node3 insert(Node3 root, int key) {
		// if the root is null, create a new node and return it
		if (root == null) {
			return new Node3(key);
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

	// Helper function to find the maximum value node in a given BST
	public static Node3 findMaximum(Node3 root) {
		while (root.right != null) {
			root = root.right;
		}

		return root;
	}

	// Recursive function to find inorder predecessor for a given key in the BST
	public static Node3 findPredecessor(Node3 root, Node3 prec, int key) {
		// base case
		if (root == null) {
			return prec;
		}

		// if a node with the desired value is found, the predecessor is the maximum
		// value node in its left subtree (if any)
		if (root.data == key) {
			if (root.left != null) {
				return findMaximum(root.left);
			}
		}

		// if the given key is less than the root node, recur for the left subtree
		else if (key < root.data) {
			return findPredecessor(root.left, prec, key);
		}

		// if the given key is more than the root node, recur for the right subtree
		else {
			// update predecessor to the current node before recursing
			// in the right subtree
			prec = root;
			return findPredecessor(root.right, prec, key);
		}
		return prec;
	}

	public static void main(String[] args) {
		int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
		Node3 root = null;
		for (int key : keys) {
			root = insert(root, key);
		}

		// find inorder predecessor for each key
		for (int key : keys) {
			Node3 prec = findPredecessor(root, null, key);

			if (prec != null) {
				System.out.println("The predecessor of node " + key + " is " + prec.data);
			} else {
				System.out.println("The predecessor doesn't exist for node " + key);
			}
		}
	}

}
