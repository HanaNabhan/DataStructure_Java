package selection_sort;

public class SelectionSort {
  private int outer,inner,min;
	 public void  Selection_Sort(int[] unsorted ) {
		 for(outer=0;outer<unsorted.length-1 ;outer++) {
			 min=outer;
			 for(inner = outer ; inner < unsorted.length ;inner++) {
				 if(unsorted[min]>unsorted[inner]) {
					 swap(unsorted,min,inner);
					 
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
