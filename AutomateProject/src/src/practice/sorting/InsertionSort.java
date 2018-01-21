package src.practice.sorting;

import java.util.Arrays;

public class InsertionSort {

	static int count;
	
	public static void main(String[] args) {
		
		int[] arry =  {100, 11,2,-1,9,0,-5};
		insertSortMethod(arry);
	}
	
	
	private static void insertSortMethod(int[] a) {
		 
		for (int j = 1; j < a.length; j++) {
			int key = a[j];
			int i =j-1;
			while (i>=0 && a[i]>key) {
				a[i+1]=a[i];
				a[i]=key;
				i--;
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
}
