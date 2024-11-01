package Binary_Search;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,7,9,50,65,100};
		int target=99;
		System.out.println(search(arr,target,0,arr.length-1));

	}
	
	public static int search(int[] arr, int target, int s,int e) {
		
		if(e<s) {
			return -1;
		}
		
		int mid=s+(e-s)/2;
		if(target==arr[mid]) {
			return mid;
		}
		
		if(target>arr[mid]) {
			return search(arr,target, mid+1,e);
		}
		
		return search(arr, target, s,mid-1);
	}

}
