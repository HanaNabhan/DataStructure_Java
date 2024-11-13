package quick_sort;

public class QuickSort {
	private int pindex ,pivot ,temp;
	public void Quick_Sort(int[] A , int start ,int end) {
		if(start>=end) {
			return ;
		}
		partition(A,start,end);
		Quick_Sort(A,start,pindex-1);
		Quick_Sort(A,pindex+1,end);
	}
	public void partition(int[] A , int start ,int end) {
		pivot =A[end];
		pindex =start;
		for(int i = start ; i<end;i++) {
			if(A[i]<=pivot) {
				temp = A[i];
				A[i]=A[pindex];
				A[pindex++]=temp;
			}
			
		}
		temp = A[end];
		A[end]=A[pindex];
		A[pindex]=temp;
		
	}

}
