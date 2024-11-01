package Recursion;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6};
		int target=1;
		System.out.println(search(nums,target));
		System.out.println(searchRecursion(nums,target,0,nums.length-1));

	}
	
	public static int search(int[] nums,int target) {
		int start=0;
		int end=nums.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(nums[mid]==target) 
				return mid;
			if(nums[mid]<target) 
				start=mid+1;
			else
				end=mid-1;
		}
		
		return -1;
		
	}
	
	public static int searchRecursion(int[] nums, int target, int start, int end) {
		int mid=start+(end-start)/2;
		if(start>end) {
			return -1;
		}
		
		if(nums[mid]==target) {
			return mid;
		}
		
		if(target<nums[mid]) {
			return searchRecursion(nums, target, start, mid-1);
		}
		
		else {
			return searchRecursion(nums,target,mid+1,end);
		}
		
	}

}
