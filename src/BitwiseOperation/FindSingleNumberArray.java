package BitwiseOperation;

public class FindSingleNumberArray {

	public static void main(String[] args) {
		int[] nums= {2,3,4,1,2,1,3,6,4};
		System.out.println("Single number is: "+find(nums));

	}
	
	public static int find(int[] nums) {
		int ans=0;
		for(int num : nums) {
			ans^=num;
		}
		
		return ans;
	}

}
