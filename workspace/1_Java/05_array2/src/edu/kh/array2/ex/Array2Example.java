package edu.kh.array2.ex;

import java.util.Arrays;

import java.util.Scanner;

public class Array2Example {

	/* 2차원 배열
	 * - 자료형이 같은 1차원 배열을 묶음으로 다루는 것
	 * -> 행, 열 개념 추가
	 * */
	public void ex1() {
		
		// 2차원 배열 선언
		int[][] arr;
		// int 2차원 배열을 참조하는 참조 변수 선언
		// (참조형 == 참조 변수 == 레퍼런스 변수 == 레퍼런스)
		
		arr = new int[2][3];
		// heap 영역에 int 2차원 배열 2행 3열 공간을 할당
		
		// 2차원 배열 초기화
		
		// 1) 헹, 열 인덱스를 이용해서 직접 초기화
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		// Arrays.toString(배열명) : 참조하고 있는 1차원 배열 값을 문자열로 반환
		System.out.println(Arrays.toString(arr)); // arr이 참조하고 있는 주소값 두개 출력
		
		/* 
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		 
		arr[1][0] = 30;
		arr[1][1] = 30;
		arr[1][2] = 30;
		  
		* */
		
		// 2) 2중 for문을 이용한 초기화
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i <arr.length; i++) {
			for (int x = 0; x < arr[i].length; x++) {
				System.out.printf("[%d][%d]인덱스 정수 입력 : ", i, x);
				int input = sc.nextInt();
				arr[i][x] = input;
			}
		}
		
		// * 배열 길이
		// -> 배열명.length : 변수가 직접 참조하고 있는 배열의 길이를 반환
		
		System.out.println(arr.length); // 2 (행 길이)
		// arr이 참조하고 있는 2차원 배열의 행의 길이
		
		System.out.println(arr[0].length); // 3 (열 길이)
		// arr[0]행이 참조하고 있는 1차원 배열의 열의 길이
		
		// Arrays.deepToString(배열명)
		// - 참조하고 있는 배열의 데이터가 나오는 부분까지 파고 들어가서 모든 값을 문자열로 반환
		System.out.println(Arrays.deepToString(arr)); // [[10, 20, 30], [0, 0, 0]]
		
	}
	
	public void ex2() {
			
		
	}
	
	public void ex3() {
		
		
	}
	
	public void ex4() {
		
		
	}
	
	public void ex5() {
		
		
	}
	
	
}
