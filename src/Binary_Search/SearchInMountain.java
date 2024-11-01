package Binary_Search;

public class SearchInMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,5,7,3,0};
		int ans=peakIndex(arr);
		System.out.println(ans);

	}
	static int peakIndex(int[]arr) {
		int start=0;
		int end=arr.length-1;
		//int ans=-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1])
				end=mid;
			else 
				start=mid+1;
			//ans=mid;
		}
		return start;
	}
	static int mySearch(int[]arr, int target) {
		int start=0;
		int end=arr.length-1;
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
}
