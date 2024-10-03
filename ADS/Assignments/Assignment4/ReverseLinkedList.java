package LinkedList;

class ReverseLinkedList {
	Node head;
	
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
	
	void display(){
		Node n = head;
		while(n!=null) {
			System.out.print(n.data +"-->");
			n = n.next;
		}
		System.out.println();
	}
	
	Node reverse(Node n) {
		Node prev = null;
		Node current = n; // connected to head
		Node next1 = null;
		
		while(current != null) {
			next1 = current.next;
			current.next = prev;
			prev = current;
			current = next1;
		}
		n = prev;
		return n;
		
	}
	
	public static void main(String[] args) {
		ReverseLinkedList l1 = new ReverseLinkedList();
		l1.head = new Node(10);
		
		Node second = new Node(20);
		l1.head.next = second;
		
		Node third = new Node(30);
		second.next = third;
		
		l1.display();
		
		l1.head = l1.reverse(l1.head);
		l1.display();
	}

}
