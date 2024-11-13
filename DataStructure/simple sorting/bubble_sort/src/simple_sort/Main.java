package simple_sort;

public class Main {

	public static void main(String[] args) {
         int[] a = {5,4,3,6,2,7};
         Bubble_sort sorter = new Bubble_sort();
         sorter.BubbleSort(a);
         for(int i =0 ; i<a.length;i++) {
        	 System.out.print(a[i]+" ");
         }
         
         
	}

}
