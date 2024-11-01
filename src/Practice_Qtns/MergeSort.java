package Practice_Qtns;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] nums1= {0};
		int[] nums2={1};
		
		int m=0;
		int n=1;
		
		merge(nums1,m,nums2,n);
		System.out.print(Arrays.toString(nums1));
	}
	
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        int i=0;
        int k=0;
       
        
        int[] mix=new int[m+n];
        
        
		while(i<m && j<n) {
			if(nums1[i]<nums2[j]) {
				mix[k]=nums1[i];
				i++;
			}
			else {
				mix[k]=nums2[j];
				j++;
			}
			
			k++;
		}
		 while(i<m) {
			 mix[k]=nums1[i];
			 i++;k++;
		 }
		 while(j<n) {
			 mix[k]=nums2[j];
			 j++;
			 k++;
		 }
		 
		 for(int l=0;l<mix.length;l++) {
			 nums1[l]=mix[l];
		 }
		
		
    }

}
