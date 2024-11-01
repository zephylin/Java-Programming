package BitwiseOperation;

public class FindOddEVen {

	public static void main(String[] args) {
		 //Every number is calculated in binary form internally
		 int a=56;
		 System.out.println(find(a));

	}
	
	public static String find(int a ) {
		if((a&1)==1) {
			return "Odd";
		}
		
		return "Even";
	}

}
