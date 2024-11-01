package Practice_Qtns;
import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,4,2,1,5};
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	static void cyclicSort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correct=arr[i]-1;
			if(arr[i]!=arr[correct]) {
				swap(arr,i,correct);
				
			}
			else
				i++;
		}
	}
	static void swap(int[]arr, int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}


}
