package Leetcode_Practice;

import java.util.ArrayList;
import java.util.List;

public class Q1431_KidsWithCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candies= {2,3,5,1,3};
		int extraCandies=3;
		System.out.print(kidsWithCandies(candies,extraCandies));

	}
	
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> myList = new ArrayList<>();
        int max=candies[0];
        for(int i=0;i<candies.length; i++){
            max=Math.max(max,candies[i]);
        }

        for(int candy : candies){
            if(candy+extraCandies >=max){
                myList.add(true);
            }
            else{
                myList.add(false);
            }
        }

        return myList;
    }

}
