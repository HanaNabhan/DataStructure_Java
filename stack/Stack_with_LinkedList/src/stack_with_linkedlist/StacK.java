package stack_with_linkedlist;

public class StacK {
	public int maxsize;
	public int top;
	SimpleLinkedList list;
	public StacK(int size) {
		top = -1;
		maxsize=size;
	    list = new SimpleLinkedList(); // Initialize the linked list

	}
	public void push(int i ) {
		if(IsFull()) {
	        System.out.println("Stack is full! Cannot push " + i);

			return ;
		}
		top++;
		list.InsertFirst(i);
		
		
	}
	public Node pop( ) {
		if(IsEmpty()) {
			 System.out.println("Stack is empty! Cannot pop.");
		     return null; 
		}
		top--;
		return list.DeleteFirst();
		
		
	}
    public int peek( ) {
    	if(IsEmpty()) {
    		 System.out.println("Stack is empty! Cannot peek.");
    	     return Integer.MIN_VALUE; 
		}
    	
		return list.GetFirst().data;
		
		
	}
    public boolean IsEmpty() {
    	return top == -1;
    }
    public boolean IsFull() {
    	return top == maxsize-1;
    }
}
