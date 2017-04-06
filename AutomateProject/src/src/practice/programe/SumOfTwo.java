package src.practice.programe;

import java.util.Arrays;
import java.util.HashMap;

/*problem Description

Given an array of integers, return indices of the two numbers such that they add up to a specific target.You may assume that each input would have exactly one solution, and you may not use the same element twice.
(11:37:56 AM) umesh.routela: Given nums = [2, 7, 11, 15], target = 9,  Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].

 */

public class SumOfTwo {

	public static void main(String[] args) {

		int[] arr = {4,3,8,5,3,4,5,7,7,4,7,90,8,5,3,};
		System.out.println(Arrays.toString(twoSum( arr, 98 )));
		

	}

public static int[] twoSum(int[] numbers, int target) {
        
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){

            Integer diff = (Integer)(target - numbers[i]);
            if(hash.containsKey(diff)){
                int toReturn[] = {hash.get(diff)+1, i+1};
                return toReturn;
            }

            hash.put(numbers[i], i);

        }
        
        return null;
        
    }


}
