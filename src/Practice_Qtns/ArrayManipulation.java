package Practice_Qtns;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		int[] a= {4, 0, 1, -2, 3};
		int[]b= new int[a.length];
		int x=0,y,z=0;
		for(int i=0; i<a.length;i++) {
			if(i-1<0) {
				x=0;
			}
			else if(i+1>=a.length)
				z=0;
			else {
				x=a[i-1];
				z=a[i+1];
			}
			y=a[i];
			b[i]=x+y+z;
		}
		System.out.println(Arrays.toString(b));

	}

}
