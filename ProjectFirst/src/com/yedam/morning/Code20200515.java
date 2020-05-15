package com.yedam.morning;

public class Code20200515 {
	public static void main(String[] args) {
//		for(int i=1; i<=25; ++i) {
//			System.out.print(i + "\t");
//			if(i%5 == 0)
//				System.out.println();
//		}

		//i 행, j열 		       j=0 1  2  3  4
		// 1  6 11 16 21 (-1) -> 0 5 10 15 20
		// 2  7 12 17 22 (-2) -> 0 5 10 15 20
		// 3  8 13 18 23 (-3) -> 0 5 10 15 20
		// 4  9 14 19 24 (-4) -> 0 5 10 15 20
		// 5 10 15 20 25 (-5) -> 0 5 10 15 20
		

		for(int i=1; i<=5; ++i) {
			for(int j=0; j<5; ++j) {
				System.out.print(i+j*5+ "\t");
			}
			System.out.println();
		}
	}
}
