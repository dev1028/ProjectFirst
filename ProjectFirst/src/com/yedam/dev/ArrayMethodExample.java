package com.yedam.dev;

public class ArrayMethodExample {

	public static void main(String[] args) {
		int[] ary = { 10, 203, 405, 66, 30 };
		int m = getLargeVal(ary);
		System.out.println(m);
		
		
		
		int s = sumAry(ary);
		System.out.println(s);

		double[] ary2 = { 1.1, 2.2, 3.3, 4.4 };
		double avg = avgAry(ary2);

		double[] ary3 = { 1.12, 2.22, 3.33, 4.44 };
		avg = avgAry(ary3);
		System.out.println(avg);

		int d = Double(10);
		System.out.println(d);
		
		System.out.println(getString("Hello", "world"));
		
		String[] strAry = { "Lee", "Kim", "Park", "Choi", "Han"};
		System.out.println(getString(strAry));
	}

	public static int Double(int x) {
		return 2 * x;
	}

	public static double avgAry(double[] ary) {

		if (ary.length == 0)
			return 0;

		double s = 0;
		for (int i = 0; i < ary.length; ++i) {
			s += ary[i];
		}
		return s / ary.length;
	}

	public static int sumAry(int[] ary) {
		int s = 0;
		for (int i = 0; i < ary.length; ++i) {
			s += ary[i];
		}
		return s;
	}

	public static int getLargeValue(int a, int b) {
		if (a >= b)
			return a;
		else
			return b;
	}

	// int[] ary = {3,6,2,4,619}
	public static int getLargeVal(int[] ary) {
		int max = Integer.MIN_VALUE;
		//max = -21억
//		for(int n : ary){
//			if( n > max)
//				max = n;
//		}

		for (int i = 0; i < ary.length; i++) {
			if (max < ary[i]) {
				max = ary[i];
			}
		}
		return max;
	}
	
	public static String getString(String str1, String str2) {
		return str1 + " - " + str2;
	}
	
	public static String getString(String[] strAry) {
		String all = strAry[0]; 
		for(int i=1; i<strAry.length; ++i) {
			all = all + "-" + strAry[i];
		}
		return all;
	}	

}
