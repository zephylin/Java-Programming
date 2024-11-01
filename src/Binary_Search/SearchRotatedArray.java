package Binary_Search;

public class SearchRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,7,1,2,3,4,5};
		int target=6;
		int ans=search(arr,target);
		System.out.print(ans);

	}
	static int search(int[] nums, int target) {
        int peak=peakIndex(nums);
        if(peak==-1)
        	return binarySearch(nums,target,0,nums.length-1);
        if(nums[peak]==target)
        	return peak;
        if(target>=nums[0])
        	return binarySearch(nums,target,0,peak-1);
        return binarySearch(nums,target,peak+1,nums.length-1);
        
    }
	static int binarySearch(int[]arr, int target,int start, int end) {
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target<arr[mid])
				end=mid-1;
			else if(target>arr[mid])
				start=mid+1;
			else
				return mid;
		}
		return -1;
	}
	static int peakIndex(int[]arr) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(mid<end && arr[mid]>arr[mid+1])
				return mid;
			if(mid>start && arr[mid]<arr[mid-1]) 
				return mid-1;
			if(arr[mid]<=start)
				end=mid-1;
			else
				start=mid+1;
		}
		return -1;
	}

}
