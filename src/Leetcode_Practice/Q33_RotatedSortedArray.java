package Leetcode_Practice;

public class Q33_RotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {4,5,6,7,0,1,2};
		int target=0;
		System.out.println(search(nums,target));

	}
	static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end) {
        	int mid=start+(end-start)/2;
        	if(target==nums[mid])
        		return mid;
        	if(nums[start]<=nums[mid]) {
        		if(target>=nums[start] && target<=nums[mid]) {
        			end=mid-1;
        		}
        		else {
        			start=mid+1;
        		}
        		
        	}
        	
        	else{
        		if(target>=nums[mid] && target<=nums[end]) {
        		start=mid+1;
        		
        	}else {
        	end=mid-1;
        	}
        	}
        }
        
        return -1;
        
    }

}
