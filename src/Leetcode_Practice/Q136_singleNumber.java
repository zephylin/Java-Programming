package Leetcode_Practice;
import java.util.HashMap;
public class Q136_singleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,1,6,4,2,4,6};
		int ans=singleNumber(nums);
		System.out.print(ans);

	}
	
	static int singleNumber(int[] nums) {
		if(nums.length==1) {
			return nums[0];
		}
		
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i],0)+1);
		}
		
		for(HashMap.Entry<Integer, Integer> entry : map.entrySet() ) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		
		return -1;
	}

}
