package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
		
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int i = sc.nextInt();
		
		if (i >= 1) {
			for (int x= 1; x<= i; x++) {
				
				System.out.printf("%d ", x);
			}

		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int i = sc.nextInt();

		if (i >= 1) {
			for (; i >=1; i--) {

				System.out.printf("%d ", i);
			}

		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
		
		
	}

	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int i = sc.nextInt();
		
		int sum = 0;
		
		for (int x= 1; x <= i; x++) {
			sum += x;
			if (x < i) {
				System.out.printf("%d + ", x);
			} else {
				
				System.out.printf("%d = %d", x, sum);
			}
		}
		
	}

	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int x = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int y = sc.nextInt();
		
//		// 혜선썜 VER2 (큰 값을 다른 변수 하나 생성해서 옮기고 x,y 값 바꾸기)
//		if(x > y) {
//			int temp = x; //
//			x = y;
//			y = temp;
//		}
//		for (int i = x; i <= y; i++) {
//			System.out.print(i + " ");
//		}
		
		// 내 VER = 혜선쌤 VER1 = 쉬운 방법
		if (x >= 1 && y >= 1 && x <= y) {
			for (int i = x; i<= y; i++) {
				System.out.printf("%d ",i);
			}
			
		} else if(x >= 1 && y >= 1 && x > y) {
			for (int i = y; i<= x; i++) {
				System.out.printf("%d ",i);
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
	}

	public void practice5() {
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.print("숫자 : ");
		int i = sc.nextInt();
		
		System.out.printf("====== %d단 =======\n", i);
		for (int x= 1; x <= 9; x++ ) {
			System.out.printf("%d * %d = %d\n", i, x, i*x);
		}
		System.out.println();
		
	}
	
	public void practice6() {
		
		Scanner sc = new  Scanner(System.in);

		System.out.print("숫자 : ");
		int i = sc.nextInt();

		if (i >=2 && i <=9) {
			for (int y= i; y <= 9; y++) {
				System.out.printf("====== %d단 =======\n", i);
				for (int x= 1; x <= 9; x++ ) {
					System.out.printf("%d * %d = %d\n", i, x, i*x);
					
				}
				System.out.println();
				i++;
				
				
			}
		} else {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}

	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int i = sc.nextInt();
		
		for (int y= 1; y<= 4; y++ ) {
			for (int x=1; x<= y; x++) {
				System.out.print('*');
				
			}
			System.out.println();
			
		}
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		char a = '*';
		int temp = input;
		
		for (int x= 1; x <= temp ; x++) { // 줄 반복
			
			for (int i= input; i >= 1; i--) { // 출력 반복
				System.out.print(a);
			}
			System.out.println(); // 줄바꿈
			input--;
		}
		
	}
	
	public void practice9() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		// 혜선쌤 VER1
		// 1) for문 하나 더 작성
		// * 1개 출력 전에 띄어쓰기 3번
		// * 2개 출력 전에 띄어쓰기 2번
		// * 3개 출력 전에 띄어쓰기 1번
		// * 4개 출력 전에 띄어쓰기 0번
//		for (int x=1; x <= input; x++) {
//			for (int i=1; i <= input-x; i++) {
//				System.out.print(' ');
//			}
//			for (int y=1; y <= x; y++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
		
		// ** 혜선썜 VER2 **
		// 2) for + if else
		for (int x=1; x <= input; x++) {
			for (int i =1; i <=input; i++) {
				if (i <= input - x) {
					System.out.print(' ');
				} else {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
//		// 내 VER
//		char a = '*';
//		int temp = input;
//		
//		for (int x= 1; x <= temp ; x++) { // 줄 반복
//
//			for (int i= input-1; i >= 1; i--) { // 출력 반복
//				System.out.printf("%s", ' ');
//			}
//			for (int i= 1; i <= x; i++) { // 출력 반복
//				System.out.print(a);
//			}
//			System.out.println(); // 줄바꿈
//			input--;
//		}
		
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		// 위쪽 삼각형
		for (int x=1; x <= input; x++) {
			for (int y =1; y <= x; y++) {
				System.out.print('*');
			}
			System.out.println();
		}
		// 아래쪽 삼각형
		for (int y=input-1; y >= 1; y--) {
			for (int i =1; i <= y; i++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt(); // 4 입력
		
		// 혜선썜 VER
		for (int x= 1; x<= input; x++) { // 입력 받은 input만큼 줄 생성
			// 공백 출력 for문
			for (int i=input-x; i >= 1; i--) {
				System.out.print(" ");
			}
			
			// * 출력 for문
			// 1 3 5 7 9
			for (int i =1; i <= 2*x-1; i++) {
				System.out.print('*');
			}
			System.out.println();
			
		}
	      //	      // 내 VER
//	      for (int x= 1; x<= input; x++) { // 줄 4개 생성
//	         for (int y= 1; y<= 2*input-1; y++) { // 2*input-1 만큼 반복
//	            if(y >= input-(x-1) && y <= input+(x-1)) { // 2*input-1 번 반복중 
//	               // input-(x-1)~input+(x-1)
//	               System.out.print('*');
//	            } else {
//	               System.out.print(' ');
//	            }
//	         }
//	         System.out.println();
//	      }
	      //      x        2x-1
	      // * 이 1번째 줄에서는 1개
	      // * 이 2번째 줄에서는 3개
	      // * 이 3번째 줄에서는 5개
	      // * 이 4번째 줄에서는 7개 필요
	      //--------------------------
	      // x=1,y=1...' '
	      // x=1,y=2...' '
	      // x=1,y=3...' '
	      // x=1,y=4...'*' 
	      // x=1,y=5...' '
	      // x=1,y=6...' '
	      // x=1,y=7...' '
	      
	      // x=2,y=1...' '
	      // x=2,y=2...' '
	      // x=2,y=3...'*'
	      // x=2,y=4...'*'
	      // x=2,y=5...'*'
	      // x=2,y=6...' '
	      // x=2,y=7...' ' 
	
	}

	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// row : 행(줄)
		// col : 열(칸)
		
		for (int x=1; x <= input; x++) { // 줄 생성
			// 테두리만 * 출력 for 문
			// row가 1 또는 input인 경우
			// col가 1 또는 input인 경우
			for (int y= 1; y <= input; y++) { // 한 줄에서 출력 횟수
				// 삼항연산자 이용하는 조건
				System.out.print((y == 1 || y == input || x == 1 || x == input)? "*" : " "); 
				// ^==
//				//if (y == 1 || y == input || x == 1 || x == input) { // * 출력 조건
//					System.out.print('*');
//				} else { // 빈칸 출력
//					System.out.print(' ');
//				}
			}
			System.out.println();
		}
	}
	
	public void practice13() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count = 0;		
		// 내 VER = 혜선쌤
		for (int x= 1; x<= input; x++) {
			if (x % 2 == 0 || x % 3 == 0) {
				System.out.printf("%d ", x);
				if (x % 2 == 0 && x % 3 == 0) {
				count++;
				}
			} 
		}
		System.out.printf("\ncount : %d", count);
	}
}
















