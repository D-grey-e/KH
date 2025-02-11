package edu.kh.control.loop;

import java.util.Scanner;

public class LoopExample3 {
	
	/* while 문
	 * - 반복 조건만을 설정하는 반복문으로
	 * 	별도의 초기식, 증감식이 존재하지 않음
	 * 
	 * -조건식이 true인 경우에 계속 반복
	 * -> 조건식이 false가 되는 상황을 같이 구현해야함
	 * 
	 * [작성법]
	 * while(조건식) {
	 * 		조건식이 true일 때 수행할 구문;
	 * 		(+ 조건식이 특정 상황에서 false가 되도록 하는 구문도 같이 작성
	 * 			-> 안하면 무한루프)
	 * }
	 * */
	public void ex1() {
		// 숫자 0이 입력될 때 까지 프로그램 종료 X
		// + 0이 입력 되기 전까지 입력된 모든 숫자의 합 출력
		
		// 정수 입력 : 5
		// 정수 입력 : 4
		// 정수 입력 : 2
		// 정수 입력 : 0
		// 입력된 정수의 합 : 11
		Scanner sc = new Scanner(System.in);
		
		int input = -1; // 종료 조건과 관련 없는 값으로 초기화
		
		int sum = 0;
		
		while (input != 0) { // input이 0이 아닐 때 true
			System.out.print("숫자를 입력해주세요 : ");
			input = sc.nextInt();
			sum += input;
		}
		System.out.println("입력된 정수의 합 : " + sum);
	}
	// ex1 = ex2
	public void ex2() {
		// 숫자 0이 입력될 때 까지 프로그램 종료 X
		// + 0이 입력 되기 전까지 입력된 모든 숫자의 합 출력

		// 정수 입력 : 5
		// 정수 입력 : 4
		// 정수 입력 : 2
		// 정수 입력 : 0
		// 입력된 정수의 합 : 11
		Scanner sc = new Scanner(System.in);

		int input = -1; // 종료 조건과 관련 없는 값으로 초기화

		int sum = 0;

		while (input != 0) { // input이 0이 아닐 때 true
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			sum += input; // 입력 받기 전에 실행하게 하면 
						  // 초기화한 값이 실행 되고 나서 진행되기 때문에
						  // 값이 달라지므로 순서 주의
		}
		System.out.println("입력된 정수의 합 : " + sum);
	}
	
	public void ex3() {
		// 분식집 주문 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0; // 입력한 메뉴 번호를 저장할 변수
		
		int sum = 0;
		
		String menu = ""; // 초기화 값 뭐가 좋을까..best) ""-> 빈 문자열
		
		while (input != 9) { // 9 입력시 조건이 false가 되어 while문 종료
			System.out.println("=== 메뉴 ===");
			System.out.println("1. 벌교꼬막미니김밥(14000)");
			System.out.println("2. 키토삼겹묵은지(12500)");
			System.out.println("3. 왕돈까스(14500)");
			System.out.println("9. 주문 완료");
			
			System.out.print("메뉴 선택 >>> ");
			input = sc.nextInt(); // input에 메뉴 번호 저장
			
			switch (input) {
			case 1 : sum += 14000; break;
			case 2 : sum += 12500; break;
			case 3 : sum += 14500; break;
			case 9 : System.out.println("주문 완료!"); break;
			default : System.out.println("<<메뉴에 작성된 번호만 눌러주세요.>>");
			}
			switch (input) {
			case 1 : menu += "벌교꼬막미니김밥 "; break;
			case 2 : menu += "키토삼겹묵은지 "; break;
			case 3 : menu += "왕돈까스 "; break;
			}
		}
		System.out.println("주문한 메뉴 :" + menu);
		System.out.println("총 가격 : " + sum + "원");
		
	}
	
	// do-while 문 : 최소 1번은 수행
	// while문의 조건식 확인 위치를 끝으로 보낸 while
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		int input = 0;
		do {
			System.out.print("숫자 입력 : ");
			input = sc.nextInt();
			sum += input;
			
		} while(input != 0);
		System.out.println("합계 : " + sum);
	}
		
	public void ex5() {
		
		
	}
	
	public void ex6() {
		
		
	}
	
	public void ex7() {
		
		
	}
	
	public void ex8() {
		
		
	}
}
