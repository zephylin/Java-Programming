package Leetcode_Practice;

import java.util.Arrays;

public class Q260_FindSingleNumber {

	public static void main(String[] args) {
		int[] nums= {1,2,1,3,2,5};
		System.out.print(Arrays.toString(singleNumber(nums)));

	}
	
	public static int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        int xorResult=0;
        for(int num : nums){
            xorResult^=num;
        }

        int rightMostSetBit= xorResult & (-xorResult);
        
        for(int num :nums) {
        	if((num & rightMostSetBit)!= 0){
        		ans[0]^=num;
        	}
        	else
        		ans[1]^=num;
        }
        
        return ans;
    }

}
