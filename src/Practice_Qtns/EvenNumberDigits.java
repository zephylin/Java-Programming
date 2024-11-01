package Practice_Qtns;

public class EvenNumberDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {};
		int ans= findEvenNbrDigit(nums);
		System.out.println("Even number digits are: "+ans);
	}
	static int findEvenNbrDigit(int[] a) {
		int total=0;
		for(int element:a) {
			int x=0;
			if(element<0)
				element*=-1;
			while(element>0) {
				element/=10;
				x++;
			}
			if(x%2==0)
				total++;
		}
		return total;
	}

}
