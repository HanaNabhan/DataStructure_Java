package Stack_with_Array;

public class StacK {
	public int maxsize;
	public long[] stackarray;
	public int top;
	public StacK(int size) {
		top = -1;
		stackarray=new long [ size];
		maxsize=size;
	}
	public void push(long i ) {
		if(IsFull()) {
	        System.out.println("Stack is full! Cannot push " + i);

			return ;
		}
		stackarray[++top]=i;
		
		
	}
	public long pop( ) {
		if(IsEmpty()) {
			 System.out.println("Stack is empty! Cannot pop.");
		     return Long.MIN_VALUE; // Special value to indicate failure
		}
		return stackarray[top--];
		
		
	}
    public long peek( ) {
    	if(IsEmpty()) {
    		 System.out.println("Stack is empty! Cannot peek.");
    	     return Long.MIN_VALUE; // Special value to indicate failure
		}
		return stackarray[top];
		
		
	}
    public boolean IsEmpty() {
    	return top == -1;
    }
    public boolean IsFull() {
    	return top == maxsize-1;
    }
}
