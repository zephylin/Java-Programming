package Leetcode_Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Q2404_MostFrequentEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,4,4,6,6,6,1};
		System.out.print(mostFrequentEven(nums));

	}
	 static int mostFrequentEven(int[] nums) {
		  TreeMap<Integer,Integer> map=new TreeMap<>();
		  
	        for(int i=0;i<nums.length;i++) {
	        	if(nums[i]%2==0)
	        		map.put(nums[i], map.getOrDefault(nums[i],0)+1);
	        	
	        }
	        if(map.isEmpty()) {
	        	return -1;
	        }
	        int ans=map.firstKey();
	        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
	        	
	        	if(entry.getValue()>map.get(ans)) {
	        		ans=entry.getKey();	        	
	        		}
	        
	        	}
	        	
	        
	        
	        return ans;
	 }

}
