package Leetcode_Practice;

import java.util.Arrays;

public class Q1672_MaximumWealth {

	public static void main(String[] args) {
		int[][] accounts={{1,2,3},{3,2,1}};
		System.out.print(maximumWealth(accounts));

	}

	public static int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for(int row=0; row<accounts.length;row++) {
        	int total=0;
        	for(int col : accounts[row]) {
        		total+=col;
        	}
        	max=Math.max(max, total);
        }
        
        return max;
    }
}
