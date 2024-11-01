package SortingAlgorithms;
import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,4,2,9,10};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	

	}
	static void selectionSort(int[] arr) {
	
		for(int i=0; i<arr.length;i++) {
			int last=arr.length-i;
			int maxIndex=getMaxIndex(arr,last);
			swap(arr,maxIndex,last-1);
			
			
		}
		}
	static void swap(int[]arr, int maxIndex, int last) {
		int temp=arr[maxIndex];
		arr[maxIndex]=arr[last];
		arr[last]=temp;
	}
	static int getMaxIndex(int[] arr, int last) {
		int max=0;
		for(int i=1;i<last;i++) {
			if(arr[i]>arr[max])
				max=i;
		}
		return max;
	}
		

}
