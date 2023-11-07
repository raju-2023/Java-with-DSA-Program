package LinkedList;
public class Deletion_In_Link_List 
{
Node head;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	//Implementation of insertion of a node at the end
	public void insertAtEnd(int newData)
	{
		Node newNode = new Node(newData);
		
		//Linked list is Empty
		if(head == null)
		{
			head = new Node(newData);
			return;
		}
		
		//Linked List is not Empty
		newNode.next = null;
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
			
		}
		
		temp.next = newNode;
		return;
	}
	//Implementation of insertion of a node at the Beginning
	public void insertBeginning(int newData)
	{
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}
	
	//Implementation of insertion of a node after any node
	public void insertAfter(Node prev_node, int newData)
	{
		if(prev_node == null)
		{
			System.out.println("The previous node cannot contain null values");
			return;
		}
		
		Node newNode = new Node(newData);
		newNode.next = prev_node.next;
		prev_node.next = newNode;
	}
	
	//Implementation of deletion of a node link list
	void deleteNode(int position)
	{
		//linkedlist is empty
		if(head == null)
		{
			return;
		}
		Node temp = head;
		//deletion is in the beginning of the node
		if(position == 0)
		{
			head = temp.next;
			return;
		}
		
		//deletion is not in the beginning of the node
		for(int i=0;temp != null && i<position-1;i++)
		{
			temp = temp.next;
		}
		if(temp == null && temp.next == null)
		{
			return;
		}
		
		temp.next = temp.next.next;
	}
	//Implementation of displaying the linkedlist
	public void displayLL()
	{
		Node current = head;
		while(current != null)
		{
			System.out.print(current.data +" ");
			current = current.next;
		}
	}


	public static void main(String[] args) 
	{
		Deletion_In_Link_List list = new Deletion_In_Link_List();
		list.insertAtEnd(2);
		list.insertAtEnd(4);
		list.insertAtEnd(8);
		
		System.out.println("Before Insertion");
		list.displayLL();
		System.out.println();
		
		list.insertBeginning(9);
		System.out.println("Beginning Insertion");
		list.displayLL();
		System.out.println();
		
		list.insertAfter(list.head.next, 60);
		System.out.println("After Insertion");
		list.displayLL();
		System.out.println();
		
		list.deleteNode(2);
		System.out.println("Deletion of a node from a linkedlist");
		list.displayLL();
		System.out.println();
		
		
	}

}
