package Leetcode_Practice;

import java.util.Stack;
public class Q20ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="{{}";
		boolean ans=isValid(s);
		System.out.print(ans);
		
	}
	
	static boolean isValid(String s) {
        Stack<Character> myStack=new Stack<>();
        for(int i=0; i<s.length();i++) {
        	if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='[') {
        		myStack.push(s.charAt(i));
        	}
        	if(s.charAt(i)=='}') {
        		if(!myStack.isEmpty()) {
        		char x=myStack.pop();
        		if(x!='{')
        			return false;
        		}
        		else
        			return false;
        		}
        	if(s.charAt(i)==']') {
        		if(!myStack.isEmpty()) {
        		char x=myStack.pop();
        		if(x!='[')
        			return false;
        		}
        		else
        			return false;
        		}
        	if(s.charAt(i)==')') {
        		if(!myStack.isEmpty()) {
        		char x=myStack.pop();
        		if(x!='(')
        			return false;
        		}
        		else
        			return false;
        		}
        }
        
        return myStack.isEmpty();
    }

}
