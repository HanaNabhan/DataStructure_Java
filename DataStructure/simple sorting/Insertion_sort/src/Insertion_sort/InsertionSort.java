package Insertion_sort;

public class InsertionSort {
	private int outer,inner,temp;
	 public void  Insertion_Sort(int[] unsorted ) {
		 for(outer=0;outer<unsorted.length-1 ;outer++) {
		  inner=outer ;
		  temp=unsorted[outer];
		  
		  while(inner>0 && unsorted[inner-1]>temp) { //shifting
			  unsorted[inner]=unsorted[inner-1];
			  inner--;
			  
		  }
		  unsorted[inner]=temp;
		 }
	 
	 }
	
}
