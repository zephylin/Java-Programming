package Practice_Qtns;

public class StringPalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("umuvumu");
		System.out.println(isPalindrome(a));

	}
	
	public static boolean isPalindrome(String str) {
	    if (str == null) return false;
	    
	    str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
	    int left = 0;
	    int right = str.length() - 1;
	    
	    while (left < right) {
	        if (str.charAt(left) != str.charAt(right)) {
	            return false;
	        }
	        left++;
	        right--;
	    }
	    return true;
	}

}
