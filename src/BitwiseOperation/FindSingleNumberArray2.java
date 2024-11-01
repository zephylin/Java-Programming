package BitwiseOperation;

public class FindSingleNumberArray2 {

	public static void main(String[] args) {
		int[] nums= {2,2,3,2};
		System.out.println(find(nums));

	}
	
	public static int find(int[] nums) {
		
		int ans=0;
		for(int i=0;i<32;i++) {
			int countBit=0;
			for(int num : nums) {
				if(((num>>i)&1)==1) {
					countBit++;
				}
			}
			
			if(countBit %3 != 0) {
				ans|=1<<i;
			}
		}
		
		return ans;
	}

}
