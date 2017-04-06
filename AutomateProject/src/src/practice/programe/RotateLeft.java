package src.practice.programe;

import java.util.Scanner;

public class RotateLeft {

	public static int[] arrayLeftRotation(int[] arr, int n, int k) {
		int i;
		for (i = 0; i < k; i++){
			leftRotatebyOne(arr, n);
		}

		return arr;
	}

	static void leftRotatebyOne(int arr[], int n) 
	{
		int i, temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++){
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}

		int[] output = new int[n];
		output = arrayLeftRotation(a, n, k);
		for(int i = 0; i < n; i++)
			System.out.print(output[i] + " ");

		System.out.println();

	}
}
