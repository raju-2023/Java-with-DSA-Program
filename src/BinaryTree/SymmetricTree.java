package BinaryTree;

//A class to store a bonary tree node
class Node1
{
	int data;
	Node1 left = null,right = null;
	
	Node1(int data)
	{
		this.data = data;
	}
}

public class SymmetricTree {
	//Function to check is the tree is symmetric for left node and right node.
	static boolean checkSymmetric(Node1 leftNode,Node1 rightNode)
	{
		if(leftNode == null && rightNode == null)
		{
			return true;
		}
		if(leftNode == null || rightNode == null)
		{
			return false;
		}
		return checkSymmetric(leftNode.left, rightNode.right) && checkSymmetric(leftNode.right, rightNode.left);
	}
	public static void main(String[] args) {
		Node1 root = new Node1(1);
		root.left = new Node1(2);
		root.right = new Node1(2);
		root.left.right = new Node1(5);
		root.left.left = new Node1(4);
		root.right.right = new Node1(4);
		root.right.left = new Node1(5);
		
		if(root == null)
		{
			System.out.println("The given tree is Symmetric : ");
		}
		else
		{
			System.out.println("The given three is Symmetric : "+checkSymmetric(root.left,root.right));
		}
	}

}
