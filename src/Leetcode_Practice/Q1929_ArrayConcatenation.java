package Leetcode_Practice;

import java.util.Arrays;

public class Q1929_ArrayConcatenation {

	public static void main(String[] args) {
		int[] nums= {1,2,4,3};
		System.out.print(Arrays.toString(getConcatenation(nums)));

	}
	
	 public static int[] getConcatenation(int[] nums) {
	     int[] ans=new int[nums.length*2];
	     int i=0;
	     int j=0;
	     while (i<ans.length) {
	    	 ans[i]=nums[j];
	    	 i++;
	    	 j++;
	    	 if(j>=nums.length)
	    		 j=0;
	     }
	     
	     return ans;
	 }

}
