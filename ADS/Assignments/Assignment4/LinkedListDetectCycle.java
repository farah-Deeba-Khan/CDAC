package LinkedList;

class LinkedListDetectCycle {
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
				System.out.println("Cycle exists");
				return true;
			}
		}
		System.out.println("Cycle doesn't exists");
		return false;
	}
	public static void main(String[] args) {
		LinkedListDetectCycle l1 = new LinkedListDetectCycle();
		l1.head = new Node(1);
		
		Node second = new Node(2);
		l1.head.next = second;
		
		Node third = new Node(3);
		second.next = third;
		
		Node four = new Node(4);
		third.next = four;
		
		Node five = new Node(5);
		four.next = five;
		
		five.next = third;  // connected fifth node next to third to make a cycle
		
		//l1.display();     // getting printed again n again that's why commented
		l1.detectLoop(l1.head);
	}

}
