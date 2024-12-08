package priority_queue;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Priority_Queue pq = new Priority_Queue(5);

		System.out.println("Enqueuing elements:");
		pq.enqueue(30);
		pq.enqueue(10);
		pq.enqueue(50);
		pq.enqueue(20);
		pq.enqueue(40);
		pq.enqueue(60); // Should print "Queue is full! Cannot enqueue 60"

		System.out.println("\nPeek highest-priority element: " + pq.peek()); // Should print 50

		System.out.println("\nDequeuing elements:");
		while (!pq.IsEmpty()) {
			System.out.println("Dequeued: " + pq.dequeue());
		}

		System.out.println("\nDequeuing from empty queue: " + pq.dequeue()); // Should print "Queue is empty! Cannot
																				// dequeue."
	}

}
