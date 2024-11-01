package Practice_Qtns;

public class maximumWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] accounts= {
				{1,2,3},
				{4,5,8},
				{4,2,1}
		};
		int ans=maxAmount(accounts);
		System.out.println("Maximum money the richest has is: "+ans);

	}
	static int maxAmount(int[][] account) {
		int sum;
		int max=Integer.MIN_VALUE;
		for(int[] banks:account ) {
			sum=0;
			for(int bank: banks) {
				sum+=bank;
			}
			if(sum>max)
				max=sum;
		}
		return max;
	}

}
