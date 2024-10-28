package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArryExample1 {

	/* 배열(Array)
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것 (자료구조)
	 * 
	 * - 묶여진 변수들은 하나의 이름(배열명)으로 불려지고
	 * 	 각 변수들은 index를 이용해서 구분하게 된다.
	 * 
	 * - index의 번호는 0부터 시작하는 정수
	 * */
	
	public void ex1() {
		// 변수 vs 배열
		
		// 1.1 변수 선언
		int num;
		// Stack 영역에 int 자료형을 저장할수 있는 공간 4byte를 생성(할당)하고
		// 그 공간에 num이라는 이름을 부여
		
		// 1.2 변수 선언
		num = 3;
		//생성된 num이라는 변수 공간에 10을 대입
		
		// 1-3 변수 사용
		System.out.printf("num에 저장된 값 : %d", num);
		// num이 작성된 자리에 num에 저장된 값을 읽어와서 출력
		
		System.out.println("\n-------------------------------------------------");
		
		// 2-1 배열 선언
		int[] arr;
		// Stack 영역에 int[] (int 배열) 자료형 공간을 8byte 할당하고
		// 그 공간에 arr 이라는 이름을 부여
		// ** 해당 변수는 참조형으로 주소값만을 저장할 수 있음
		
		// 2-2 배열 할당
		arr = new int[3];
		
		// new : "new 연산자"라고 하며
		// 		Heap 메모리 영역에 새로운 공간(배열, 객체)을 할당
		
		// int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열
		
		// new int[3] : heap 영역에 int 3칸 짜리 int[]를 생성(할당)
		//				** 생성된 int[]에는 시작 주소가 지정된다!! **
		
		// 	 arr 	= new int[3];
		// (int[])	  (int[]) -> 같은 자료형이기 때문에 연산 가능
		
		// heap 영역에 생성된 int[]의 주소를
		// stack 영역에 생성된 arr 변수에 대입
		// -> arr 변수가 int[]을 참조하게 됨!
		// 	 (그래서 arr을 참조형이라고 함)
		
		
		// 2-3 배열 요소 값 대입
		// arr은 int[] 참조형 변수지만
		// arr[0]은 int 자료형 변수이기 때문에 정수 값 대입 가능
		arr[0] = 10; // cannot convert from int to int[] -> a = 10;
		arr[1] = 3;
		arr[2] = 20;
		
		// 2-4 배열 요소 값 읽어오기
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
	
	public void ex2() {
		// 배열 선언 및 할당
		int[] arr = new int[4];
		
		// 1) stack 영역에 int[] 자료형 참조변수 arr 선언
		// 2) heap 영역에 int 자료형 4개를 묶음으로 다루는 int[] 할당
		// 3) 생성된 int[]의 시작 주소를 arr에 대입하여 참조하는 형태를 만든다.
		
		// 배열 길이(== 몇 칸인가) : 배열.length
		System.out.println("배열의 길이 : " + arr.length);
		
		arr[0] = 100;
		arr[1] = 500;
		arr[2] = 1000;
		arr[3] = 800;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
//		int n = 0;
//		
//		for (int x = 0; x < input; x++) {
//			n++;
//			arr[x] = n;
//		}
		
		// 배열과 for문
		// i == index
		for (int i= 0; i < arr.length; i++) {
			// 0이상 arr 배열 길이 미만의 정수
			System.out.printf("arr[%d]에 저장된 값 : %d\n", i, arr[i]);
		}
		
		// (참고)
		// 비어있다 : stack 영역에 선언된 변수에 값이 대입되지 않음

		// null :  참조형 변수가 선언 되었으나 아무곳도 참조하지 않음 (빈칸 아님!)

		// 0 : int 자료형 0

		// "" :  String 자료형이지만 내용 없음(빈 문자열)
	}
	
	public void ex2_1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("갯수 입력 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for (int i=0; i < input; i++) {
			System.out.printf("\n%d칸에 입력하고 싶은 숫자 : ", i+1);
			int num = sc.nextInt();
			arr[i] = num;
		}
		for (int i=0; i < input; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void ex3() {
		// 5명의 키(cm)를 입력 받고 평균 구하기
		// 1번 키 입력 : 170.5
		// 2번 키 입력 : 165.7
		// 3번 키 입력 : 184.3
		// 4번 키 입력 : 190.2
		// 5번 키 입력 : 174.4

		// 입력 받은 키 : 170.5  165.7  184.3  190.2  174.4
		// 평균 : 177.02cm
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 명 :");
		int pn = sc.nextInt(); // 사람 몇 명
		
		double[] arr = new double[pn]; // double 형 변수 배열 생성
		
		double sum = 0;
		
		for (int i = 0; i < pn; i++) { // 사람 수 만큼 반복
			System.out.printf("%d번 키 입력 :", i+1);
			arr[i] = sc.nextDouble(); // 입력 받기
			// 각 인덱스에 입력 받은 값을 대입 (초기화)
			sum += arr[i]; // sum 변수에 arr[0~pn] 더한 값 저장
		}
		System.out.print("입력 받은 키 : ");
		for (int i = 0; i < pn; i++) {
			System.out.print(arr[i] + " "); // arr[0~pn] 하나씩 출력
		}
		System.out.printf("\n평균 : %.2f cm", sum/arr.length); // 평균 출력 arr.length = pn
	}
	
	public void ex4() {
		// 배열 선언과 동시에 초기화
		
		// char[] arr이 참조하는 배열 요소에 A,B,C,D,E 대입하기
		char[] arr = new char[5];
		
		for (int i = 0; i <arr.length; i++) {
			arr[i] = (char)('A' + i);
			// A == 65
			// B == 66
			// C == 67
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// ** Arrays 클래스
		// -> Java에서 제공하는 배열과 관련된 기능을 모아둔 클래스
		int[] arr2 = new int[4];
		System.out.println(arr2); // [I@626b2d4a (int 배열의 주소)
		System.out.println(arr); // 모든 요소 출력
		System.out.println(arr + " ");
		
		// Arrays.toString(배열명) : 모든 요소 값을 출력
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		
		// 배열 선언과 동시에 할당 및 초기화
		char[] arr3 = {'A','B','C','D','E'};
		// char[] 참조 변수 arr3를 선언하고
		// heap 영역에 char 5칸짜리 char[]을 생성하고
		// 각각 'A', 'B', 'C', 'D', 'E'로 초기화 후 주소를 arr3에 대입
		
		// {} (중괄호)는 배열의 리터럴 표기법
		System.out.println(Arrays.toString(arr3));
	}
	
	public void ex5() {
		// 점심 메뉴 뽑기 프로그램
		String[] menu = {"떡볶이", "제육볶음", "순대", "감자튀김", "햄버거"};
		
		int ran = (int)(Math.random() * menu.length); // 난수 생성
		System.out.println("오늘의 점심 메뉴 : " + menu[ran]); 
		// menu 배열의 난수번째 칸 요소 출력 
	}
	
	public void ex6() { // 해결 못함 오류
		// 디저트 주문 프로그램
		
		// 배열 2개 생성 후
		// 같은 인덱스 번호에 메뉴명, 가격을 작성
		
		String menu[] = {"치즈케이크", "브라우니", "티라미수", "식혜", "크로칸슈"};
		
		int price[] = {6400, 4800, 5500, 3000, 5900};
		
		// -----메뉴-------
		// 1) 치즈케이크 (6400원)
		// 2) 브라우니 (4800원)
		// ...
		// 9) 주문완료
		
		// 주문한 메뉴 : 치즈케이크 브라우니
		// 메뉴 : 13200원
		
		Scanner sc = new  Scanner(System.in);
		
		String order = ""; // 주문한 메뉴를 저장할 변수
		int sum = 0; // 주문한 메뉴의 금액을 저장할 변수
		
		while (true) {
			System.out.println("-----메뉴-----");

			for (int i=0; i<menu.length; i++) {
				System.out.printf("%d) %s (%d원)\n", i+1, menu[i], price[i]);
			}
			
			System.out.println("9) 주문완료");
			
			System.out.print("메뉴 선택 >> ");
			int input = sc.nextInt();
			
			// 만약 9번을 입력한 경우 반복문 멈추기
			if (input == 9) {
				break;
				
			// 메뉴 인덱스 범위를 초과할 때 "메뉴에 있는 번호만 눌러주세요."
			} else if (input < 0 || input >= menu.length) {
				System.out.println("메뉴에 있는 번호만 눌러주세요.");
			// 정상 입력 -> 누적
			} else {
				order += menu[input] + " ";
				sum += price[input];
			}
		}
		System.out.printf("주문한 메뉴 : %s\n", order);
		System.out.println("합계 : " + sum + "원");
		
		
	}
	
	public void ex7() {
		/* 생성할 배열의 길이 : 3        <- 입력
		 * 
		 * 0번 인덱스 요소 : 40         <- 입력
		 * 1번 인덱스 요소 : 60         <- 입력
		 * 2번 인덱스 요소 : 80         <- 입력
		 * 
		 * 저장된 값을 확인하려는 인덱스(-1 종료) : 0          <- 입력
		 * 0번 인덱스 : 40
		 * 
		 * 저장된 값을 확인하려는 인덱스(-1 종료) : 2          <- 입력
		 * 2번 인덱스 : 80
		 * 
		 * 저장된 값을 확인하려는 인덱스(-1 종료) : 99          <- 입력
		 * 존재하지 않는 인덱스 번호 입니다
		 * 
		 * 저장된 값을 확인하려는 인덱스(-1 종료) : -1          <- 입력
		 * 프로그램 종료
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생성할 배열의 길이 :");
		int input = sc.nextInt();
		
		int arr[] = new int[input];
		
		for (int i= 0; i < input; i++) {
			System.out.printf("%d번 인덱스 요소 : ", i);
			int y = sc.nextInt();
			arr[i] += y;
		}

		while (true) {
			System.out.print("저장된 값을 확인하려는 인덱스(-1 종료) : ");
			int x = sc.nextInt();

			if (x == -1) {
				System.out.println("프로그램 종료");
				break;
			} 
			if (x < 0 || x >= arr.length) {
				System.out.println("존재하지 않는 인덱스 번호 입니다.");
				continue; // 다음 반복으로 이동 (반복문 처음으로 이동)
			} 
			// 정상 인덱스 입력
			System.out.printf("%d번 인덱스 : %d\n", x, arr[x]);
			
			// 요즘 개발 트렌드는 if문만 사용한다!
			// 왜? 유지보수가 편해서
			
		}


	}
	
	public void ex8() {
		// 배열을 이용한 검색
		
		// 입력 받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇번 인덱스에 존재하는지 출력
		
		int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

		Scanner sc = new Scanner(System.in);

		boolean flag = false; // 검사 전에는 없다고 가정


		System.out.print("정수 입력 :");
		int input = sc.nextInt();


		// arr 배열 요소 순차 접근(반복 접근)
		for (int i=0; i < arr.length; i++) {

			// arr[i]에 저장된 값과 input이 같을 경우
			if (arr[i] == input) {
				System.out.printf("%d 번째 인덱스에 존재", i);
				flag = true; // 일치하는 값이 있으므로 true 변경
				break;
			}
			// flag 상태를 검사해서 존재여부 확인
		}
		if (!flag) { // flag == false 
			System.out.println("존재하지 않습니다.");
		}
	}
	
	public void ex9() {
		// 입력 받은 값과 일치하는 값이 있으면 인덱스 번호 출력
		// 없으면 존재하지 않습니다. 출력
		
		String[] coffee = {"딸기라떼", "달고나라떼", "녹차라떼", "흑임자라떼", "밀크티",
						"바닐라라떼", "아이스 아메리카노"};
		
		Scanner sc = new Scanner(System.in);
		

		System.out.print("음료 입력 : ");
		String str = sc.nextLine();
		
		boolean flag = true;
		
		for (int i= 0; i < coffee.length; i++) {
			if (str.equals(coffee[i])) {
				System.out.printf("%d 번 인덱스", i);
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("존재하지 않습니다.");
		}
		
	}
	
	public void ex10() {
		// 1. 문자열을 입력 받아 한 글자씩 잘라내어 char 배열에 순서대로 저장

		// 2. 문자 하나를 입력 받아 일치하는 문자가 char 배열에 몇개 존재하는지 확인

		// 3. 단, 일치하는 문자가 없을 경우 "존재하지 않습니다." 출력
		
		// 문자열 입력 : apple
		// 검색할 문자 입력 : p
		
		// 2개 존재
		// 존재하지 않습니다.
		
		// [사용 해야되는 기술, 기능]
		// 1. 배열 검색
		// 2. String.length() : 문자열의 길이
		// 3. String.charAt(index) : 문자열에서 특정 index에 위치한 문자 하나를 얻어옴
		//	  ex) "Hello".charAt(1) -> 'e'
		//		   01234 (인덱스 번호)
		// 4. count (숫자 세기)

		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어 입력 : ");
		String input = sc.nextLine();

		// 1. 문자열을 입력 받아 한 글자씩 잘라내어 char 배열에 순서대로 저장
		char[] ch = new char[input.length()]; // 문자형 선언, 입력받은 문자열의 크기만큼 배열 생성
		
		for (int i= 0; i< input.length(); i++) { // 0부터 문자열의 길이 만큼 반복
			ch[i] += input.charAt(i); 
			// ch[i]에 입력받은 문자열열 중에서 i번째 문자 대입
		}
		// Arrays.toString(배열명) : 모든 요소 값을 출력
		System.out.println(Arrays.toString(ch)); // 중간확인
		// 2. 문자 하나를 입력 받아 일치하는 문자가 char 배열에 몇개 존재하는지 확인
		System.out.print("검색할 문자 입력 : ");
		char s = sc.nextLine().charAt(0); 
				// String.charAt(0) : 문자열 중 제일 앞 문자 얻어오기
		int count = 0; // 같은 글자의 개수를 세기 위한 변수
		
		for (int i=0; i<ch.length; i++) {
			if (ch[i] == s) {
				// ch[i] 값과 검색할 문자 s가 같은 경우
				// -> 카운트
				count++;
			}
		}
		// 결과 출력
		if (count > 0) {
			System.out.println(count + "개 있습니다.");
		} else {
		// 3. 단, 일치하는 문자가 없을 경우 "존재하지 않습니다." 출력
			System.out.println("존재하지 않습니다.");
		}
	}
	
}










