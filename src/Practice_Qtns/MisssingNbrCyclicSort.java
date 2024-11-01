package Practice_Qtns;
import java.util.Arrays;
import java.util.*;

public class MisssingNbrCyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,0,1};
		int ans=findMissingNumber(arr);
		
		System.out.println(ans);

	}
	
	static int findMissingNumber(int[] arr) {
		cyclicSort(arr);
		int ans=arr.length;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==i)
				continue;
			else
				ans=i;
		}
		
		return ans;
		
		
	}
	
	static List<Integer> missingNumbers(int[] arr) {
		cyclicSort(arr);
		List<Integer> ans=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==i)
				continue;
			else
				ans.add(i);
		}
		
		return ans;
		
		
	}
	static void cyclicSort(int[] arr) {
		int i=0;
		while(i<arr.length-1) {
			
			int correct=arr[i];
			
			if(arr[i] <arr.length && arr[i]!=arr[correct]) {
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


