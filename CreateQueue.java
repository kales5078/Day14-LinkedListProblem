package MyLinkedListExample;

public class CreateQueue 
{
	   public Node front, rear;
	   

	// class to define linked node
	private class Node 
	{
		int data;
		Node next;
	}

	// Zero argument constructor
	public CreateQueue()
	{
		front = null;
		rear = null;
	}

	// Add data to the end of the list.
	public void enqueue(int data)
	{
		Node oldRear = rear; 
		rear = new Node();
		rear.data = data;
		rear.next = null;
		System.out.println(data);
	}

	public static void main(String a[]) 
   {
   	CreateQueue queue = new CreateQueue();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);	
    }
}
