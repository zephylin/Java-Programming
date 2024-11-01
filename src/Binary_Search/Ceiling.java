package Binary_Search;

public class Ceiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub0
		int[] arr = {2,3,5,8,9,14,16,19};
		int target=20;
		int ans=ceiling(arr,target);
		System.out.println(ans);
		
	}
	static int ceiling(int[]arr, int target) {
		int start=0;
		int end=arr.length-1;
		if(target>arr[end])
			return -1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target<arr[mid])
				end=mid-1;
			else if(target>arr[mid])
				start=mid+1;
			else
				return arr[mid];
		}
		return arr[start];
	}


}
