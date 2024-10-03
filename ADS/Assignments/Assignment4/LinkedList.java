package LinkedList;

class LinkedList {
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
	}
	
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.head = new Node(10);
		
		Node second = new Node(20);
		l1.head.next = second;
		
		Node third = new Node(30);
		second.next = third;
		
		l1.display();
	}

}
