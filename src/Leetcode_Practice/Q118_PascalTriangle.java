package Leetcode_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Q118_PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows=5;
		System.out.print(generate(numRows));

	}
	
	 static List<List<Integer>> generate(int numRows) {
		 List<List<Integer>> myList=new ArrayList();
		 
		 for(int i=0;i<numRows;i++) {
			 
			 List<Integer> row=new ArrayList<>();
			 for(int j=0;j<=i;j++) {
				 if(j==0 || j==i)
					 row.add(1);
				 else
					 row.add(myList.get(i-1).get(j-1)+myList.get(i-1).get(j));
			 }
			 myList.add(row);
		 }
		 
		 
		 return myList;
	    }

}
