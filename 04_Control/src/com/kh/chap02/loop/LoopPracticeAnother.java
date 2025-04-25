package com.kh.chap02.loop;

import java.util.Scanner;

public class LoopPracticeAnother {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		for(int i = 1; i < num; i++) {
			System.out.println(i+" ");
		}
	}
	
	public void practice2() {
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
				continue;
			}
			for(int i = 1; i < num; i++) {
				System.out.println(i+" ");
			}
			break;
		}
	}
	
	public void practice3() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		for(int i = num; i > 0; i--) {
			System.out.println(i+" ");
		}
	}
	
	public void practice4() {
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
				continue;
			}
			for(int i = num; i > 0; i--) {
				System.out.println(i+" ");
			}
			break;
		}
	}
	
	public void practice5() {
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i<=num;i++) {
			sum += i;
			System.out.print(i+(i == num ? " = " : " + "));
		}
		System.out.print(sum);
	}
	
	public void practice6() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
			return;
		}
		
		int min = num1 > num2 ? num2 : num1;
		int max = num1 > num2 ? num1 : num2;
		
		for(int i = min; i<max;i++) {
			System.out.print(i+" ");
		}
	}
	
	public void practice7() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
			practice7();
			return;
		}
		
		int min = num1 > num2 ? num2 : num1;
		int max = num1 > num2 ? num1 : num2;
		
		for(int i = min; i<max;i++) {
			System.out.print(i+" ");
		}
	}
	
	public void practice8() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.printf("===== %d단 =====", num);
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, i * num);
		}
	}
	
	public void practice9() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num > 9) {
			System.out.println("9이하의 숫자를 입력해주세요.");
			return;
		}
		
		for(; num <= 9; num++) {
			System.out.printf("===== %d단 =====", num);
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", num, i, num * i);
			}
		}
		
	}
	
	public void practice10() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num > 9) {
			System.out.println("9이하의 숫자를 입력해주세요.");
			practice10();
			return;
		}
		
		for(; num <= 9; num++) {
			System.out.printf("===== %d단 =====\n", num);
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", num, i, num * i);
			}
		}
		
	}
	
	public void practice11() {
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		System.out.print("공차 : ");
		int gong = sc.nextInt();
	
		for(int i = 0; i < 10; i++) {
			System.out.print(num + gong * i);
		}
		
		int count = 0;
		for(int i = num; count < 10; num+=gong) {
			System.out.print(i+" ");
			count++;
		}
	}
	
	public void practice12() {
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String str = sc.nextLine();
	
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			char ch = str.charAt(0);
			
			if(ch == '/' || ch == '%' || ch == '*' || ch == '+' || ch == '-' ) {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
			}
	
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			sc.nextLine();
			
			if(ch == '/' && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
				continue;
			}
			
			switch(ch) {
			case '+' :
				System.out.printf("%d %c %d = %d", num1, ch, num2, num1+num2);
				break;
			case '-' :
				System.out.printf("%d %c %d = %d", num1, ch, num2, num1-num2);
				break;
			case '*' :
				System.out.printf("%d %c %d = %d", num1, ch, num2, num1*num2);
				break;
			case '/' :
				System.out.printf("%d %c %d = %d", num1, ch, num2, num1/num2);
				break;
			case '%' :
				System.out.printf("%d %c %d = %d", num1, ch, num2, num1%num2);
				break;
			}
			
		}
	}

	public void practice13() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int j = 0; j < num; j++) {
			for(int i = 0; i < 1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice14() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int j = num; j > 0; j--) {
			for(int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
