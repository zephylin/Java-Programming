package Leetcode_Practice;

import java.util.Arrays;

public class Q14710_ShuffleTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int[] nums= {2,5,1,3,4,7};
		int n=3;
		System.out.print(Arrays.toString(shuffle(nums,n)));

	}

	 public static int[] shuffle(int[] nums, int n) {
		 int[] ans=new int[nums.length];
		 int i=0;
		 int j=n;
		 int x=0;
		 while(i<nums.length) {
			 ans[i]=nums[x];
			 ans[++i]=nums[j];
			 j++;
			 i++;
			 x++;
		 }
		 
		 return ans;
	        
	    }
}
