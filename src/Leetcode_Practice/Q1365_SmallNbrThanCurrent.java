package Leetcode_Practice;

import java.util.Arrays;

public class Q1365_SmallNbrThanCurrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {8,1,2,2,3};
		System.out.print(Arrays.toString(smallerNumbersThanCurrent(nums)));
		
	}


	
	public static int[] smallerNumbersThanCurrent(int[] nums) {
		
		int [] ans=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			int sum=0;
			for(int j=0; j<nums.length;j++) {
				if(i==j) {
					continue;
				}
				if(nums[j]<nums[i]) {
					sum++;
				}
					
			}
			
			ans[i]=sum;
			
		}
		
		return ans;
        
    }

}
