package LinkedList;

class LinkedListBegin {
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
	
	void insertFirst(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
		System.out.println("Inserting at beginning: ");
	}
	
	public static void main(String[] args) {
		LinkedListBegin l1 = new LinkedListBegin();
		l1.head = new Node(10);
		
		Node second = new Node(20);
		l1.head.next = second;
		
		Node third = new Node(30);
		second.next = third;
		
		l1.display();
		
		l1.insertFirst(40);
		l1.display();
		
	}

}