package Practice_Qtns;

public class PalindromeNbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=121;
		boolean ans=isPalindrome(x);
		System.out.println(ans);
		

	}
	static boolean isPalindrome(int x) {
		//boolean result=false;
		int original=x;
		if(x<0) {
			return false;
		}
		int compare=0;
		int a;
		while(x>0) {
			a=x%10;
			compare=(compare*10)+a;
			x/=10;
		}
		return (compare==original);
	}

}
