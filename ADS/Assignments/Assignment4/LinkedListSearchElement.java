package LinkedList;

class LinkedListSearchElement {
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
	
	boolean search(int x) {
		Node n = head;
		while(n != null) {
			if(n.data == x) {
				System.out.println("Element found: " +n.data);
				return true; // element found
			}
			n = n.next;
		}
		System.out.println("Element not found: " +x);
		return false;
	}
	
	public static void main(String[] args) {
		LinkedListSearchElement l1 = new LinkedListSearchElement();
		l1.head = new Node(10);
		
		Node second = new Node(20);
		l1.head.next = second;
		
		Node third = new Node(30);
		second.next = third;
		
		l1.display();
		
		l1.search(20);
		l1.search(50);
	}

}
