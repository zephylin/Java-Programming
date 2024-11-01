package Practice_Qtns;
import java.util.*;
public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,1,2,3};
		int k=2;
		//System.out.println(containsDuplicate(nums));
		System.out.println(containsDuplicate2(nums,k));

	}
	static boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> myMap=new HashMap<>();
		for(int num: nums) {
			if(myMap.containsKey(num)) {
				return true;
			}
			myMap.put(num, myMap.getOrDefault(num,0)+1);
		}
		
		return false;
		
	}
	static boolean containsDuplicate2(int[] nums, int k) {
		HashMap<Integer, Integer> myMap=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(myMap.containsKey(nums[i])) {
				if(i-myMap.get(nums[i])<=k)
					return true;
			}
			myMap.put(nums[i], i);
		}
		
		return false;
		
	}
	
   
}
