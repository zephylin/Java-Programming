package Leetcode_Practice;

public class Q69_Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=8;
		int ans=mySqrt(x);
		System.out.print(ans);
		
	}
	
	static int mySqrt(int x) {
		if(x==0 || x==1) {
			return x;
		}
		
	int start=1;
	int end=x;
	int ans=0;
	while(start<=end) {
		int mid=start+(end-start)/2;
		
		if((long)mid*mid==x) {
			return mid;
		}
		
		if((long)mid*mid>x) {
			end=mid-1;
		}
		
		else
		{
			
			start=mid+1;
			ans=mid;
		}
		
	
		
	}
		
	return ans;
	}

}
