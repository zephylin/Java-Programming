package Practice_Qtns;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {1,3};
		int target=2;
		int ans=searchInsert(nums,target);
		System.out.println(ans);
	}
	
	 static int searchInsert(int[] nums, int target) {
		 
		 int start=0;
	
		 int end=nums.length-1;
		 if(target<nums[start])
			 return start;
		 if(target>nums[end])
			 return end+1;
		 while(start<=end) {
			 int mid=start+(end-start)/2;
			 if(target==nums[mid]) {
				 return mid;
			 }
			 if(target<nums[mid]) {
				 end=mid-1;
			 }
			 if(target>nums[mid]) {
				 start=mid+1;
			 }
			 
		 }
		 return start;

	
	 }
}