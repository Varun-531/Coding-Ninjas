package DSA.LinkedList;
/*

	Following is the Node class already written for the Linked List

	class Node<T> {
    	T data;
    	Node<T> next;
    
    	public Node(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {

	public static void printReverse(Node<Integer> root) {
		if(root==null)
			return ;
		//Your code goes here
		Node<Integer> tail = root;
		int count=0;
		while(tail.next!=null){
			tail=tail.next;
			count++;
		}
		int arr[] = new int[count+1];

		// System.out.println(tail.data);
		// System.out.println(count);
		Node<Integer> temp = root;
		int i=0;
		while(temp!=null){
			arr[i]=temp.data;
			temp = temp.next;
			i++;
		}
		for(int j =count;j>=0;j--)
			System.out.print(arr[j]+" ");
	}
}