package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public void method() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번쨰 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번쨰 정수 : ");
		int num2 = sc.nextInt();
		int num3 = num1 + num2;
		int num4 = num1 - num2;
		int num5 = num1 * num2;
		int num6 = num1 / num2;
		System.out.printf("더하기 결과 : %d\n빼기 결과 : %d\n곱하기 결과 : %d\n나누기 결과 : %d\n", num3, num4, num5, num6);
		
	}
}
