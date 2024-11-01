package Leetcode_Practice;

public class Q680_ValidPalindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abac";
		boolean ans=isValidPalindrome2(s);
		System.out.print(ans);

	}
	static boolean isValidPalindrome2(String s) {
		int left=0;
		int right=s.length()-1;
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1);
			}
			left++;
			right--;
		}
		return true;
			
	}
	
	static boolean isPalindrome(String s, int left, int right) {
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			}
			left++;
			right--;
			
		}
		return true;
	}

}
