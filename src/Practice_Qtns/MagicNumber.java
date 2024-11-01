package Practice_Qtns;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int ans=magicNumber(n);
		System.out.println(ans);
		

	}
	
	static int magicNumber(int n)
	{
		int ans=0;
		for(int i=1; n>0;i++) {
			ans+=(n&1)*Math.pow(5, i);
			n=n>>1;
		}
		return ans;
	}

}
