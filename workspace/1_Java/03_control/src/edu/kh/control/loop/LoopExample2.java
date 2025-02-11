package edu.kh.control.loop;

import java.util.Scanner;

public class LoopExample2 {

	public void ex1() {
		// 구구단 2단 출력하기

		for (int i = 1; i <= 9; i++) {
			System.out.printf("2 X %d = %d \n", i, 2*i);
		}
	}
	
	public void ex2() {
		// 입력 받은 단 출력하기

		// [실행 화면]
		// 단 입력 : 3

		// [구구단 3단]
		// 3 x 1 = 3
		// 3 x 2 = 6
		// ...
		// 3 x 9 = 27
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int n = sc.nextInt();
		
		System.out.println("");
		System.out.printf("[구구단] %d단 \n", n);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d \n", n, i, n*i);
		}

	}
	
	public void ex3() {
		// 입력 받은 단 출력하기
		// 단, 입력 받은 값이 2~9 사이 일때만 구구단 출력
		// 2~9사이가 아닐 경우 "잘못 입력 하셨습니다." 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("단 입력 : ");
		int n = sc.nextInt();

		if (n < 2 || n > 9) {
			System.out.println(" 잘못 입력 하셨습니다.");
		} else {
			System.out.println("");
			System.out.printf("[구구단] %d단 \n", n);
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d \n", n, i, n*i);
			}
		}

	}
	
	public void ex4() {
		// 예제 4 - 구구단 모두 출력하기 (이중 중첩문)
		for (int dan = 2; dan < 10; dan++) { // 2~9단까지 차례로 증가
				System.out.printf("-----------------\n[%d 단] \n\n", dan);
			
				// 안쪽 for문이 반복하면서 하나의 단을 출력
			for(int num = 1; num < 10; num++) { // 각 단에 곱해질 수 1~0까지
												// 차례대로 증가
				System.out.printf("%d X %d = %d \n", dan, num, dan*num);
			}
				
		}
		
	}
	
	public void ex5() {
		// 이중 for문 예제5 - 구구단 역순 출력
		for (int dan = 9; dan > 0; dan--) {
			
			for (int i = 1; i < 10; i++) {
				System.out.printf("%2d X %d = %2d", dan, i, dan*i); // %2d - 공백 두칸 확보후 오른쪽 정렬
			}
			System.out.println();
		}
	}
	
	public void ex6() {
		// for 예제 6 
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345
		for (int i1 = 1; i1 < 6; i1++) { // 5바퀴 반복하는 for문
			
			for (int i2 = 1; i2 < 6; i2++) { // 12345 한 줄 출력하는 for문
				System.out.print(i2);
			}
			System.out.println(); // 줄바꿈
		}
	}

	public void ex7() {
		// 중첩 for 예제 7
		//4321
		//4321
		//4321
		//4321
		for (int x= 1; x< 5; x++ ) {
			
			for (int i= 4; i> 0; i--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public void ex8() {
		
		// 구구단 출력하기
		// [조건]
		// - 1 입력 시 2~9 순서로 출력
		// - 2 입력 시 9~2 순서로 출력
		// - 1,2가 아니라면 "잘못 입력 하셨습니다." 출력

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1) 2-9 순서대로 / 2) 9-2역순으로 : ");
		int input = sc.nextInt();
		
		// if문 VER
		if (input == 1) {
			for (int dan= 2; dan< 10; dan++) {
				System.out.printf(" [%d단]\n", dan); // 제목
				for (int i1= 1; i1< 10; i1++) {
					System.out.printf("%2d X %2d = %2d\n", dan, i1, dan * i1);
				}
				System.out.println("-------------------------------");
			}
		} else {
			for (int dan= 9; dan> 0; dan--) {
				System.out.printf(" [%d단]\n", dan); // 제목
				for (int i1= 1; i1< 10; i1++) {
					System.out.printf("%2d X %2d = %2d\n", dan, i1, dan * i1);
				}
				System.out.println("-------------------------------");
			}
		}
//		// switch 문 VER
//		switch(input) {
//		case 1 : 
//			for (int dan= 2; dan< 10; dan++) {
//				System.out.printf(" [%d단]\n", dan); // 제목
//				for (int i1= 1; i1< 10; i1++) {
//					System.out.printf("%2d X %2d = %2d\n", dan, i1, dan * i1);
//				}
//				System.out.println("-------------------------------");
//			} break;
//		case 2 :
//			for (int dan= 9; dan> 0; dan--) {
//				System.out.printf(" [%d단]\n", dan); // 제목
//				for (int i1= 1; i1< 10; i1++) {
//					System.out.printf("%2d X %2d = %2d\n", dan, i1, dan * i1);
//				}
//				System.out.println("-------------------------------");
//			} break;
//		}
	}

	public void ex9() { // **
		// for 예제 9 - 2중 for문을 이용하여 다음 모양을 출력하시오.
		
		// 1
		// 12
		// 123
		// 1234
		
		for (int x= 1; x < 5; x++) { // 줄 반복
			for (int i= 1; i <= x; i++) { // 출력 반복
				System.out.print(i);
				
			}
			System.out.println(); // 줄바꿈
		}
		
		// x가 1일 때 i == 1
		// x가 2일 때 i == 1,2
		// x가 3일 때 i == 1,2,3
		// x가 4일 때 i == 1,2,3,4
	}

	public void ex10() {
		//4321
		//321
		//21
		//1
		String a;
		
		// 혜선쌤VER
		for (int x= 4; x >= 1; x--) { // 줄 반복
		
			for (int i= x; i >= 1; i--) { // 숫자 출력
				System.out.print(i);
			}
			System.out.println(); // 줄 바꿈
		}
		
//		// 내VER
//		for (int x= 1; x <= 4; x++) { // 줄 반복
//			for (int y= 1; y <= x-1; y++) { // 오른쪽 정렬하기 위해 공백(" ")반복
//				a =" "; System.out.print(a);
//			}
//			for (int i= 4; i >= x; i--) { // 숫자 출력
//				System.out.printf("%d",i-x+1);
//			}
//			System.out.println(); // 줄 바꿈
//		}
	}

	public void ex11() {
		// for 예제 11 - 다음과 같은 모양으로 출력하시오
		// 1 2 3 4
		// 5 6 7 8
		// 9 10 11 12
		int count = 1;
		
		for (int x= 1; x < 4; x++) {
			
			for (int i= 1; i< 5; i++) {
				System.out.printf("%3d",count++);
			}
			System.out.println();
		}

	}

	public void ex12() {
		// 중첩 for문 예제 12
		// (0,0) (0,1) (0,2)
		// (1,0) (1,1) (1,2)
		
		for (int x= 0; x< 2; x++) {
			for (int i= 0; i< 3; i++) {
				System.out.printf("(%d,%d) ", x, i);
			}
			System.out.println();
		}
	}
	
	public void ex13() {
		// 1부터 20까지 1씩 증가하면서
		// 3의 배수의 총 개수와 합계 출력
		
		// 3 6 9 12 15 18 : 6개
		// 3의 배수의 합계 : 63
		int sum = 0; // 3의 배수의 합계를 구하기 위한 변수
		int count = 0; // 3의 배수의 개수를 세기 위한 변수
		
		for (int x= 1; x<=20; x++) {
			if (x % 3 == 0) { // 3의 배수
				System.out.print(x + " ");
				count++; // if문이 동작할 때 마다 1씩 증가
				sum += x; // 3의 배수 누적
			}
		}
		System.out.printf(": %d개", count);
		System.out.printf("\n3의 배수의 합계 : %d", sum);
		
	}

	public void ex14() {
		// for문 예제 14 - 행/열의 크기를 입력 받아 출력하시오
		
		// 행 : 2
		// 열 : 3
		
		// 1 2 3
		// 4 5 6
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.print("행 : ");
		int h = sc.nextInt();
		
		System.out.print("열 : ");
		int y = sc.nextInt();
		
		int num = 0;
		
		// 내 VER = 혜선쌤 VER
//		for (int x = 1; x <=h; x++) {
//			for (int i= 1; i <= y; i++) {
//				++num;
//				System.out.printf("%d ", num);
//			}
//			System.out.println();
//		}

		// 혜선쌤 VER2
		// 초기식, 조건식, 증감식은 상황에 따라서
		// 작성하지 않을 수 있다!
		// for ( ; ;) --> 무한루프 (조건문 X -> false안됨 -> 종료 X)
		// 초기식 작성 X -> h, y(이볅 받은 값) 사용
		for (; h >= 1; h--) { // 2 1 (2바퀴)
			for (int i= y; i >= 1; i--) { // 3 2 1 (3바퀴)
				System.out.print(++num + " ");
			}
			System.out.println();
		}
	}
}





































