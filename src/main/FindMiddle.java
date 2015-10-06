package main;

public class FindMiddle {
	
	public FindMiddle() {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(6);
		list.add(15);
		list.add(-1);
		list.add(3);
		list.add(5);
		list.add(0);
		list.add(100);
		System.out.println("Middle: " + getMiddle(list).getVal());
	}
	
	public static void main(String[] args) {
		new FindMiddle();
	}
	
	public Node getMiddle(LinkedList list) {
		Node headPointer = list.head;
		Node tailPointer = list.tail;
		while(headPointer != tailPointer) {
			headPointer = headPointer.next;
			if(headPointer == tailPointer)
				break;
			tailPointer = tailPointer.prev;
		}
		return headPointer;
	}
	
	public class LinkedList {
		public Node head = null;
		public Node tail = null;
		
		public void add(int val) {
			Node newNode = new Node(val);
			if(head == null) {
				head = newNode;
				head.prev = head;
			} else if (tail == null) {
				tail = newNode;
				tail.prev = head;
				head.next = tail;
			} else {
				tail.next = newNode;
				newNode.prev = tail;
				tail = newNode;
			}
		}
	}
	
	public class Node {
		private int val;
		public Node next;
		public Node prev;
		public Node(int val) {
			this.val = val;
		}
		public int getVal() {
			return val;
		}
	}

}
