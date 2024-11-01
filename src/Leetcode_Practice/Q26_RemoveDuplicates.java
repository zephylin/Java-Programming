package Leetcode_Practice;

public class Q26_RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,1,3,3,5};
		System.out.print(removeDuplicates(nums));

	}
	
    static int removeDuplicates(int[] nums) {
       
    	int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

        
        
        
    }


