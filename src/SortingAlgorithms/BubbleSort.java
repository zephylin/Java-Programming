package SortingAlgorithms;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,3,4,1,3};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			boolean swapped=false;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp;
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
					
				}
				
			}
			if(!swapped)
				break;
		}
	}

}
