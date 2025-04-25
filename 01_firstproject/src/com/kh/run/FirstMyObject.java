package com.kh.run;
//package + class명 == 풀 클래스명

import java.util.Date; // 날짜를 표시해주는 클래스

// 자바는 실행ㅎ기 위해 반드시 main 매서드가 존재해야 한다.
public class FirstMyObject {

	public static void main(String[] args) {
		System.out.println("cntl+F11로 런");
		
		//외부 클래스를 이용하여 현재 날짜를 출력
		System.out.println( new Date() );
		
	}
	
}
//저장은 cntl + s

// ex_firstproject라는 프로젝트 생성 후
// com.ex.run패키지에 Test클래스를 만둘고, 자신의 이름을 console창에 출력하는 프로그램