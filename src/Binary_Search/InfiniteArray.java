package Binary_Search;

public class InfiniteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,5,5,8,9,10,15,89,100};
		int target=10;
		int ans=ans(arr,target);
		System.out.println(ans);
		}
	static int ans(int[] arr,int target)
	{
		int start=0;
		int end=1;
		while(target>arr[end]) {
			int newS=end+1;
			end=end+(end-start+1)*2;
			start=newS;
		}
		return mySearch(arr,target,start, end );
	}
	static int mySearch(int[]arr, int target,int start,int end) {
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
