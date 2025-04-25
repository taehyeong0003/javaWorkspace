package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	
	public void method() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double score_k = sc.nextDouble();
		System.out.print("영어 : ");
		double score_e = sc.nextDouble();
		System.out.print("수학 : ");
		double score_m = sc.nextDouble();
		
		int score_t = (int)(score_k + score_e + score_m);
		int score_a = score_t / 3;
		
		System.out.printf("총점 : %d\n평균 : %d", score_t, score_a);
	}

}
