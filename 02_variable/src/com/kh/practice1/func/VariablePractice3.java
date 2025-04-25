package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void method() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double length = sc.nextDouble();
		System.out.print("세로 : ");
		double width = sc.nextDouble();
		
		double area = length * width;
		double perimeter = 2 * (length + width);
		
		System.out.printf("면적 : %.2f\n둘레 : %.2f", area, perimeter);
		
	}
}
