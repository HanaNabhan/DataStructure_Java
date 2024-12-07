package circular;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circular_list mylist = new circular_list();
		mylist.InsertFirst(1);
		mylist.InsertFirst(2);
		mylist.InsertFirst(3);
		mylist.InsertFirst(4);
		mylist.InsertFirst(5);
		mylist.DisplayList();
		mylist.InsertEnd(5);
		mylist.InsertEnd(3);
		mylist.DisplayList();
		mylist.DeleteFirst();
		mylist.DisplayList();
		mylist.DeleteLast();
		mylist.DisplayList();
		mylist.delete(2);
		mylist.DisplayList();
		mylist.Insert(2,3);
		mylist.DisplayList();
		
		
		System.out.println("find : "+ mylist.find(2).data);
        		
		
		
	}

}
