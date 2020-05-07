package com.yedam.dev;

public class ArrayExample {
	public static void main(String[] args) {
		int[] intAry = new int[5];
		intAry[0] = 10;
		intAry[1] = 20;
		intAry[2] = 30;
		intAry[3] = 40;
		intAry[4] = 50;
//		intAry[5] = 50; 
 
		System.out.println(intAry[0]);

		// 문제.
		int intAry3[] = new int[10];
		for (int i = 0; i < 10; ++i) {
			intAry3[i] = (i + 1) * 5;
		}

		for (int i = 0; i < intAry3.length; ++i) {
			System.out.println(intAry3[i]);
		}
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		Example08(array);
	}
	
	public static void Example08(int[][] array) {
		int sum = 0;
		int length = 0;
		double avg = 0.0;
		for(int row = 0; row < array.length; ++row) {
			length += array[row].length;
			for(int col = 0; col < array[row].length; ++col) {
				sum += array[row][col];
			}
		}
		
		avg = (double)sum / length;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
