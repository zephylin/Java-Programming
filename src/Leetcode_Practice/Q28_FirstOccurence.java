package Leetcode_Practice;

public class Q28_FirstOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="mississippi";
		String b="issip";
		int ans=strStr3(a,b);
		System.out.println(ans);
	}
	static int strStr2(String haystack, String needle) {
		  for (int i = 0; ; i++) {
		    for (int j = 0; ; j++) {
		      if (j == needle.length()) return i;
		      if (i + j == haystack.length()) return -1;
		      if (needle.charAt(j) != haystack.charAt(i + j)) break;
		    }
		  }
		}
	static int strStr3(String haystack, String needle) {
		 return haystack.indexOf(needle);
		}
	static int strStr(String haystack, String needle) {
		int x=0,count=1;
        for(int i=0;i<haystack.length();i++) {
        	if(haystack.charAt(i)==needle.charAt(0)) {
        		 x=i;
        		 int p=i+1;
        		for(int j=1;j<needle.length();j++) {
        			
        			if(needle.charAt(j)==haystack.charAt(p)) {
        				count++;
        				p++;
        			}
        			else
        				break;
        		}
        		 if (count==needle.length())
        	        	return x;
			}
        }
       
        return -1;
    }

}
