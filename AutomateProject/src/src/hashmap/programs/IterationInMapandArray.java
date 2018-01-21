package src.hashmap.programs;

import java.util.Arrays;

public class IterationInMapandArray {
	
	public static void main(String[] args) {
//		HashMap<Integer , String> hmap = new HashMap<Integer , String >();
//		
//		hmap.put(1, "Data1");
//		hmap.put(2, "Data2");
//		hmap.put(3, "Data3");
//		hmap.put(4, "Data4");
//		hmap.put(5, "Data5");
//
//		Iterator<Entry<Integer, String>> it = hmap.entrySet().iterator();
//		
//		while (it.hasNext()) {
//			
//		}
		int[] arr = {1,2,3,4,5};
		 
		int[] copied = new int[10];
		System.arraycopy(arr, 0, copied, 4, arr.length);//5 is the length to copy
		 
		System.out.println(Arrays.toString(copied));
		System.out.println(Arrays.toString(Arrays.copyOf(arr, 10)));
	}
}
