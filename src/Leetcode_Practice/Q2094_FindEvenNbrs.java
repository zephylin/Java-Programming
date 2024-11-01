package Leetcode_Practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q2094_FindEvenNbrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,2,8,8,2};
		System.out.print(Arrays.toString(findEvenNumbers(nums)));

	}
	
    static int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> myList=new ArrayList<>();
        HashMap<Integer, Integer> myMap=new HashMap<>();
     
        for(int i:digits) {
        	myMap.put(i,myMap.getOrDefault(i,0)+1);
        }
        for(int i=100;i<=999;i++) {
        	if(i%2!=0) {
        		continue;
        	}
        	int count=0;
        	int j=i;
        	HashMap<Integer, Integer> myMap2 = new HashMap<>(myMap);
        	while(j>0) {
        		int rem=j%10;
        		j/=10;
        		if(myMap2.containsKey(rem) && myMap2.get(rem)>0) {
        			myMap2.put(rem, myMap2.get(rem)-1);
        			count++;
        		}
        		else
        			break;	
        		
        	}
        	
        	if(count==3) {
        		myList.add(i);
        	}
        }
        int[] myArray = myList.stream().mapToInt(Integer::intValue).toArray();

        
        return myArray;
    }

}
