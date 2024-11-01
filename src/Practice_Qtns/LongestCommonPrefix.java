package Practice_Qtns;
import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs= {"flower","flow","flight"};
		String ans=longestCommonPrefix(strs);
		System.out.print(ans);

	}
	static String longestCommonPrefix(String[] strs) {
		Arrays.sort(strs);
		StringBuilder ans =new StringBuilder();
		String first=strs[0];
		String last=strs[strs.length-1];
		for(int i=0;i<Math.min(first.length(),last.length());i++) {
			if(first.charAt(i)!=last.charAt(i)) {
				return ans.toString();
			}
			else
				ans.append(first.charAt(i));
		}
		return ans.toString();
		}

}
