package merge_sort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort sorter = new MergeSort ();
		int []a= {1,5,8,9,10};
		int[]b= {2,4,6,7,9};
		int[]c= new int[100];
		int cindex=sorter.Merge_Sort(a,b,c);
		for(int i =0 ;i < cindex;i++) {
			System.out.print(c[i]+" ");
		}

	}

}
