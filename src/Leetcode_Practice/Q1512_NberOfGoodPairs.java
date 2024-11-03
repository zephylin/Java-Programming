package Leetcode_Practice;

import java.util.HashMap;
import java.util.Map;

public class Q1512_NberOfGoodPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,1,1,3};
		System.out.println(numIdenticalPairs(nums));
		System.out.print(numIdenticalPairs2(nums));
	}
	
	public static int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length-1;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }

        }

        return count;
        
    }
	
	public static int numIdenticalPairs2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++) {
        	map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        	
        	}
        	
        
        int count=0;
        for(int i : map.values()) {
        	count+=(i*(i-1))/2;
        }
        
        return count;
        
    }
	

}
