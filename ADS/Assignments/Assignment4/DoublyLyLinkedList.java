package DoublyLinkedList;

class DoublyLyLinkedList {

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
	
	public static void main(String[] args) {
		DoublyLyLinkedList d1 = new DoublyLyLinkedList();
		d1.head = new Node(6);
		
		Node second = new Node(7);
		d1.head.next = second;
		second.prev = d1.head;		// // connect prev link also because its doubly linked list
		
		Node third = new Node(8);
		second.next = third;
		third.prev = second;        // connect prev link also because its doubly linked list
		
		
		d1.display(d1.head);
	}
}

