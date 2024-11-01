package SortingAlgorithms;
import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,4,2,9,10};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	

	}
	static void insertionSort(int[] arr) {
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}else
					break;
			}
		}
	}
	static void swap(int[]arr, int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

}
