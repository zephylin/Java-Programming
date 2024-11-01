package Leetcode_Practice;
import java.util.Arrays;
import java.util.HashMap;

public class Q1331_RankTransform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {37,12,28,9,100,56,80,5,12};
		System.out.print(Arrays.toString(arrayRankTransform(arr)));
 
	}
	 static int[] arrayRankTransform(int[] arr) {
	    HashMap<Integer,Integer> map=new HashMap<>();
	    int[] results=Arrays.copyOf(arr, arr.length);
	    Arrays.sort(arr);
	    int rank=1;
	    for(int i=0;i<arr.length;i++) {
	    	if(!map.containsKey(arr[i])) {
	    		map.put(arr[i],rank);
	    		rank++;
	    	}
	    }
	    
	    for(int j=0;j<arr.length;j++) {
	    	results[j]=map.get(results[j]);
	    }
	    
	    return results;
	   }

}//Output: [5,3,4,2,8,6,7,1,3]
