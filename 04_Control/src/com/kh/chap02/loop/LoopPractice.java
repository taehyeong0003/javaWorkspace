package com.kh.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if(num >= 1) {
			int i = 1;
			while (i <= num) {
				System.out.print(i++ +" ");
			}
		} else System.out.println("1이상의 숫자를 입력해주세요.");
	}
	
	public void practice2() {
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if(num < 1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
			 else {
				int i = 1;
				while (i <= num) {
				System.out.print(i++ +" ");
				} break;
			}
		}
	}
	
	public void practice3() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if(num >= 1) {
			while (1 <= num) {
				System.out.print(num-- +" ");
			}
		} else System.out.println("1이상의 숫자를 입력해주세요.");
	}
	
	public void practice4() {
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if(num < 1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
			 else {
				int i = 1;
				while (i <= num) {
				System.out.print(num-- +" ");
				} break;
			}
		}
	}
	
	public void practice5() {
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i < num; i++) {
			sum += i;
			System.out.print(i+" + ");
		}
		System.out.println(num+" = "+sum);
	}
	
	public void practice6() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if (num1 < 1 || num2 < 1) 
			System.out.println("1이상의 숫자를 입력해주세요.");
		else {
			if(num1 > num2) {
				for(int i = num2; i <= num1; i++)
					System.out.print(i+" ");
			} 
			else {
				for(int i = num1; i <= num2; i++)
					System.out.print(i+" ");
			}
		}
	}
	
	public void practice7() {
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			if(num1 < 1 || num2 < 1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
			else {
				if(num1 > num2) {
					for(int i = num2; i <= num1; i++)
						System.out.print(i+" ");
				} 
				else {
					for(int i = num1; i <= num2; i++)
						System.out.print(i+" ");
				} break;
			}
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
		
		if(num > 9)
			System.out.println("9이하의 숫자를 입력해주세요.");
		else {
			for(int j = num; j <= 9; j++) {
				System.out.printf("===== %d단 =====\n", num);
				for(int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d = %d\n", j, i, j * i);
				}
			}
		}
	}
	
	public void practice10() {
		while(true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
		
			if(num > 9)
				System.out.println("9이하의 숫자를 입력해주세요.");
			else {
				for(int j = num; j <= 9; j++) {
					System.out.printf("===== %d단 =====\n", num);
					for(int i = 1; i <= 9; i++) {
						System.out.printf("%d * %d = %d", j, i, j * i);
						System.out.println();
					}
				} break;
			}
		}
	}
	
	public void practice11() {
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		System.out.print("공차 : ");
		int d = sc.nextInt();
		
		int i = 1;
		while(i <= 10) {
			System.out.print(num+" ");
			num += d;
			i++;
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
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			if("/".equals(str) && num2 == 0)
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			else if("+".equals(str)) 
				System.out.println(num1+" + "+num2+" = "+(num1+num2));
			else if("-".equals(str)) 
				System.out.println(num1+" - "+num2+" = "+(num1-num2));
			else if("*".equals(str)) 
				System.out.println(num1+" * "+num2+" = "+(num1*num2));
			else if("/".equals(str)) 
				System.out.println(num1+" / "+num2+" = "+(num1/num2));
			else if("%".equals(str)) 
				System.out.println(num1+" % "+num2+" = "+(num1%num2));
			else 
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			sc.nextLine();
			System.out.println();
		}
	}
	
	public void practice13() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice14() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++) {
			for(int j = num; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}