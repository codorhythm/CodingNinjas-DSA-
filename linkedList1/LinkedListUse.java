package linkedList1;

public class LinkedListUse {
	
	public static LinkedListNode<Integer> createLinkedList()
	{

		LinkedListNode<Integer> node1 = new LinkedListNode<Integer>(10);
		LinkedListNode<Integer> node2 = new LinkedListNode<Integer>(20);
		LinkedListNode<Integer> node3 = new LinkedListNode<Integer>(30);
		LinkedListNode<Integer> node4 = new LinkedListNode<Integer>(40);
		LinkedListNode<Integer> node5 = new LinkedListNode<Integer>(50);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		return node1;
	}

	public static void main(String[] args) {
		
		
			
	}

}