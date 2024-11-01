package Practice_Qtns;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("enter a number: ");
		int a=scan.nextInt();
		boolean x=result(a);
		System.out.println(x);
	}
	static boolean result(int a) {
		int x;
		int p=a;
		int num=0;
		while(a>0) {
			x=a%10;
			a/=10;
			num=num+(x*x*x);
			
		}
		return num==p;
	}
}
