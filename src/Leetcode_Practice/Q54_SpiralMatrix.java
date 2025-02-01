package Leetcode_Practice;

import java.util.ArrayList;
import java.util.List;

public class Q54_SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3,4},
						  {5,6,7,8},
						  {9,10,11,12}
						 };
		
		System.out.print(spiralOrder(matrix));

	}
	
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        
        int top=0;
        int right=(matrix[0].length)-1;
        int left=0;
        int bottom=matrix.length-1;
        
        while((top<=bottom) && (left<=right)) {
        	//traverse top 
        	for(int i=left; i<=right; i++) {
        		ans.add(matrix[top][i]);
        	}
        	top++;
        	
        	//traverse from right
        	for(int i=top; i<=bottom;i++) {
        		ans.add(matrix[i][right]);
        	}
        	right--;
        	
        	if(top<=bottom) {
        	//traverse from right to left
        	for(int i=right; i>=left; i--) {
        		ans.add(matrix[bottom][i]);
        	}
        	
        	bottom--;
        	}
        	
        	if(left<=right) {
        	//traverse bottom to top
        	for(int i=bottom; i>=top;i--) {
        		ans.add(matrix[i][left]);
        	}
        	left++;
        	}
        	
        	
        	
        }
        
        return ans;
    }

}
