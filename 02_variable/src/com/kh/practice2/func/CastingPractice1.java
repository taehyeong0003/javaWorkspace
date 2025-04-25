package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	
	public void method() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char character = sc.nextLine().charAt(0);
		int num = character;
		
		System.out.println(character+" unicode : "+num);
	}

}
