package com.yedam.dev;
import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);
		int maxScore = Integer.MIN_VALUE;
		while(run) {
			System.out.println("=======");
			System.out.println("1.학생수 2.점수 3.점수 리스트 4.분석 5.종료");
			System.out.println("=======");
			
			int selectNo = scn.nextInt();
			scn.nextLine();

			if(selectNo == 1) {
				maxScore = Integer.MIN_VALUE;
				studentNum = scn.nextInt();
				scores = new int[studentNum];
				System.out.println("학생 배열 생성");
			}
			else if(selectNo == 2) {
				for(int i=0; i<scores.length; ++i) {
					System.out.println("점수 입력:");
					int score = scn.nextInt();
					scores[i] = score;
					if(maxScore < score){
						maxScore = score;
					}
				}	
			}else if(selectNo == 3) {
				for(int i=0; i<scores.length; ++i) {
					System.out.println("scores[" + i + "]:" + scores[i]);
				}
			}else if(selectNo == 4) {
				int sum = 0;
				int cnt = 0;
				for(int score : scores) {
					sum += score;
					cnt++;
				}
				double avg = (double)sum / cnt;
				System.out.println("합계: " + sum);
				System.out.println("평균: " + avg);
				System.out.println("최대: " + maxScore);
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
