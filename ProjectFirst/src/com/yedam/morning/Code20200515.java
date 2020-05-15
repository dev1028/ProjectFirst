package com.yedam.morning;

public class Code20200515 {
	public static void main(String[] args) {
//		for(int i=1; i<=25; ++i) {
//			System.out.print(i + "\t");
//			if(i%5 == 0)
//				System.out.println();
//		}
		
		for(int i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) {
				System.out.print(i+1+j*5+ "\t");
			}
			System.out.println();
		}
	}
}
