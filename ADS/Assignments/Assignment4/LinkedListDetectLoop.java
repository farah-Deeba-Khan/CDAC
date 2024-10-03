package LinkedList;

class LinkedListDetectLoop {
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
	
	boolean detectLoop(Node head) {
		Node slowPointer = head;
		Node fastPointer = head;
		
		while(fastPointer != null && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if(slowPointer == fastPointer) {
				System.out.println("Loop exists");
				return true;
			}
		}
		System.out.println("Loop doesn't exists");
		return false;
	}
	public static void main(String[] args) {
		LinkedListDetectLoop l1 = new LinkedListDetectLoop();
		l1.head = new Node(10);
		
		Node second = new Node(20);
		l1.head.next = second;
		
		Node third = new Node(30);
		second.next = third;
		
		third.next = l1.head;  // connected third node next to head
		
		//l1.display();     // getting printed again n again that's why commented
		l1.detectLoop(l1.head);
	}

}
