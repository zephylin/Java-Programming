package Leetcode_Practice;

import java.util.Arrays;

public class Q121_MaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {7,6,5,8};
		System.out.println(maxProfit2(nums));

	}
	
	static int maxProfit(int[] prices) {
	        int maxProfit=0;
	        int minPrice=prices[0];
	        for(int price: prices) {
	        	if(price<minPrice)
	        		minPrice=price;
	        	else {
	        		maxProfit=Math.max(maxProfit, price-minPrice);
	        	}
	        }
	           
	        return maxProfit;
	    }
	
	static int maxProfit2(int[] prices) {
		
		int min=Integer.MAX_VALUE;
		int max=0;
		
		for(int price: prices) {
			min=Math.min(min, price);
			max=Math.max(max, price-min);
		}
		return max;
	}

}
