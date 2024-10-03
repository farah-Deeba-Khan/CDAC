package LinkedList;

class LinkedListLast {
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
		System.out.println("");
	}
	
	void addLast(int new_data) {
		Node new_node = new Node(new_data);
		if(head == null) {
			head = new Node(new_data);
			System.out.println(head.data);
			return;		// not mandatory because method returntype is void
		}
		new_node.next = null;
		Node LastPointer = head;
		while(LastPointer.next != null) {
			LastPointer = LastPointer.next;
		}
		LastPointer.next = new_node;
		System.out.println("Inserting at Last: ");
		return;		// not mandatory because method returntype is void
	}
	
	public static void main(String[] args) {
		LinkedListLast l1 = new LinkedListLast();
		l1.head = new Node(10);
		
		Node second = new Node(20);
		l1.head.next = second;
		
		Node third = new Node(30);
		second.next = third;
		
		l1.display();
		
		l1.addLast(45);
		l1.display();
		
		l1.addLast(50);
		l1.display();
	}

}
