package com.klh;

import java.util.Arrays;

public class reversearr {

	public static void main(String[] args) {
		int[] org= {1,2,3,4,5};
		int[] rev=new int[org.length];
		for(int i=0;i<org.length;i++) {
			rev[i]=org[org.length-1-i];
			
		}
		System.out.print("ORIGINAL ARRAY: "+Arrays.toString(org));
	
		System.out.print("Reversed ARRAY: "+Arrays.toString(rev));

	}

}
