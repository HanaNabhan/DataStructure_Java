package queue_with_array;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//QueuE queue = new QueuE(5);
		Circular_queue queue = new Circular_queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        System.out.println("\nPeek first element: " + queue.peek());

        System.out.println("\nDequeuing elements:");
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());


        System.out.println("\nPeek next element: " + queue.peek());

        System.out.println("\nDequeuing remaining elements:");
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("///////////////////" );
        System.out.println("\nDequeuing from empty queue: " + queue.dequeue());
        queue.enqueue(40); //in normal : even though it is not full !!!!!!
        System.out.println("Dequeued: " + queue.dequeue());

	}

}
