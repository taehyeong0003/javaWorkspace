package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int [] arr = new int [10];
		
		for(int i = 1; i <= arr.length; i++) {
			arr[i-1] = i;
		} System.out.println(Arrays.toString(arr));
	}
	
	public void practice2() {
		int [] arr = new int [10];
		
		for(int i = arr.length; i > 0; i--) {
			arr[i-1] = 11-i;
		} System.out.println(Arrays.toString(arr));
	}
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int [] arr = new int [num];
		
		for(int i = 1; i <= arr.length; i++) {
			arr[i-1] = i;
		} System.out.println(Arrays.toString(arr));
	}
	
	public void practice4() {
		String str [] =  {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(str[1]);
	}
	
	public void practice5() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.print(str+"에 "+ch+"가 존재하는 위치(인덱스) : ");
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				System.out.print(i);
				count++;
			}
		}
		System.out.print("\n"+ch+" 개수 : "+count);
	}
	
	public void practice6() {
		char[] arr = {'월', '화', '수', '목', '금', '토', '일'};
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num < 0 || num > 6) {
			System.out.println("잘못 입력하셨습니다.");
		} else System.out.println(arr[num]+"요일");
	}
	
	public void practice7() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int [] arr = new int [num];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			int value = sc.nextInt();
			arr[i] = value;
		}
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			sum += arr[i];
		} System.out.print("\n총 합 : "+sum);
	}
	
	public void practice8() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		if(num % 2 == 0 || num < 3) {
			System.out.println("다시 입력하세요.");
			practice8();
			return;
		}
		int index = num /2;
		int [] arr = new int [num];
		int value = 0;
		
		for(int i = 0; i <= index; i++) {
			arr[i] = ++value;
			System.out.print(arr[i]+", ");
		}
		
//		for(int i = 0; i < index; i++) {
//			arr[index + i] = index - i;
//			System.out.print(arr[index + i]+( (arr[index + i] == 1) ? "" : ", ") );
//		} 
		
		for(int i = index+1; i<num; i++) {
			arr[i] = --value;
			System.out.print(arr[i]+( (i == num-1) ? "" : ", ") );
		}
	}
	
	public void practice9() {
		String menu [] =  {"후라이드", "양념", "마늘간장", "치즈", "고추"};
		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.nextLine();
		
		for(int i =0;i<str.length();i++) {
			if(str.equals(menu[i])) {
				System.out.println(str+" 치킨 배달 가능");
				return;
			}
		}
	}
	
	public void practice10() {
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		char[] copy = arr.clone();
		
		for(int i = 8; i<=13; i++) {
			copy[i] = '*';
		}
		System.out.println(Arrays.toString(copy));	
	}
	
	public void practice11() {
		int arr [] = new int [10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random()*10);
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice12() {
		int arr [] = new int [10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
			System.out.print(arr[i]+" ");
		}
		int max = arr[0];
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("\n최대값 : "+max+"\n최소값 : "+min);
	}
	
	public void practice13() {
		int arr [] = new int [10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random()*10 +1);
			// 5 0 0 0 0 0 0 0 0 0 1회 반복
			// 5 x 0 0 0 0 0 0 0 0 2회 반복시에는 0번 인덱스의중복인지 검사
			// 5 6 x 0 0 0 0 0 0 0 3회 반복시에는 0,1번 인덱스의중복인지 검사
			// 5 6 7 x 0 0 0 0 0 0 4회 반복시에는 0,1,2번 인덱스의중복인지 검사
			//
			for(int j = 0;j<i;j++) {
				if(arr[j] == arr[i]) {
					// 중복 랜덤값 존재시
					i--; 	// i값 감소
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void practice14() {
		int arr [] = new int [6];
		
		for(int i = 0; i < 6; i++) { 			//중복없는 난수 발생
			arr[i] = (int)(Math.random()*45 +1);
			for(int j = 0;j<i;j++) {
				if(arr[j] == arr[i]) {
					i--;
				}
			}
		}
		
		//중첩 반복문
		//버블 정렬 -> 가까운 두 값을 비교하여 가장 큰 값을 마지막으로 옮기는 정렬 방식
		//외부 반복문 반복 횟수 -> 정렬할 배열 크기 -1
		//내부 반복문 반복 구조 -> 아래코드 참고
		
		for(int i = 0; i < arr.length - 1; i++) {			
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr [j];		// 비교적 큰 값을 temp에 초기화
					arr [j] = arr [j+1];	// 비교적 작은 값을 앞의 인덱스에	
					arr [j+1] = temp;		// temp에 저장된 값을 뒤 인덱스에
				}
			}
		} System.out.println(Arrays.toString(arr)); 	// 출력
	}
	
	public void practice15() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char [] arr = new char[str.length()];
		
		char [] origin = str.toCharArray();
		
		System.out.print("문자열에 있는 문자 : ");
		int index = 0;
		for(int i = 0; i < origin.length; i++) {
			char ch = origin[i];
			boolean result = false;
			for(int j = 0; j < index; j++) {
				if(arr[j] == ch) {
					// arr에 이미 추가된 데이터
					result = true;
					break;
				}
			} 
			if(!result) {
				arr[index++] = ch; 	// arr 배열에 중복되지 않은 데이터를 순서대로 복사
			}
		}
		char [] arr2 = new char [index]; 			// 중복되지 않은 데이터 개수 만큼의 크기를 가진 배열
		System.arraycopy(arr, 0, arr2, 0, index);	// arr에 있던 값을 arr2에 복사
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+(i!=index-1 ? ", " : ""));
		}
		
		System.out.println("\n문자 개수 : "+index);
	}
	
	public void practice16() {
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		String[] str = new String[size];
		for(int i=0;i<size;i++) {
			System.out.printf("%d번째 문자열 : ", i + 1);
			str[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().toLowerCase().charAt(0); 	// LowerCase 소문자 변환
			
			if(ch == 'n') { 	// 종료(루프 탈출)
				System.out.println(Arrays.toString(str));
				return;
			}
		
			System.out.println("더 입력하고 싶은 개수 : ");
			int moreSize = sc.nextInt();
			sc.nextLine();
		
			String[] copy = new String[str.length + moreSize];
			System.arraycopy(str, 0, copy, 0, str.length); 	//깊은 복사 완료
			
			for(int i=str.length;i<copy.length;i++) {
				System.out.printf("%d 번째 문자열 : ", i+1);
				copy[i] = sc.nextLine();
			}				// 얕은 복사가 없으면 원본 배열이던 str + 방금 추가한 것만 복사된다
			str = copy; 	// 얕은 복사를 통해 원본은 사용하지 않고 copy 배열로 대체한다
		}
	}
	
}
	
	
	
	
	
	

	
	
	
	
	
	
	

