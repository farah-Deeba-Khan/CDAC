package DoublyLinkedList;

class DoublyInserting {

	Node head;
	
	static class Node{
		int data;
		Node prev;
		Node next;
	
		Node(int d){
			data = d;
			prev = null;
			next = null;
		}
	}
	
	void display(Node n){
		Node p = null;
		while(n != null) {
			System.out.print(n.data +"-->");
			p=n;
			n = n.next;
		}
		System.out.println();
	}
	
	void append(int new_data) {
		Node new_node = new Node(new_data);
		Node last = head;
		new_node.next = null;
		
		if(head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}
		while(last.next != null) {
			last = last.next;
		}
		last.next = new_node; 
			new_node.prev = last;
	}
	
	// Insert in between
	void insertBetween(Node temp_node, int new_data) {
		if(temp_node == null) {
			System.out.println("Node or list doesn't exists");
		}
		
		Node new_node = new Node(new_data);
		
		if (temp_node.next != null) {
	        temp_node.next.prev = new_node;
	    }
		temp_node.next.prev = new_node;
	
		new_node.prev = temp_node;
		new_node.next = temp_node.next;
		temp_node.next = new_node;
		
		// Mam code: getting confused
//		new_node.next = temp_node.next;
//		temp_node.next = new_node;
//		new_node.prev = temp_node;
//		
//		if(new_node.next != null)
//			new_node.next.prev =new_node;
	}

	// Insert at the beginning
	void insert(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;	// it should be null
		
		if(head != null) 
			head.prev = new_node;
		
		head = new_node;
	}
	
	public static void main(String[] args) {
		DoublyInserting d1 = new DoublyInserting();
		System.out.println("Inserting Elements: ");
		d1.insert(6);
		d1.insert(7);
		d1.insert(8);
		d1.display(d1.head);
		
		System.out.println("Inserting in between: ");
		d1.insertBetween(d1.head, 1);
		d1.insertBetween(d1.head.next, 2);
		d1.insertBetween(d1.head.next.next, 3);
		d1.insertBetween(d1.head.next.next.next, 44);
		d1.display(d1.head);
		
		System.out.println("Inserting at the End: ");
		d1.append(24);
		d1.display(d1.head);
		
	}
}

