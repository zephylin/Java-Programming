package Leetcode_Practice;
public class Q1342_NumberOfSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123;
		int ans=numberOfSteps(n);
		System.out.println(ans);
		System.out.print(nbrofSteps(n));
	}
	
	static int numberOfSteps(int num) {
		int count=0;
        return helper(num,count);
    }
	static int helper(int num, int count) {
		if(num==0) {
			return count;
		}
		if(num%2==0) {
			return helper(num/2,count+=1);
		}
		return helper(num-1,count+=1);
	}
	
	static int nbrofSteps(int num) {
		int ans=0;
		while(num>0) {
			if(num%2==0) {
				num=num/2;
			}
			else
				num=num-1;
			ans++;
		}
		return ans;
	}

}
