package src.practice.sorting;

import java.util.Arrays;

public class MergeSort {

	
	public static void main(String[] args) {
		int[] arry =  {10, 11,2,-1,9,0,-5,10};
		System.out.println(arry.length);
		mergeSort(arry, 0, arry.length);
	}
	
	private static void mergeSort(int[] a, int p , int r) {

		if (p<r) {
			int q = (p+r)/2;
			System.out.println("Values "+ p+" "+q+" "+r);
			mergeSort(a, p, q);
			mergeSort(a, q+1, r);
			merge(a,p,q,r);
			
		}
		
		System.out.println(Arrays.toString(a));
	}
	
	private static void merge(int[] a, int p, int q, int r) {
		int n1 = (q-1)-p;
		int n2 = r-q;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for ( int k = 0 ; k < n1 ; k++){ 
			L[k] = a[k];
		}
		for ( int k = q+1 ; k < n2 ; k++){ 
			L[k] = a[k];
		}
		
		System.out.println("L " + Arrays.toString(L));
		System.out.println("R " + Arrays.toString(R));
	}
	
}



