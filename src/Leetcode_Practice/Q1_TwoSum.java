package Leetcode_Practice;

import java.util.Arrays;
import java.util.HashMap;
public class Q1_TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,2,4};
		int target=6;
		int[] ans=twoSum(nums,target);
		int[] ans2=twoSum(nums,target);
		System.out.println(Arrays.toString(ans));
		System.out.println("using hashmap: "+Arrays.toString(ans2));

	}
	static int[] twoSum(int[] nums, int target) {
		int[] ans= {-1,-1};
		for(int element=0;element<nums.length;element++) {
			for(int i=element;i<nums.length;i++) {
				if((nums[element]+nums[i]==target)&&element!=i) {
					ans[0]=element;
					ans[1]=i;
				}
			}
		}
		return ans;
	}
	static int[] twoSum2 (int[] nums,int target) {
		int[]ans= {-1,-1};
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], i);
			
		}
		for(int i=0;i<nums.length;i++) {
			int c=target-nums[i];
			if(map.containsKey(c)&&map.get(c)!=i)
			{
				ans[0]=map.get(c);
				ans[1]=i;
			}
		}
		return ans;
		
		}
	
}

