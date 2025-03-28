package Practice_Qtns;

public class LargestAndSmallestValue {

	public static void main(String[] args) {
		int[] nums = {2,10,2,6,4,9,15,12,7,11};
		System.out.println(sln(nums).toString());

	}
	 public static int[] sln(int[] nums) {
		 int min=Integer.MAX_VALUE;
		 int max = Integer.MIN_VALUE;
		 int[] ans = new int[2];
		 for(int i=0; i<nums.length-1;i++) {
			 if(nums[i]>=max) {
				 max=nums[i];
			 }
			 else if(nums[i]<min){
				 min=nums[i];
			 }
		 }
		 ans[0]=min;
		 ans[1]=max;
		 
		 return ans;
	 }

}
