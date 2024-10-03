package LinkedList;

class PrintMiddleElement {
	Node head;
	
	static class Node
	{
		int data;
		Node next;

	Node(int d) {
		data = d;
		next = null;
	}
	}
	
	void display() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data +"-->");
			n = n.next;
		}
		System.out.println();
	}
	
	int count() {
		Node pointer = head;
		int c = 0;
		while(pointer != null) {
			c++;
			pointer = pointer.next;
			
		}
		return c;
	}
	
	void findMiddleElement() {
		Node ptr1 = head;  // slow pointer
		Node ptr2 = head;  // fast pointer
		
		while(ptr1 != null && ptr2 != null) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next.next;
		}
		System.out.println("Middle Element: " +ptr1.data);
		
	}
	
	public static void main(String[] args) {
		PrintMiddleElement l1 = new PrintMiddleElement();
		l1.head = new Node(10);
		
		Node second = new Node(20);
		l1.head.next = second;
		
		Node third = new Node(30);
		second.next = third;
		
		Node fourth = new Node(40);
		third.next = fourth;
		
		l1.display();
		
		System.out.println("Count of Nodes: " +l1.count());
		
		l1.findMiddleElement();

	}
}
