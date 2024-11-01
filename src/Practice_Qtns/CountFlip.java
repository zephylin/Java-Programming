package Practice_Qtns;
import java.util.Scanner;
public class CountFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Coin myCoin=new Coin();
		int countHead=0;
		int countTails=0;
		System.out.println("Enter the number of flips: ");
		int flips=scan.nextInt();
		for(int i=1;i<=flips;i++) {
			myCoin.flip();
			System.out.println("current flip shows: "+myCoin);
			if(myCoin.isHead())
				countHead++;
			else
				countTails++;
			
		}
		System.out.println("Number of flips are: "+flips);
		System.out.println("Number of heads are: "+countHead);
		System.out.println("Number of tails are: "+countTails);

	}

}
