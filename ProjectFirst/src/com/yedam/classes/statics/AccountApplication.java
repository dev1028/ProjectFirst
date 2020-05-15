package com.yedam.classes.statics;
import java.util.Scanner;

public class AccountApplication {
	Scanner scn = new Scanner(System.in);
	private Account[] accounts = new Account[100];
	int idx = 0;
	
	//계좌생성
	private void createAccount() {
		System.out.println("계좌번호 선택.");
		System.out.println("계좌번호 입력하세요.");
		String ano = scn.nextLine();
		System.out.println("예금주 입력하세요.");
		String owner = scn.nextLine();
		System.out.println("금액을 입력하세요.");
		int balance = scn.nextInt();
		scn.nextLine();
		accounts[idx++] = new Account(ano, owner, balance);
		System.out.println("계좌 생성되었습니다.");
	}
	
	//계좌목록
	private void accountList() {
		System.out.println("계좌목록 선택.");
		for (Account acc : accounts) {
			if (acc != null) {
				System.out.println( "계좌번호: " + acc.getAno() 
								+ ", 예금주: " + acc.getOwner() 
								+ ", 잔액: " + acc.getBalance());
			}
		}
	}
	
	//입금
	private void deposit() {
		System.out.println("예금선택.");
		System.out.println("계좌번호 입력하세요");
		String ano = scn.nextLine();
		System.out.println("출금액 입력하세요");
		int balance = scn.nextInt();

		
		Account acc = findAccount(ano);
		if(acc != null) {
			acc.setBalance(acc.getBalance() + balance);
			System.out.println("예금 처리가 완료되었습니다.");
		}else {
			System.out.println("해당 계좌가 없습니다.");
		}
		
//		for (Account acc : accounts) {
//			if (acc != null && acc.getAno().equals(ano)) {
//				acc.setBalance(acc.getBalance() + balance);
//			}
//		}
		
	}
	
	//출금
	private void withdraw() {
		System.out.println("출금선택.");
		System.out.println("계좌번호 입력하세요");
		String ano = scn.nextLine();
		System.out.println("예금액 입력하세요");
		int balance = scn.nextInt();

		Account acc = findAccount(ano);
		if(acc != null) {
			acc.setBalance(acc.getBalance() - balance);
			System.out.println("출금 처리가 완료되었습니다.");
		}
		else {
			System.out.println("해당 계좌가 없습니다.");
		}
//		for (Account acc : accounts) {
//			if (acc != null && acc.getAno().equals(ano)) {
//				acc.setBalance(acc.getBalance() - balance);
//			}
//		}
	}
	
	// 6. 계좌번호 입력하면 해당 Account를 반환해주는 메소드
	private Account findAccount(String ano) {
		for(Account acc : accounts) {
			if(acc != null && acc.getAno().equals(ano)) {
				return acc;
			}
		}
		return null;
	}
	
	//종료
	public void execute() {
		while (true) { 
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록  | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			Scanner scn = new Scanner(System.in); 
			int menu = scn.nextInt(); 
			scn.nextLine();
			if (menu == 1) {
				createAccount();
			}else if (menu == 2) {
				accountList();
			}else if (menu == 3) {
				deposit();
			}else if (menu == 4) {
				withdraw();
			}else if (menu == 5) {
				break;
			}
		}
	}
}
