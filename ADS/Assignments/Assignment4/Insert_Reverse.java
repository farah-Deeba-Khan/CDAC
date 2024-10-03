package DoublyLinkedList;

class Insert_Reverse {

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
		System.out.println("Forward Direction");
		while(n != null) {
			System.out.print(n.data +"-->");
			p=n;
			n = n.next;
		}
		System.out.println();
		System.out.println("Backward Direction");
		while(p != null) {
			System.out.print(p.data + "<--");
			p = p.prev;
		}
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
		Insert_Reverse d1 = new Insert_Reverse();
		
		d1.insert(6);
		d1.insert(7);
		d1.insert(8);
		
		d1.display(d1.head);
	}
}

