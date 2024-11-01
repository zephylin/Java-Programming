package Binary_Search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub0
		int[] arr = {2,3,5,8,9,14,16,19};
		int target=19;
		int ans=binarySearch(arr,target);
		System.out.println(ans);
		
	}
	static int binarySearch(int[]arr, int target) {
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
