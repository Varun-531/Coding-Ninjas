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

	public static boolean isPalindrome(Node<Integer> head) {
		//Your code goes here
		Node<Integer> tail = head;
		if(head==null)
			return true;
		int count=0;
		while(tail.next!=null){
			tail=tail.next;
			count++;
		}
		// System.out.println(count);
		int arr[] = new int[count+1];
		Node<Integer> temp = head;
		int i =0;
		while(temp!=null){
			arr[i]=temp.data;
			temp=temp.next;
			i++;
		}
		int start = 0;
		int last = arr.length-1;
		while(start<=last){
			if(arr[start]==arr[last]){
				start++;
				last--;
				}
			else{return false;}
		}
		return true;
	}
}