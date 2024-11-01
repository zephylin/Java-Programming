package Binary_Search;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,7,6,1,2,6};
		int target=6;
		int ans=removeElement(arr,target);
		System.out.println(ans);
	}
	static int removeElement(int[] arr, int target) {
		int a=arr.length;
		int[]arr2=new int[a];
		int j=0;
		for(int i=0; i<a;i++) {
			if(arr[i]!=target) {
				arr2[j]=arr[i];
				j++;
			}
		}
		return j++;
	}

}
