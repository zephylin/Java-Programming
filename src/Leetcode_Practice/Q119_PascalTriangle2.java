package Leetcode_Practice;

import java.util.ArrayList;
import java.util.List;
public class Q119_PascalTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=0;
		System.out.print(getRow(row));

	}
	
	static List<Integer> getRow(int rowIndex) {
	 List<List<Integer>> myList=new ArrayList();
		 List<Integer> ans=new ArrayList();
		 for(int i=0;i<=rowIndex;i++) {
			 
			 List<Integer> row=new ArrayList<>();
			 for(int j=0;j<=i;j++) {
				 if(j==0 || j==i)
					 row.add(1);
				 else
					 row.add(myList.get(i-1).get(j-1)+myList.get(i-1).get(j));
			 }
			 myList.add(row);
		 }
		 
		 ans=myList.get(rowIndex);
		 return ans;
        
    }


}
