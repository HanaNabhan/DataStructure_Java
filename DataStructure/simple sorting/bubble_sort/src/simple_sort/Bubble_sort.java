package simple_sort;

public class Bubble_sort {
 private int outer,inner;
 public void  BubbleSort(int[] unsorted ) {
	 for(outer=0;outer<unsorted.length-1 ;outer++) {
		 for(inner = 0 ; inner < unsorted.length-1-outer;inner++) {
			 if(unsorted[inner]>unsorted[inner+1]) {
				 swap(unsorted,inner,inner+1);
				 
			 }
		 }
		 
	 }
 
 }
 public void swap(int []a,int i ,int j ) {
	 int k = a[i];
	 a[i]=a[j];
	 a[j]=k;
			 
 }
}
