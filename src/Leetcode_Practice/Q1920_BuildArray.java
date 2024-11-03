package Leetcode_Practice;

import java.util.Arrays;

public class Q1920_BuildArray {

	public static void main(String[] args) {
		int[] nums= {0,2,1,5,3,4};
		System.out.println(Arrays.toString(buildArray(nums)));
		System.out.println(Arrays.toString(buildArray2(nums)));
	}

	
	public static int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0; i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }

        return ans;
    }
	
	public static int[] buildArray2(int[] nums) {
		int n=nums.length;
		for (int i=0;i<nums.length;i++) {
			nums[i]=nums[i] + (nums[nums[i]]%n)*n;
		}
		
		for(int i=0; i<nums.length;i++) {
			nums[i]=nums[i]/n;
		}
		
		return nums;
	}
}
