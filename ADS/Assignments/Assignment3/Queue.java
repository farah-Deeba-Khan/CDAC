package org.Queue;

public class Queue {
	int size = 5;
	int Q[] = new int[size];
	int front, rear;
	
	Queue(){
		front = -1;
		rear = -1;
	}
	
	boolean isEmpty() {
		return (front == -1);
	}
	
	boolean isFull() {
		return (rear == size-1);
	}

	// Insertion Operation
	void enqueue(int x) 
	{
		if(isFull()) 
		{
			System.out.println("Queue is Full");
		}
		else 
		{
			if(front == -1) 
			{
				front = 0; // set front to 0 if queue is empty
			}
			rear++;
			Q[rear] = x; // Q[0] = 5;
			System.out.println(x +" is Inserted");
		}
	}
	
	int dequeue() 
	{
		if(isEmpty())  // True
		{ 
			System.out.println("Queue is Empty");
			return -1;
		}
		else {
			int x = Q[front];
			System.out.println(x +" is Deleted");
			if(front > rear)
			{
				front = -1;
				rear = -1;
			}
			else {
				front++;
			}
		return x;
		}
	}
	
	void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		else {
			System.out.println("Queue elements: ");
			for(int i = front; i <= rear; i++)
			{
				System.out.print(Q[i]+ " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(11);
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(14);
		//q.enqueue(15);
		q.display();
		
		q.dequeue();
		q.display();
		
		q.dequeue();
		q.display();
		
		q.dequeue();
		q.display();
		
		q.dequeue();
		q.display();
		
		q.dequeue();
		q.display();

	}

}
