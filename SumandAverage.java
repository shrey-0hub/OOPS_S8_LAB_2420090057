package com.klh;

public class SumandAverage {

	public static void main(String[] args) {
		
		int[] num= {24,20,60,30,58};
		int sum=0;
		double avg;
		for(int i=0;i<num.length;i++) {
			sum = sum+num[i];
		}
		 avg=sum/(double)num.length;
		 System.out.print("SUM:"+sum);
		 System.out.print("AVG:"+avg);

	}

}
