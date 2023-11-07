package LinkedList.AssignmentLinkedList;
class AssignmentProblem3 
{
    static Node head;
  
    static class Node 
    {
        int data;
        Node next;
        
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    void removeDuplicates()
    {
        Node temp = head, prev = head;
 
        while (temp != null) 
        {
            if (temp.data != prev.data) 
            {
                prev.next = temp;
                prev = temp;
            }
            
            temp = temp.next;
        }
        
        if (prev != temp)
            prev.next = null;
    }
 
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
 
    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
 
    public static void main(String args[])
    {
    	AssignmentProblem3 llist = new AssignmentProblem3();
        llist.push(3);
        llist.push(3);
        llist.push(2);
        llist.push(1);
        llist.push(1);
 
        System.out.print("List before removal of duplicates :");
        llist.printList();
 
        llist.removeDuplicates();
 
        System.out.print("List after removal of elements: ");
        llist.printList();
    }
}
/*
Output:
	List before removal of duplicates :1 1 2 3 3 
	List after removal of elements: 1 2 3 
*/