package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		int num3 = num2 / num1;
		int num4 = num2 % num1;
		
		System.out.printf("1인당 사탕 개수 : %d\n남은 사탕 개수 : %d", num3, num4);
	}
	public void practice2() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년 : ");
		int num1 = sc.nextInt();
		
		System.out.print("반 : ");
		int num2 = sc.nextInt();
		
		System.out.print("번호 : ");
		int num3 = sc.nextInt();
		
		System.out.print("성별(M/F) : ");		
		char ch = sc.next().charAt(0);
		char gender = (ch == 'M' ? '남' : '여');
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double num4 = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다", num1, num2, num3, name, gender, num4);
	}
	public void practice3() {
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = age <= 13 ? "어린이" : (age <= 19 ? "청소년" : "성인" );
		
		System.out.print(result);
	}
	public void practice4() {
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int tot = (int)(kor + eng + math);
		double avr = tot / 3;
		
		boolean result = kor >= 40 && eng >= 40 && math >= 40 && avr >= 60;
		
		System.out.printf("합계 : %d\n평균 : %.1f\n", tot, avr);
		System.out.println(result ? "합격" : "불합격");
	}
	public void practice5() {
		System.out.print("주민번호 입력(- 포함) : ");
		String res = sc.nextLine();
		// 010203-2123456...
		// 0102032123456...
		
		char ch = res.charAt(7);	// '1' ==> 49
		String gender = ch == '1' || ch == '3' ? "남자" : "여자";
		
		System.out.println(gender);
	}
	public void practice6() {
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int input = sc.nextInt();
		boolean result = input <= num1 || input > num2;
		
		System.out.println(result);
	}
	public void practice7() {
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = num1 == num2 && num2 == num3;
		
		System.out.println(result);
	}
	public void practice8() {
		System.out.print("A사원의 연봉 : ");
		int numA1 = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int numB1 = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int numC1 = sc.nextInt();
		
		double numA2 = numA1 * 1.4;
		double numB2 = numB1;
		double numC2 = numC1 * 1.15;
		
		String resultA = numA2 >= 3000 ? "3000 이상" : "3000 미만";	
		String resultB = numB2 >= 3000 ? "3000 이상" : "3000 미만";	
		String resultC = numC2 >= 3000 ? "3000 이상" : "3000 미만";
		
		System.out.printf("A사원 연봉/연봉+a : %d/%f\n%s\n", numA1, numA2, resultA);
		System.out.printf("B사원 연봉/연봉+a : %d/%f\n%s\n", numB1, numB2, resultB);
		System.out.printf("C사원 연봉/연봉+a : %d/%f\n%s\n", numC1, numC2, resultC);
	}
}
