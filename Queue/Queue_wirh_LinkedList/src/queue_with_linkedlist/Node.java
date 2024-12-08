package queue_with_linkedlist;

public class Node {
public int data;
public Node next;
public Node(int i) {
     this.data=i;
     this.next = null;
}
public void displayNode() {
	System.out.print( this.data +" ");
}
}
