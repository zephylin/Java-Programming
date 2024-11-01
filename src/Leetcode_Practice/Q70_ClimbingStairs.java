package Leetcode_Practice;

public class Q70_ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int ans=climbStairs(n);
		System.out.print(ans);

	}
	
	static int climbStairs(int n) {
	
		if(n<=1) {
			
			return 1;
		}
		int count=0;
		int first=1;
		int second=1;
		
		for(int i=2; i<=n;i++) {
			count=first+second;
			first=second;
			second=count;
		}
		return count;
		
	}

}
