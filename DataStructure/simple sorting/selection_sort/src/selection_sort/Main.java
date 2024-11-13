package selection_sort;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] a = {5,4,3,6,8,2,7};
	         SelectionSort sorter = new SelectionSort();
	         sorter.Selection_Sort(a);
	         for(int i =0 ; i<a.length;i++) {
	        	 System.out.print(a[i]+" ");
	         }
	}

}
