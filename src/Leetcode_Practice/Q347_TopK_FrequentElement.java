package Leetcode_Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Q347_TopK_FrequentElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,1,1,1,2,1,2};
		int k=2;
		System.out.print(Arrays.toString(topKFrequent(nums,k)));

	}
	
	 static int[] topKFrequent(int[] nums, int k) {
	       
	      TreeMap<Integer,Integer> map=new TreeMap<>();
	      for(int i=0;i<nums.length;i++) {
	      	map.put(nums[i], map.getOrDefault(nums[i],0)+1);
	      	
	      }
	      if(map.isEmpty()) {
	    	  return new int[] {0};
	      }
	      int index=0;
	      int[] result=new int[k];
	      while(k>0) {
    	  int ans=map.firstKey();
	        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
	        	
	        	if(entry.getValue()>map.get(ans)) {
	        		ans=entry.getKey();	        	
	        		}
	        
	        	}
	        result[index]=ans;
	        index++;
	        map.remove(ans);
	        k--;
	      }
	      
	     		 
		 return result;
	    }

}
