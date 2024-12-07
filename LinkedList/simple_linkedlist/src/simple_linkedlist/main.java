package simple_linkedlist;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleLinkedList mylist = new SimpleLinkedList();
		mylist.InsertFirst(1);
		mylist.InsertFirst(2);
		mylist.InsertFirst(3);
		mylist.InsertFirst(4);
		mylist.InsertFirst(5);
		mylist.DisplayList();
		mylist.InsertEnd(5);
		mylist.InsertEnd(3);
		mylist.DisplayList();
		mylist.LinkedlistBubbleSort();
		mylist.DisplayList();


//        Node deleted_node = mylist.DeleteLast();
//    	if (deleted_node==null) {
//        	System.out.print("not found");
//        }
//        else
//             System.out.print("the node i need to delete "+deleted_node.data+"\n");
//		mylist.DisplayList();

//		System.out.print("number of nodes "+mylist.Count()+"\n");
//		mylist.Insert(7,3);
//		mylist.DisplayList();
//		mylist.Insert(3,8);
//		mylist.DisplayList();
//		mylist.Insert(9,10);
//		mylist.DisplayList();
//		mylist.Insert(1,1);
//		mylist.DisplayList();

//		mylist.DeleteFirst();
//		mylist.DisplayList();
//        Node tofound;
//        tofound=mylist.find(2);
//        System.out.print("the node i need to find "+tofound.data+"\n");
//        tofound=mylist.find(5);
//        if (tofound==null) {
//        	System.out.print("no node found");
//        }
//        else
//             System.out.print("the node i need to find "+tofound.data+"\n");
//        Node deleted_node = mylist.delete(1);
//		mylist.DisplayList();
//		System.out.print("deleted node "+deleted_node.data+"\n");
//		deleted_node = mylist.delete(1);
//		if (deleted_node==null) {
//        	System.out.print("not found");
//        }
//        else
//             System.out.print("the node i need to find "+deleted_node.data+"\n");
//		
//		Node minvalue=mylist.FindLowest();
//		System.out.print("lowest value "+minvalue.data+"\n");
//		Node maxvalue=mylist.FindHighest();
//		System.out.print("highest value "+maxvalue.data+"\n");
	}

}
