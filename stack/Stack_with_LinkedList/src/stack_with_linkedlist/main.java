package stack_with_linkedlist;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 StacK stack = new StacK(3); // Create a stack with size 3
	        
	        // Push elements
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);

	        // Try pushing when the stack is full
	        stack.push(40); // Should print "Stack is full!"

	        // Peek the top element
	        System.out.println("Peek: " + stack.peek()); // Should print 30

	        // Pop elements
	        System.out.println("Pop: " + stack.pop().data); // Should print 30
	        System.out.println("Pop: " + stack.pop().data); // Should print 20

	        // Peek after popping
	        System.out.println("Peek: " + stack.peek()); // Should print 10

	        // Pop the last element
	        System.out.println("Pop: " + stack.pop().data); // Should print 10

	        // Try popping when the stack is empty
	        System.out.println("Pop: " + stack.pop()); // Should print "Stack is empty!"
	    }
	}
