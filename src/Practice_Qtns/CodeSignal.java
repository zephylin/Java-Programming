package Practice_Qtns;

import java.util.Arrays;

public class CodeSignal {

	public static void main(String[] args) {
		int[] nums= {3,1,0,4};
		int[] ans=myFunction(nums);
		System.out.print(Arrays.toString(ans));

	}
	
	public static int[] myFunction(int[] nums) {
		int count;
		int p=1;
		int[] ans=new int[nums.length];
		for(int i=0; i<nums.length;i++) {
			
			int[] x=Arrays.copyOfRange(nums, 0,i+1);
			Arrays.sort(x);
			count=1;
			for(int j=0; j<x.length-1;j++) {
				if(x[j]==x[j+1]-1) {
					count++;
					p=Math.max(p, count);
				}
				else {
					count=1;
				}
				
			}
			ans[i]=p;
			
		}
		return ans;
	}

}
