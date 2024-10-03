package LinkedList;

class LinkedListDeleteElement {
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
	
	// Deleting element from first or last or in between
	void delete(int key) {
		Node temp = head;
		Node prev = null;
		// Deletion at begining
		if(temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		// Deletion in between and last node
		while(temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		// Element doesnot exists 
		if(temp == null) {
			System.out.println("Element doesnot exists!");
			return;
		}
		prev.next = temp.next;
		System.out.println("Deleting: "+ key);
	}
	
	// Deletion with position
	void deleteNode(int position) { //2
		if(head == null) {
			return;
		}
		Node temp = head;
		if(position == 0) {
			head = temp.next;
			return;
		}
		for(int i = 0; temp != null && i<position-1; i++) {
		temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListDeleteElement l1 = new LinkedListDeleteElement();
		l1.head = new Node(10);
		
		Node second = new Node(20);
		l1.head.next = second;
		
		Node third = new Node(30);
		second.next = third;
		
		l1.display();
		
		l1.delete(25);
		l1.display();
		
		l1.delete(20);
		l1.display();
		
		l1.deleteNode(0);
	}

}
