package priority_queue;

public class Priority_Queue {
	public int maxsize;
	public long[] stackarray;
	public int size;


	public Priority_Queue(int nsize) {
		
		stackarray = new long[nsize];
		maxsize = nsize;
		size=0;
	}

	public void enqueue(long i) {
		if (IsFull()) {
			System.out.println("queue is full! Cannot push " + i);

			return;
		}
		int j  ;
		if(size==0) {
			stackarray[size++]=i;
			return;
		}
		for(j=size-1;j>=0;j--) {
			if(stackarray[j]<i)
				stackarray[j+1]=stackarray[j];
			else
				break;
		}
		stackarray[j+1] = i;
		size++;
	}

	public long dequeue() {
		if (IsEmpty()) {
			System.out.println("Queue is empty! Cannot dequeue.");
			return Long.MIN_VALUE; // Special value to indicate failure
		}
		return stackarray[--size];
		
	}

	public long peek() {
		if (IsEmpty()) {
			System.out.println("Stack is empty! Cannot peek.");
			return Long.MIN_VALUE; // Special value to indicate failure
		}
		return stackarray[0];

	}

	public boolean IsEmpty() {
		return size==0;
	}

	public boolean IsFull() {
		return size==maxsize;
	}
}