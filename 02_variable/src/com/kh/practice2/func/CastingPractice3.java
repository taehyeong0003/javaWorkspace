package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice3 {
	
	public void method() {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println( iNum1 / iNum2 );
		System.out.println( (int)dNum );
		
		System.out.println( iNum2 * dNum );
		System.out.println( (float)iNum1 );
		
		System.out.println( (float)iNum1 / (float)iNum2 );	//자동형변환 사용 가능하나 동일 자료형으로 해주는게 좋다
		System.out.println( dNum );
		
		System.out.println( (int)fNum );
		System.out.println( iNum1 / (int)fNum );
		
		System.out.println( (iNum1 / fNum) );
		System.out.println( (double)iNum1 / (double)fNum );
		
		System.out.println( ch );
		System.out.println( (int)ch );
		System.out.println( (int)ch + iNum1 );
		System.out.println( (char)(ch + iNum1) );
		
	}

}
