package Practice_Qtns;

public class NumberMagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		int originalNumber=30; //assume x is originalNumber
		//add 1 to number : x+1
		result=originalNumber+1;
		
		//multiply number by 2 : 2*(x+1)=2x+2
		result=result*2;
		
		//add 4 to result : 2x+2+4=2x+6
		result=result+4;
		
		//divide the result by 2 : (2x+6)/2=x+3
		result=result/2;
		
		//subtract the original number : x+3-x=3
		result=result-originalNumber;
		
		System.out.println("I guess your result is 3");
		System.out.println("What did you get?"+result);

	}

}
