package quick_sort;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort sorter = new QuickSort ();
		int []a= {10, 7, 8, 9, 1, 5};
		
		sorter.Quick_Sort(a,0,a.length-1);
		for(int i =0 ;i <a.length;i++) {
			System.out.print(a[i]+" ");
	}

	}}
