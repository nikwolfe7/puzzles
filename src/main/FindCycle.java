package main;

public class FindCycle {

  public static void main(String[] args) {
    FindCycle fc = new FindCycle();
  }
  
  public FindCycle() {
    Node n1 = new Node("x");
    Node n2 = new Node("x");
    Node n3 = new Node("x");
    Node n4 = new Node("x");
    Node n5 = new Node("x");
    Node n6 = new Node("x");
    Node n7 = new Node("x");
    Node n8 = new Node("x");
    Node n9 = new Node("x");
    n1.prev = n1;
    n1.next = n2;
    n2.prev = n1;
    n2.next = n3;
    n3.prev = n2;
    n3.next = n4;
    n4.prev = n3;
    n4.next = n5;
    n5.prev = n4;
    n5.next = n6;
    n6.prev = n5;
    n6.next = n2; /*loop*/
    n7.prev = n6;
    n7.next = n8;
    n8.prev = n7;
    n8.next = n9;
    n9.prev = n8;
    n9.next = null; /*tail*/
    LinkedList list = new LinkedList(n1,n2,n3,n4,n5,n6,n7,n8,n9);
    if(hasCycles(list)) 
      System.out.println("This list has a cycle!");
  }
  
  public class NodeFlag extends Node {
    public NodeFlag(String s) {
      super(s);
    }
  }

  private boolean hasCycles(LinkedList list) {
    Node ptr = list.head;
    while(ptr.next != null) {
      NodeFlag f = new NodeFlag(ptr.value);
      if(ptr instanceof NodeFlag)
        return true;
      else
        f.prev = ptr.prev;
        f.next = ptr.next;
        ptr.prev.next = f;
        ptr.next.prev = f;
        ptr = ptr.next;
    }
    return false;
  }
  
  

  private class LinkedList {
    public Node head;
    public Node tail;
    private Node[] arr;
    public LinkedList(Node... nodes) {
      this.arr = nodes;
      this.head = arr[0];
      this.tail = arr[arr.length-1];
    }
  }
  
  private class Node {
    public Node next;
    public Node prev;
    public String value;
    public Node(String s) {
      this.value = s;
    }
  }
  

}
