package com.kh.practice.chap1;

import java.util.Scanner;

public class ControlPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 종료\n메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();

		if (num == 7) {
			System.out.println("프로그램이 종료됩니다.");
		} else {
			String menu = "";
			switch (num) {
			case 1:
				menu = "입력";
				break;
			case 2:
				menu = "수정";
				break;
			case 3:
				menu = "조회";
				break;
			case 4:
				menu = "삭제";
				break;
			default:
				menu = "없는";
			}
			System.out.println(menu + " 메뉴입니다.");
		}
	}

	public void practice2() {
		System.out.println("숫자를 한 개 입력하세요.");
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else
			System.out.println("양수만 입력해주세요.");
	}

	public void practice3() {
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();

		int tot = (int) (kor + eng + math);
		double avr = tot / 3;
		boolean result = kor >= 40 && eng >= 40 && math >= 40 && avr >= 60;

		if (result == true) {
			System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n", kor, eng, math);
			System.out.printf("합계 : %d\n평균 : %.1f\n", tot, avr);
			System.out.println("축하합니다, 합격입니다!");
		} else
			System.out.println("불합격입니다.");
	}

	public void practice4() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int mon = sc.nextInt();

		String season = "";

		switch (mon) {
		case 1:
		case 2:
		case 12:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		default:
			season = "잘못 입력된 달";
			break;
		}
		System.out.println(mon + "월은 " + season + "입니다.");
	}

	public void practice5() {
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pw = sc.nextLine();

		if (id.equals("myid") && pw.equals("password"))
			System.out.println("로그인 성공");
		else if (id.equals("myid") && !(pw.equals("password")))
			System.out.println("비밀번호가 틀렸습니다");
		else if (!(id.equals("myid")) && pw.equals("password"))
			System.out.println("아이디가 틀렸습니다");
		else
			System.out.println("아이디와 비밀번호가 틀렸습니다");
	}

	public void practice6() {
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.nextLine();

		switch (grade) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "회원":
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default:
			System.out.println("관리자, 회원, 비회원 중에 입력바랍니다.");
			break;
		}
	}

	public void practice7() {
		System.out.print("키(m)를 입력해 주세요");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요");
		double weight = sc.nextDouble();
		double BMI1 = weight / (height * height);

		String BMI2 = "";

		if (BMI1 < 18.5)
			BMI2 = "저체중";
		else if (BMI1 < 23)
			BMI2 = "정상체중";
		else if (BMI1 < 25)
			BMI2 = "과체중";
		else if (BMI1 < 30)
			BMI2 = "비만";
		else
			BMI2 = "고도 비만";

		System.out.println("BMI 지수 : " + BMI1 + "\n" + BMI2);
	}

	public void practice8() {
		System.out.println("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("연산자를 입력(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);

		if (num1 > 0 && num2 > 0) {
			int result = 0;
			switch (ch) {
			case '+':
				result = num1 + num2;
				System.out.printf("%d", result);
				break;
			case '-':
				result = num1 - num2;
				System.out.printf("%d", result);
				break;
			case '*':
				result = num1 * num2;
				System.out.printf("%d", result);
				break;
			case '/':
				result = num1 / num2;
				System.out.printf("%f", (double)result);
				break;
			case '%':
				result = num1 % num2;
				System.out.printf("%d", result);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}
		} else {
			System.out.println("양수만 입력해주세요");
			return;
		}
	}

	public void practice9() {
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();
		System.out.print("과제 점수 : ");
		int rep = sc.nextInt();
		System.out.print("출석 회수 : ");
		int att = sc.nextInt();
		System.out.print("============== 결과 ================");

		double rmid = mid * 0.2;
		double rfin = fin * 0.3;
		double rrep = rep * 0.3;
		double ratt = att * 1.0;
		double tot = rmid + rfin + rrep + ratt;

		if (tot >= 70 && att >= 15) {
			System.out.println("중간 고사 점수(20) : " + rmid);
			System.out.println("기말 고사 점수(30) : " + rfin);
			System.out.println("과제     점수(30) : " + rrep);
			System.out.println("출석     점수(20) : " + ratt);
			System.out.println("총점 : " + tot);
			System.out.println("PASS");
		} else if (att >= 15                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ) {
			System.out.println("중간 고사 점수(20) : " + rmid);
			System.out.println("기말 고사 점수(30) : " + rfin);
			System.out.println("과제     점수(30) : " + rrep);
			System.out.println("출석     점수(20) : " + ratt);
			System.out.println("총점 : " + tot);
			System.out.println("Fail [점수 미달]");
		} else
			System.out.printf("Fail [출석 회수 부족(%d/20)]", att);
	}

	public void practice10() {
		System.out.print("실행할 기능을 선택하세요 : ");
		System.out.print("1. 메뉴 출력");
		System.out.print("2. 짝수/홀수");
		System.out.print("3. 합격/불합격");
		System.out.print("4. 계절");
		System.out.print("5. 로그인");
		System.out.print("6. 권한 확인");
		System.out.print("7. BMI");
		System.out.print("8. 계산기");
		System.out.print("9. P/F");
		int menu = sc.nextInt();
		
		System.out.println("선택 : "+menu);
		switch (menu) {
		case 1 : 
			practice1();
			break;
		case 2 : 
			practice2();
			break;
		case 3 : 
			practice3();
			break;
		case 4 : 
			practice4();
			break;
		case 5 : 
			practice5();
			break;
		case 6 : 
			practice6();
			break;
		case 7 : 
			practice7();
			break;
		case 8 : 
			practice8();
			break;
		case 9 : 
			practice9();
			break;
		default :
			System.out.print("1~9까지 정수로 입력하시오.");
			return;
		}
	}
	
	public void practice11() {
		System.out.print("비밀번호 입력(1000~9999) : ");
		int pw = sc.nextInt();
		
		int pw1 = pw / 1000;
		int pw2 = (pw / 100) % 10;
		int pw3 = (pw / 10) % 10;
		int pw4 = pw % 10;
		
		if(pw < 1000 || pw > 9999) 
			System.out.println("자리수 안맞음");
		else if(pw1 == pw2 || pw1 == pw3 || pw1 == pw4 || pw2 == pw3 || pw2 == pw4 || pw3 == pw4)
			System.out.println("실패");
		else System.out.println("성공");
		
	}
	
}
