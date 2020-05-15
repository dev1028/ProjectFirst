package com.yedam.classes.inherit;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=9; ++i) {
			for(int j=2; j<=9; ++j) {
				if(i==0)
					System.out.print(String.format("[%d단]\t ", j));
				else
					System.out.print(String.format("%d*%d=%d \t", j, i, i*j));
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=2; i<=9; ++i) {
			System.out.print(String.format("%d*%d=%d \t", i, 1, i*1));
		}
		System.out.println();
		
		for(int i=2; i<=9; ++i) {
			System.out.print(String.format("%d*%d=%d \t", i, 2, i*2));
		}
		System.out.println();
		
		for(int i=2; i<=9; ++i) {
			System.out.print(String.format("%d*%d=%d \t", i, 3, i*3));
		}
		System.out.println();
		System.out.println();
		
		for(int k=1; k<=9; ++k)	{
			for(int i=2; i<=9; ++i) {
				//System.out.print(String.format("%d*%d=%d \t", i, k, i*k));
				System.out.print("" + i + "*" + k + "=" + i*k + " ");
			}
			System.out.println();	
		}
	}

}
