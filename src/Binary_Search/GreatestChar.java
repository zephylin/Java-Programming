package Binary_Search;

public class GreatestChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'c','d','f'};
		char target='e';
		char ans=myChar(arr,target);
		System.out.print(ans);
		
	}
	static char myChar(char[] arr, char target ) {
		int start=0;
		int end=arr.length-1;
		
		/* if(arr[end]<=target) 
		 * return arr[start]; */
		 
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target<arr[mid])
				end=mid-1;
			else
				start=mid+1;
		}
		return arr[start%arr.length];
	}

}
