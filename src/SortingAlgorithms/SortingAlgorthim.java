package SortingAlgorithms;

import java.util.Arrays;

public class SortingAlgorthim {

	public static void main(String[] args) {
		int[] nums= {3, 5, 2, 1, 4};
		//System.out.println(Arrays.toString(bubbleSort(nums)));
		//System.out.println(Arrays.toString(selectionSort(nums)));
		//System.out.println(Arrays.toString(insertionSort(nums)));
		System.out.println(Arrays.toString(cyclicSort(nums)));
		

	}
	
	static int[] bubbleSort(int[] nums) {
		for(int i=0; i<nums.length;i++) {
			boolean swapped=false;
			for(int j=0; j<nums.length-1;j++) {
				if(nums[j]>nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					swapped= true;
				}
			}
			if(!swapped)
				break;
		}
		return nums;
	}
	
	
	static int[] selectionSort(int[] nums) {
		for(int i=0; i<nums.length-1;i++) {
			int min=i;
			for(int j=i+1; j<nums.length;j++) {
				if(nums[j]<nums[min]) {
					min=j;
				}
			}
			
			int swap=nums[min];
			nums[min]=nums[i];
			nums[i]=swap;
		}
		return nums;
	}
	
	
	static int[] insertionSort(int[] nums) {
		for(int i=0; i<nums.length-1;i++) {
			for(int j=i+1; j>0;j--) {
				if(nums[j]<nums[j-1]) {
					int temp=nums[j];
					nums[j]=nums[j-1];
					nums[j-1]=temp;
				}
				else {
					break;
				}
			}
		}
		return nums;
	}
	
	
	static int[] cyclicSort(int[] nums) {
		int i=0;
		while(i<nums.length) {
			int correctIndex=nums[i]-1;
			if(i!=correctIndex) {
				int temp=nums[i];
				nums[i]=nums[correctIndex];
				nums[correctIndex]=temp;
			}
			else
				i++;
			}
		
		return nums;
		}
		
	

}
