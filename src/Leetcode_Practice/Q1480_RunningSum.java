package Leetcode_Practice;

import java.util.Arrays;

public class Q1480_RunningSum {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		System.out.println(Arrays.toString(runningSum(nums)));
		System.out.println(Arrays.toString(runningSum2(nums)));

	}
	
	 public static int[] runningSum(int[] nums) {
	        int[] ans = new int[nums.length];
	        for(int i=0;i<nums.length;i++) {
	        	int sum=0;
	        	for(int j=i;j>=0;j--) {
	        		sum+=nums[j];
	        	}
	        	ans[i]=sum;
	        }
	        
	        return ans;
	    }
	 
	 public static int[] runningSum2(int[] nums) {
	    
	        for(int i=1;i<nums.length;i++) {
	        	nums[i]=nums[i]+nums[i-1];
	        }
	        
	        return nums;
	        
	 }
	    

}
