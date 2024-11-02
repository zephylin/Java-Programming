package Leetcode_Practice;

import java.util.HashMap;
import java.util.Map;

public class Q3158_DuplicateNbrXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3};
		System.out.println(duplicateNumbersXOR(nums));
	}
	
	 public static int duplicateNumbersXOR(int[] nums) {
		 HashMap<Integer, Integer> map = new HashMap<>();
		 for(int i=0; i<nums.length;i++) {
			 map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		 }
		 
		 int ans=0;
		 for(Map.Entry<Integer, Integer> entry : map.entrySet() ) {
			 if(entry.getValue()==2) {
				 ans^=entry.getKey();
			 }
		 }
		 
		 return ans;
	        
	    }

}
