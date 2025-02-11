package edu.kh.array.pracrice;

import java.util.Arrays;

import java.util.Scanner;

public class ArrayPractice {

	public void ex1() {
		
		int[] arr = new int[9]; // 변수명 i 라는 참조변수를 정수형 배열 9칸짜리 생성
		
		int sum = 0;
		
		for (int i= 0; i < 9; i++ ) {
			arr[i] += i+1;
			System.out.print(arr[i] + " ");
			if (i % 2 == 0) { // 인덱스의 값 : 0 2 4 6 8
				sum += arr[i];
			}
		}
		System.out.printf("\n짝수 번째 인덱스 합 : %d", sum);
	}

	public void ex2() {
		
		int arr[] = new int[9];
		
		int sum = 0;
		
		for (int i= 8; i >= 0; i--) { // 8~0
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			if (i % 2 == 1) { // 인덱스의 값 : 7 5 3 1
				sum += arr[i];
			}
		}
		System.out.printf("\n홀수 번째 인덱스 합 : %d", sum);
		
	}
	
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for (int i= 0; i < input; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
	}

	public void ex4() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		boolean flag = false;
		
		for (int i = 0; i < 5; i++) {
			
			System.out.printf("입력 %d : ", i);
			int input = sc.nextInt();
			arr[i] = input;
		}
		System.out.print("검색할 값 : ");
		int x = sc.nextInt();
		
		for (int i =0; i < 5; i++) {
			if (x == arr[i]) {
				System.out.printf("인덱스 : %d", i);
				flag = true;
				break;
			} 
		}
		if (!flag) { // flag == false 
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}

	public void ex5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();

		// 입력받은 문자열 크기만큼 문자형 변수 배열 칸 생성
		char[] ch = new char[input.length()]; 
		
		// 하나씩 값 대입
		for (int i= 0; i < input.length(); i++) {
			ch[i] += input.charAt(i); 
		}
		
		System.out.print("문자 : ");
		char s = sc.nextLine().charAt(0); // 문자열 중 제일 앞 문자 얻어오기
		
		System.out.printf("%s 에 %s가 존재하는 위치(인덱스) : ", input, s);
		int num = 0;
		for (int i= 0; i < ch.length; i++) {
			if (s == ch[i]) {
				System.out.print(i + " ");
				num++;
			}
		}
		System.out.printf("\n%s 개수 : %d", s, num);
	}

	public void ex6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		int sum = 0;
		String value = "";
		
		for (int i =0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt(); // 입력받고 선언을 한번에 하기 ( int num = sc.nextInt();
								   //						arr[i] = num;)
			sum += arr[i];
			value += arr[i] + " ";
		}
		System.out.println(Arrays.toString(arr)); // 요소 출력
		System.out.println(value); // 값만 출력
		System.out.printf("\n총 합 : %d", sum);
		
	}
	
	public void ex7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		char[] c = new char[input.length()]; // 입력한 값 크기만큼 문자형 배열 칸 생성 
		
		for (int i= 0; i < c.length; i++) {
			// 7번 인덕세 이하 (생년월일, -, 성별)
			c[i] = input.charAt(i); // 문자열 중 i번째 문자 대입
			if (i > 7 ) {
				c[i] = '*';
			}
			System.out.print(c[i]);
		}
	}
}





