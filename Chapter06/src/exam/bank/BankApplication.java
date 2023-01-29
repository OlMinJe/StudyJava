package exam.bank;

import java.util.Scanner;

import exam.Account01;
import section07.exam3.package1.A;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {		
		boolean run = true;
		while(run) {
			printMenu();
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo) {
				case 1 -> createAccount();
				case 2 -> accountList();
				case 3 -> deposit();
				case 4 -> withdraw();
				default -> {
					run = false; 
					System.out.println("프로그램 종료");
					break;
				}
			} //switch(selectNo)
		} //while(run)
	} //void main(String[] args)

	// 0. 메뉴 선택
	public static void printMenu() {
		System.out.println("-----------------------------------");
		System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
		System.out.println("-----------------------------------");
		System.out.print("선택> ");

	}//void printMenu()
	
	// 1. 계좌 생성
	public static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		String AccounNumber = sc.nextLine();
		System.out.print("계좌주: ");
		String name = sc.nextLine();
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(sc.nextLine());
	
		Account account = new Account(AccounNumber, name, balance);
		
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				System.out.print("결과: 계좌가 생성되었습니다.");
				break;
			}
		}		
	}//void createAccount()
	
	// 2. 계좌 목록
	public static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		
		for(Account accountArray : accountArray) {
			if(accountArray != null) {
				System.out.print(accountArray.getAccountNumber() + "\t" + 
								accountArray.getName() + "\t" + accountArray.getBalance() + "\n");
			}
		}
	}//void accountList()
	
	// 3. 예금
	public static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		String accounNumber = sc.nextLine();
		Account account = findeAccount(accounNumber);

		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}

		System.out.print("예금액: ");
		int money = Integer.parseInt(sc.nextLine());
		account.setBalance(account.getBalance() + money);
		System.out.println("예금 성공");
	}
	
	// 4. 출금
	public static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		String accounNumber = sc.nextLine();
		Account account = findeAccount(accounNumber);
		
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		
		System.out.print("출금액: ");
		int money = Integer.parseInt(sc.nextLine());
		if(account.getBalance() - money < 0) {
			System.out.println("잔고 부족");
			return;
		}
		
		account.setBalance(account.getBalance() - money);
		System.out.println("출금 성공");
	}

	// 3-1/4-1. 계좌 번호 찾기
	public static Account findeAccount(String accountNumber) {
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null && accountArray[i].getAccountNumber().equals(accountNumber)) {
				return accountArray[i];
			}
		}
		
		return null; // 객체 타입이라 null 전달
	}
}
