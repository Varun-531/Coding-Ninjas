package DSA.Queue;
/*
	Following is the structure of the node class for a Singly Linked List

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

*/

public class Queue {
	private Node front;
	private Node rare;
	private int size;
	//Define the data members


	public Queue() {
		//Implement the Constructor
		front = null;
		rare = null;
		size = 0;
	}
	


	/*----------------- Public Functions of Stack -----------------*/


	public int getSize() { 
		//Implement the getSize() function
		return size;
    }


    public boolean isEmpty() { 
    	//Implement the isEmpty() function
		return size==0;
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
		Node temp = new Node(data);
		if(front==null){
			front = temp;
			rare = temp;
		}
		else{
			rare.next = temp;
			rare = temp;
		}
		size++;
    }


    public int dequeue() {
    	//Implement the dequeue() function
		if(front!=null){
		int dora = front.data;
		front = front.next;
		size--;
		return dora;
		}
		return -1;

    }


    public int front() {
    	//Implement the front() function
		if(front==null)
			return -1;
		return front.data;

    }
}
