package queue_with_array;

public class Circular_queue {
	public int maxsize;
	public int size;
	public long[] stackarray;
	public int first;
	public int last;

	public Circular_queue(int nsize) {
		first = 0;
		last = -1;
		size=0;
		stackarray = new long[nsize];
		maxsize = nsize;
	}

	public void enqueue(long i) {
		if (IsFull()) {
			System.out.println("queue is full! Cannot push " + i);

			return;
		}
		if(last==maxsize-1) {
			last=-1;
		}
		stackarray[++last] = i;
		size++;
	}

	public long dequeue() {
		if (IsEmpty()) {
			System.out.println("Queue is empty! Cannot dequeue.");
			return Long.MIN_VALUE; // Special value to indicate failure
		}
		
		long x = stackarray[first++];
		if(first == maxsize)
			first=0;
	    size--;
		return x;
	}

	public long peek() {
		if (IsEmpty()) {
			System.out.println("Stack is empty! Cannot peek.");
			return Long.MIN_VALUE; // Special value to indicate failure
		}
		return stackarray[first];

	}

	public boolean IsEmpty() {
		return size==0; 
	}

	public boolean IsFull() {
		return size == maxsize ;
	}
}
