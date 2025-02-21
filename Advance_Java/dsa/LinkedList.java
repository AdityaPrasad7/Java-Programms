package dsa;

public class Node{
	Object ele;
	Node next;
	
	public Node(Object ele) {
		this.ele = ele;
	}
	public Node(Object ele, Node next) {
		this.ele = ele;
		this.next = next;
	}
	
}

public class LinkedList {

	Node head;
	int count = 0;
	
	public void add (Object ele) {
		Node n = new Node(ele);
		
		if(head == null) {
			head = n;
			count++;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = n;
		count++ = 1;
	}
	public int size() {
		return count;
	}
	
	public void display() {
		Node temp = head;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
}
