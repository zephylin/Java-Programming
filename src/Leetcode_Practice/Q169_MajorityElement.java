package Leetcode_Practice;
import java.util.HashMap;

public class Q169_MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,2,1,1,1,2,2};
		System.out.println(majorityElement(arr));

	}
	
	 static int majorityElement(int[] nums) {
	        int n=nums.length/2;
	        HashMap<Integer,Integer> map=new HashMap<>();
	        for(int i=0;i<nums.length;i++) {
	        	map.put(nums[i], map.getOrDefault(nums[i],0)+1);
	        	
	        }
	        int ans=-1;
	        for(HashMap.Entry<Integer,Integer> entry: map.entrySet()) {
	        	if(entry.getValue()>n) {
	        		ans=entry.getKey();
	        		break;
	        	}
	        }
	        
	        return ans;
	        
	    }

}
