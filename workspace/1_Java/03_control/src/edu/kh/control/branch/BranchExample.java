package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {

	// 분기문
	// break; (가장 가까운) 반복문을 멈춤 (예외 : switch 문)
	// continue : (가장 가까운) 반복문의 시작 부분으로 이동(다음 반복 진행)
	
	public void ex1() {
		for (int i=1; i<= 10000; i++) {
			if(i % 2 == 1) { // 홀수인 경우 출력 X
				continue;
			}
			//System.out.print(i + " "); -> i가 20까지는 출력 됌
			if (i == 20) { // i가 20인 경우 반복을 멈춤
				break;
			}
			System.out.print(i + " "); // i가 18까지 출력 됌 (순서에 따라 차이가 생김)
		}
	}
	
	public void ex2() {
		// 1 ~ 100까지 1씩 증가하며 출력하는 반복문
		// 단, 5의 배수는 건너뛰고
		// 증가하는 값이 40이 되었을 때 반복을 멈춤
		for (int i= 1; i <= 100; i++) {
			if (i == 40) {
				break;
			}
			if (i % 5 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
	
	public void ex3() { // 중첩 반복문 내부에서 break 사용하기
		// 구구단 2~9단까지 모두 출력
		// 단, 2단은 X2까지, 3단은 X3까지 ... 9단은 X9 까지만 출력
		
		// 혜선쌤 VER
		for (int x = 2; x <10; x++) {
			for (int y= 1; y < 10; y++) {
				System.out.printf("%2d X %2d = %2d\n", x, y, x*y);
				
				if (y == x) {
					break;
					// 분기문이 중첩 반복문 내에서 사용되면
					// 가장 가까운 반복문에 작용!
				}
			}
			System.out.println("------------------------------------");
		}
		
//		// 내 VER
//		for (int x = 2; x <10; x++) {
//			for (int y= 1; y < 10; y++) {
//				if (y == x+1) {
//					break;
//				}
//				System.out.printf("%2d X %2d = %2d\n", x, y, x*y);
//			}
//			System.out.println("------------------------------------");
//		}
	}
	
	public void ex4() {
		// col 이 3의 배수인 경우 출력 X
		// row가 3일 때 반복 종료
		for (int row =1; row <= 6; row++) {
			if (row == 3) {
				break;
			}
			for (int col= 1; col <= 10; col++) {
				if (col % 3 == 0) {
					continue;
				}
				System.out.printf("(%d,%2d) ", row, col);
			}
			System.out.println();
		}
		
	}
	
	public void ex5() {
		// 0이 입력될 때까지 모든 정수의 합 구하기
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int input = 0;
		
		// 방법 1. while 문 (단, input에 0이 아닌 다른 값을 넣었다.)
		// 방법 2. do-while문
		// 방법 3. while(무한 루프) + break
		
		while (true) { // 무한 반복
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			if (input == 0) {
				break; // 0입력 시 반복문 종료
			}
			sum += input;
		}
		System.out.println("합계 : " + sum);
		// Unreachable code : 도달할 수 없는 코드 (오류)
	}
	
	public void upDownGame() { // 게임 다시보기**

		Scanner sc = new  Scanner(System.in);

		int answer = (int)(Math.random() * 100  + 1); // 1~100 랜덤 숫자 생성

		System.out.println(answer); // 답안 확인
		
		System.out.println("[1~100사이 숫자 맞추기]");

		int count = 1;
		
		// 혜선썜 VER
		while(true) {
			System.out.print(count + "번째 입력 : ");
			int input = sc.nextInt();
			
			// 잘못 입력한 경우
			if (input < 1 || input > 100) {
				System.out.println("1~100사이값을 입력해주세요.");
				continue;
			}
			// 제대로 입력한 경우
			if (input < answer) { // 입력값이 작은 경우
				System.out.println("UP\n");
			} else if (input > answer) { // 입력값이 큰 경우
				System.out.println("DOWN\n");
			} else { // 같은경 우
				System.out.println("[정답!!!]");
				System.out.printf("총 입력 횟수 : %d회", count);
				break; // while 문 반복 종료
			}
			count++;
			
		}
		/* 1번째 입력 : 1000
		 * *** 1 ~ 100 사이 수를 입력해주세요 ***
		 * 
		 * 1번째 입력 : 51
		 * DOWN
		 * 2번째 입력 : 27
		 * DOWN
		 * 3번째 입력 : 15
		 * DOWN
		 * [정답!!!]
		 * 총 입력 횟수 : 3회
		 * */
		
//		// 내 VER -- 고쳐야 됌
//			while (true) {
//				System.out.printf("%d번째 입력 : ", count);
//				int input = sc.nextInt();
//				
//				if (!(input >=1 && input <= 100)) {
//					System.out.println("1~100사이값을 입력해주세요.");
//				} else {
//					if (input > answer) {
//						System.out.println("DOWN\n");
//					}
//					if (input < answer) {
//						System.out.println("UP\n");
//					}
//					if (input == answer) {
//						System.out.println("정답입니다!");
//						break;
//					}
//				}
//			}
//			count++;
//		}
	}
	
	public void ex6() { //*****************************중요X100
		// 입력 받은 모든 문자열을 누적
		// 단, "end!" 입력 시 문자열 누적을 종료하고 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		String str = ""; // 빈 문자열
		
		while (true) {
			
			System.out.print("문자열 입력(end! 입력시 종료) : ");
			String input = sc.nextLine();
			// next() 	  : 다음 한 단어(띄어쓰기 포함X / 띄어쓰기, 엔터를 만나면 입력 종료)
			// nextLine() : 다음 한 줄(띄어쓰기 포함O / 엔터를 만나면 입력 종료)
			
			// ** next()로 문장을 작성 시 결과가 이상한 이유 **
			// 1) next()는 한 단어만 읽어옴
			// 2) 입력 -> 입력 버퍼에 저장 -> nextXXX() 통해 버퍼 내용을 읽어옴
			
			// *next(), nextInt(), nextDouble() 등
			//	모두 입력 버퍼에서 (엔터)를 제외하고 내용만 읽어옴
			// -> 이후 nextLine() 사용 시 입력받지 못하고 종료됨
			// -> why? 입력 버퍼에 남아있는 (엔터)를 읽었기 때문
			
			// [해결 방법]
			// 입력을 위한 nextLine() 수행 전
			// 입력 버퍼에서 (엔터)를 제거
			// -> 빈 공간에 sc.nextLine() 구문을 한번 작성하면 (엔터)가 제거됨
			
/*	예제..	Scanner sc = new Scanner(System.in);
			System.out.println("정수 이비력: ");
			int input = sc.nextInt(); //  123*456\
			String a= sc.nextLine(); // *456\
			
			System.out.println(input); // 123
			System.out.println(a); // *456\ */
			
			
			// 입력 받는 문자열이 "end!"면 반복 종료
			//if (input == "end!") {
			if (input.equals("end!")) {
				// String 자료형은 비교 연산자(==)로 같은 문자열인지 판별 X
				
				// 비교 연산자는 보통 기본 자료형끼리 연산에만 사용 가능
				// -> String은 기본 자료형이 아닌 참조형
				
				// ** [해결 방법] : 문자열1.equals(문자열2) **************************
				break;
			}
			str += input + "\n";
			System.out.println(str);
		}
		System.out.println(str);
	}
	
	public void bb() {
		
		// [해결 방법]
		// 입력을 위한 nextLine() 수행 전
		// 입력 버퍼에서 (엔터)를 제거
		// -> 빈 공간에 sc.nextLine() 구문을 한번 작성하면 (엔터)가 제거됨
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 이비력: ");
		int input = sc.nextInt(); //  123*456\
		String a= sc.nextLine(); // *456\
		
		System.out.println(input); // 123
		System.out.println(a); // *456\
	}
	
	public void RPSGame() { // 가위 바위 보 게임 
							//몇판? : 3
		// 1번째 게임
		// 가위/바위/보 중 하나를 입력 해주세요 :  가위
		// 컴퓨터는 [보]를 선택했습니다.
		// 플레이어 승!
		// 현재 기록 : 1승 0무 0패

		// 2번째 게임
		// 가위/바위/보 중 하나를 입력 해주세요 :  보
		// 컴퓨터는 [보]를 선택했습니다.
		// 비겼습니다.
		// 현재 기록 : 1승 1무 0패

		// 3번째 게임
		// 가위/바위/보 중 하나를 입력 해주세요 :  가위
		// 컴퓨터는 [바위]를 선택했습니다.
		// 졌습니다ㅠㅠ
		// 현재 기록 : 1승 1무 1패
		Scanner sc = new Scanner(System.in);
		
		
		int num = 0;
		
		int win= 0;
		int lose= 0;
		int draw= 0;

		System.out.print("원하는 게임 수 : ");
		int input = sc.nextInt();
		
		for (int x = 1; x<= input; x++) { // 입력한 판 수만큼 반복하겠다.
			System.out.println(x + "번째 게임");
			
			System.out.print("가위/바위/보 중 하나를 입력해 주세요 : ");
			String str = sc.next(); // Player가 입력 한 가위/바위/보
			
			//랜덤 숫자 생성 후
			// 1= 가위, 2= 바위, 3= 보
			int ciRPS = (int)(Math.random() * 3 + 1); // 1~3 랜덤 숫자 생성

			String cRPS = null; // 컴퓨터가 선택한 가위/바위/보를 저장하는 변수
			// null : 아무것도 참조하고 있지 않음 
			switch (ciRPS) { // 랜덤한 숫자를 가위/바위/보로 교체 
			case 1: cRPS = "가위"; break;
			case 2: cRPS = "바위"; break;
			case 3: cRPS = "보"; break;
			}
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n", cRPS);
			
			// String 비교시 equals() 사용
			if ( str.equals(cRPS) ) { // 비긴 경우
				System.out.println("비겼습니다.");
				draw++;
			} else { // 승 or 패
				
				boolean win1 = str.equals("가위") && cRPS.equals("보");
				boolean win2 = str.equals("바위") && cRPS.equals("가위");
				boolean win3 = str.equals("보") && cRPS.equals("바위");
				
				if (win1 || win2 || win3) {
					System.out.println("플레이어 승!");
					win++;
				}
				System.out.println("졌습니다ㅠㅠ");
				lose++;
			}
			System.out.printf("현재 기록 : %d승 %d무 %d패\n", win, draw, lose);
			continue;
		}
	}
	
	public void ex7() {
		
		
	}
	
}
