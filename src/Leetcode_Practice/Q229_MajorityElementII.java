package Leetcode_Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q229_MajorityElementII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1};
		System.out.println(majorityElement(nums));

	}
	static List<Integer> majorityElement(int[] nums){
	 int n=nums.length/3;
	 List<Integer> myList=new ArrayList<>();
	 
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<nums.length;i++) {
     	map.put(nums[i], map.getOrDefault(nums[i],0)+1);
     	
     }
     int ans=-1;
     for(HashMap.Entry<Integer,Integer> entry: map.entrySet()) {
     	if(entry.getValue()>n) {
     		myList.add(entry.getKey());
     	}
     }
     return myList;
	}
	

}
