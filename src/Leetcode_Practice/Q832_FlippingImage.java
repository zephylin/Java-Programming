package Leetcode_Practice;

import java.util.Arrays;

public class Q832_FlippingImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] image= {
				{1,1,0},
				{1,0,1},
				{0,0,0}};
		int[][] ans=flipAndInvertImage1(image);
		System.out.println(image[0].length-1);
		System.out.println(Arrays.deepToString(ans));

	}
	static int[][] flipAndInvertImage1(int[][] image) {
		for(int[] row: image) {
			for(int i=0;i<(row.length+1)/2;i++) {
					int swap=row[i]^1;
					row[i]=row[row.length-i-1]^1;
					row[row.length-i-1]=swap;
			}
		}
		return image;
	}
	
	static int[][] flipAndInvertImage(int[][] image) {
		int[][] originalImage = new int[image.length][]; 
		  for (int row = 0; row < image.length; row++) {
	            originalImage[row] = Arrays.copyOf(image[row], image[row].length);
	        }
        for(int row=0;row<originalImage.length;row++) {
        	int i=0;
        	for(int col=originalImage[row].length-1;col>=0;col--) {
        		
        		image[row][i]=originalImage[row][col];
        		image[row][i]=(image[row][i])^1;
        		i++;
        		
        	}
        }
        return image;
    }

}
