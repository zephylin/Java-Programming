package Leetcode_Practice;

public class Q2169_CountOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=2;
		int n2=3;
		int ans=countOperations(n1,n2);
		System.out.print(ans);

	}
	
	
	static int countOperations(int num1, int num2) {
		int count=0;
		return helper(num1,num2,count);
		
	}
	
	static int helper(int num1,int num2,int count) {
		if(num1==0 || num2==0) {
			return count;
		}
		if(num1>=num2) {
			return helper(num1-num2, num2,count+1);
		}
		return helper(num1,num2-num1,count+1);
		
	}

}
