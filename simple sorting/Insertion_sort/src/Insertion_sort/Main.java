package Insertion_sort;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] a = {5,4,3,6,2,7};
	         InsertionSort sorter = new InsertionSort();
	         sorter.Insertion_Sort(a);
	         for(int i =0 ; i<a.length;i++) {
	        	 System.out.print(a[i]+" ");
	         }
	}

}
