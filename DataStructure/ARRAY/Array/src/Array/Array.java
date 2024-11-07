package Array;

import java.util.Scanner;

public class Array {
	private int[] ptr = null;
	private int size;
	private int length;
	private Scanner n;
	public Array(int arrsize) {
		size = arrsize;
		ptr=new int[size];
		length=0;
		
		
	}
	
	public void Fill() {
		int iter=0 ,x;
		n = new Scanner (System.in);
		System.out.println("Number of Values you want ?");
		int NumberOfItems=n.nextInt();
		if(NumberOfItems>(size-length)) {
			System.out.println("Invalid!! not enough space");
		}
		else {
		for(iter=0;iter<NumberOfItems;iter++) {
			System.out.println("Enter the value you want");
			x=n.nextInt();
			ptr[iter]=x;
			length++;
		}}
	}
	public void Display() {
		int i=0;
		for(i=0;i<length;i++) {
			System.out.print(ptr[i]+ " ");
		}
		System.out.println("\n ");

	}
	
	public int Search(int need) {
		int index=-1,i=0;
		for(i=0;i<length;i++) {
			if(need==ptr[i]) {
				index=i;
			}
		}
		if(index==-1)
		    System.out.print("Not Found!!");
		return index;
	}
	
	public void Append(int element) {
		if(length>=size) {
			return ;
		}
		ptr[length]=element;
		length++;
	}
	
	public void Insert(int element,int index) {
		int i =0 ;
		for(i=length;i>index;i++) {
			ptr[i]=ptr[i-1];
		}
		ptr[index]=element;
		length++;
	}
	public void Delete(int index) {
		int i=0;
		for(i=index;i<length-1;i++) {
			ptr[i]=ptr[i+1];
		}
		length--;
	}
}
