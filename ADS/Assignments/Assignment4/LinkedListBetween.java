package LinkedList;

class LinkedListBetween {
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
	
	// Adding between with data only
	void add(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head.next;
		head.next = new_node;
		System.out.println("Inserting in between");
	}
	
	// Adding between with data and position
	void addBetweenWithPosition(Node prev_node, int new_data) {  //  head node pass kiya h to prev node me aa raha!
		Node new_node = new Node(new_data);
	 
		// new_node.next connect ho rha head.next ke next means 20 or 30 k bich me!
		new_node.next = prev_node.next.next;
		
		//prev_node.next = new_node; //head.next means prev_node.next connect ho new_node se!
		prev_node.next.next = new_node;
		
	}
	public static void main(String[] args) {
		LinkedListBetween l1 = new LinkedListBetween();
		l1.head = new Node(10);
		
		Node second = new Node(20);
		l1.head.next = second;
		
		Node third = new Node(30);
		second.next = third;
		
		l1.display();
		
		l1.add(15);
		l1.display();
		
		l1.addBetweenWithPosition(l1.head.next, 25);
		l1.display();
	}

}
