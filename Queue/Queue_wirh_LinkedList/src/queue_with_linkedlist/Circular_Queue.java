package queue_with_linkedlist;

public class Circular_Queue {
	public int maxsize;
	public int size;
	public int first;
	public int last;
	SimpleLinkedList list;
	public Circular_Queue(int nsize) {
		first = 0;
		last = -1;
		size=0;
	    list = new SimpleLinkedList();
		maxsize = nsize;
	}

	public void enqueue(int i) {
		if (IsFull()) {
			System.out.println("queue is full! Cannot push " + i);

			return;
		}
		if(last==maxsize-1) {
			last=-1;
		}
		list.InsertEnd(i);
		last++;
		size++;
		
	}

	public int dequeue() {
		if (IsEmpty()) {
			System.out.println("Queue is empty! Cannot dequeue.");
			return Integer.MIN_VALUE; // Special value to indicate failure
		}
		int x = list.DeleteFirst().data;
		first++;
		if(first == maxsize)
			first=0;
	    size--;
		return x;
	}

	public int peek() {
		if (IsEmpty()) {
			System.out.println("Stack is empty! Cannot peek.");
			return Integer.MIN_VALUE; // Special value to indicate failure
		}
		return list.GetFirst().data;

	}

	public boolean IsEmpty() {
		return size==0; 
	}

	public boolean IsFull() {
		return size == maxsize ;
	}
}
