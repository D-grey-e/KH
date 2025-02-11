package edu.kh.control.loop;

import java.util.Scanner;

public class LoopExample1 {

	/* for 문
	 * - 끝이 정해져 있는(횟수가 지정되어 있는) 반복문
	 * 
	 * [작성법]
	 * for(초기식; 조건식; 증감식) {
	 * 		조건이 true일 경우 반복 수행할 코드
	 * }
	 * 
	 * - 초기식 : for문을 제어하는 용도의 변수 선언
	 * 
	 * - 조건식 : for문의 반복 여부를 지정하는 식
	 * 			보통 초기식에 사용된 변수를 이용하여 조건식을 작성함
	 * 
	 * - 증감식 : 초기식에 사용된 변수를
	 * 			for문이 끝날 때 마다 증가 또는 감소 시켜
	 * 			조건식의 결과를 변하게 하는 식
	 * */
	
	// for 예제 1 - 안녕하세요 10번 출력하기
	public void ex1() {
		//	초기식	;	조건식 ; 증감식
		for(int i = 0; i < 10; i++) {
			System.out.println("안녕하세요.");
		}
		// * for문 해석 순서 *
		// 1) 초기식 (반복을 세는 용도의 변수)
		// 2) 조건식 (초기식에 사용된 변수의 값에 따라 반복 여부 결정)
		// 3) for문 내부 코드
		// 4) 증감식 (초기식 변수의 값을 변화)
		 
		// 2) ~ 4) 반복 (조건식이 false일 때 까지 반복)
		
	}
	
	public void ex2() {
		// for문 예제2 - 1부터 10까지 출력하기
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	
	}
	
	public void ex3() {
		// for 예제 3 - 3부터 7까지 출력하기
		
		for(int i = 3; i <= 7; i++) {
			System.out.println(i);
		}
		
	}
	
	public void ex4() {
		// for 예제 4 - 2 부터 20까지 2씩 증가하며 출력
		// i = i + 2
		// i += 2 
		
		for(int i = 2; i <= 20; i += 2) {
			System.out.println(i);
		}
		
	}
	
	public void ex5() {
		// for 예제 5 - 1부터 5까지 0.5씩 증가하며 출력
		
		for (double n = 1; n <= 5; n += 0.5) {
			System.out.println(n);
		}
		
	}
	
	public void ex6() {
		// for 예제 6 - 영어 알파벳 A부터 Z까지 한 줄로 출력	
		
		//  혜선쌤 VER1
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i);
		}
		System.out.println("\n--------------------------------------------");
		// 혜선쌤 VER2
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
		
//		// 내 VER
//		for (int i = 65; i <= 90; i++) {
//			System.out.print((char)i);
//		}
		
	}

	public void ex7() {
		// for 예제 7 - 1부터 입력한 수까지 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 출력받고 싶은 정수 (n) :");
		int i = sc.nextInt();
		
		for (int n = 1; n <= i; n++ ) {
//			if(n / 10 == 1) {
//				
//			}
//			System.out.printf(" %d", n);
		}
		
	}
	

	public void ex8() {
		// for 예제 8 - 1부터 10까지 정수의 합 구하기
		int sum = 0 ; // 합계를 저장할 변수
					  // 0으로 초기화 하는 이유 : 0은 더해도 영향이 없기 때문
		
		for (int i = 1; i <= 10; i++) {
			sum = sum + i; // i 값을 sum에 누적
			//sum += i;
		}
		System.out.println("합계 : " + sum);
		
		
	}

	public void ex9() { // 오류 아직 못고침
		// for 예제 9 - 50부터 입력 받은 수 까지 모든 정수의 합 출력
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력 : ");
		int input = sc.nextInt();

		int sum = 0;

		if (input < 50) {
			for (int i = 50; i >= input; i--) {
				sum += i; // sum에 n값 누적
			}
		} else {
			for (int i = 50; i <= input; i++) {
				sum += i;
			}

		} 
		System.out.println("50부터 " + input + " 까지의 합 : " + sum);
	}
	
	public void ex10() {
		// for 예제 10 - 정수 5개를 입력 받아서 합계 구하기
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("입력" + i + " : ");
			int input = sc.nextInt();
			sum += input; 
//			System.out.println(input);
			// {} 안에 생성된 변수는 {} 밖에서는 사용 X
			// -> {} 끝나는 시점에 사라지기 때문에
		}
//		System.out.println(input); // 에러
		System.out.println("합계 : " + sum);
		
	}
	

	public void ex11() {
		// for 예제 11 - 정수를 몇 번 입력 받을지 먼저 입력 받고
		//				입력된 정수의 합계를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 받을 정수의 개수 : ");
		int i1 = sc.nextInt();
		
		int sum = 0;
		
		for (int n = 1; n <= i1; n++ ) {
			System.out.print("입력 " + n + " : " );
			int i2 = sc.nextInt();
			sum += i2;
		}
		System.out.println("합계 :" +sum);
		
	}
	

	public void ex12() {
		// for 예제 12 - 시작, 끝, 증가할 수를 입력 받아
        //				지정된 범위까지 모두 출력 후
		//				합계도 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 : ");
		int s = sc.nextInt();
		
		System.out.print("끝 : ");
		int f = sc.nextInt();
		
		System.out.print("증가할 수 : ");
		int x = sc.nextInt();
		
		int sum = 0;
		
		for (int i = s; i <= f; i += x ) {
			sum += i;
			System.out.print(i + " ");
		}
		System.out.println("\n합계 : " + sum);
		
	}

	public void ex13() {
		// for 예제 13 - 1부터 10까지 모든 정수 출력
		// 				단, 짝수는 [] 감까서 출력
		
		// 1 [2] 3 [4] 5 [6] 7 [8] 9 [10]
		
		for (int i = 1; i <= 10 ; i++) {
			if (i % 2 == 0) {
				System.out.printf("[%d] ", i); 
			} else {
			System.out.printf("%d ", i);
			}
		}
		
	}

	public void ex14() {
	// for 예제 14 - 1부터 10까지 모든 정수 출력
	//				단, 홀수는 () 감싸러 출력
	//				+ 1은 "시작" 10은 "끝" 이라고 출력
		
//		// 혜선쌤 VER1
//		for (int i = 1; i <= 10 ; i++) {
//			if (i == 1) {
//				System.out.print("시작 ");
//			} else if (i == 10) {
//				System.out.print("종료 ");
//			} else {
//
//				if (i % 2 != 0) {
//					System.out.printf("(%d) ", i); 
//				} else {
//					System.out.printf("%d ", i);
//				}
//			}
//		}
		System.out.print("시작 ");
		
		for (int i = 2; i <= 9; i++) {
			if (i % 2 != 0) {
				System.out.printf("(%d) ", i); 
			} else {
				System.out.printf("%d ", i);
			}
		}
		System.out.println("종료 ");
		
	}
	public void ex15() {
		// for 예제 15 - 1~100사이 수 중
		//				입력 받은 수의 배수를 뺀 나머지 수의 합을 출력

		// ex)
		// 제외할 배수 입력 : 4
		// 합계 : @
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("제외할 배수 입력 : ");
		int i = sc.nextInt();
			
		int sum = 0;
		
		for ( int n = 1; n <= 100; n++) {
			
			if (n % i != 0) { //i 의 배수가 아닌경우
				sum += n;
			}
		}
		System.out.println("합계 : " + sum);
	}
}




























