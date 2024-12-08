package queue_with_array;

public class QueuE {
	public int maxsize;
	public long[] stackarray;
	public int first;
	public int last;

	public QueuE(int size) {
		first = 0;
		last = 0;
		stackarray = new long[size];
		maxsize = size;
	}

	public void enqueue(long i) {
		if (IsFull()) {
			System.out.println("queue is full! Cannot push " + i);

			return;
		}
		
		stackarray[last++] = i;

	}

	public long dequeue() {
		if (IsEmpty()) {
			System.out.println("Queue is empty! Cannot dequeue.");
			return Long.MIN_VALUE; // Special value to indicate failure
		}
		long x = stackarray[first++];
//		if (first > last) { // Reset queue if empty
//			first = 0;
//			last = 0;
//		}
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
		return first == last ;
	}

	public boolean IsFull() {
		return last == maxsize ;
	}
}
