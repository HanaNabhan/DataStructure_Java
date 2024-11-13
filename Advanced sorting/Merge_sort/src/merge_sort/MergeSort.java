package merge_sort;

public class MergeSort {
private int Findex,Sindex,Maindex;
	public int Merge_Sort(int[]f,int[]s,int[] arr) {
		Findex = Sindex = Maindex = 0;
		while(Sindex<s.length && Findex<f.length) {
			if(f[Findex]<s[Sindex]) {
				arr[Maindex++]=f[Findex++];
			}
			else {
				arr[Maindex++]=s[Sindex++];
			}
		}
		while(Findex<f.length) {
			arr[Maindex++]=f[Findex++];
		}
		while(Sindex<s.length) {
			arr[Maindex++]=s[Sindex++];
		}
	
	return Maindex;
	
	}
	public void recMerge_sort(int[]arr,int l , int h) {
		if(l==h) {
			return ; 
		}
		else {
			int mid = l+h/2;
			recMerge_sort(arr,l , mid);
			recMerge_sort(arr,mid+1 , h);
			Merge(arr,l,mid+1,h);
		}}
	public void Merge(int[] r, int l, int h, int u) {
	    int[] temp = new int[u - l + 1];
	    int i = 0;
	    int low = l;
	    int mid = h - 1;
	    int n = u - l + 1;

	    while (l <= mid && h <= u) {
	        if (r[l] < r[h]) {
	            temp[i++] = r[l++];
	        } else {
	            temp[i++] = r[h++];
	        }
	    }
	    while (l <= mid) {
	        temp[i++] = r[l++];
	    }
	    while (h <= u) {
	        temp[i++] = r[h++];
	    }
	    for (int j = 0; j < n; j++) {
	        r[low + j] = temp[j];
	    }
	}

		
	
}
