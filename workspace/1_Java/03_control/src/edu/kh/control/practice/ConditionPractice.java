package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {

		Scanner sc = new Scanner(System.in);


		System.out.println("숫자 한 개 입력하세요 : ");
		int i = sc.nextInt();

		String str; // 결과 저장용 변수

//		// 혜선쌤 VER1
//		if(i > 0) { // 양수
//
//			if(i % 2 ==0) { // 짝수
//				str = "짝수입니다.";
//
//			}else {
//				str = "홀수입니다.";
//			}
//		}else {
//			str = "양수만 입력헤주세요";
//
//		}
//		System.out.println(str);

//		// 혜선쌤 VER2
//		if(i > 0 && i % 2 == 0) {
//			System.out.println("짝수입니다.");
//
//		} else if(i > 0 && i % 2 != 0) {
//			System.out.println("홀수입니다.");
//
//		} else {
//			System.out.println("양수만 입력해주세요.");
//		}


		// 내 VER
		if(i <= 0) { 
			System.out.println("양수를 입력해 주세요");

		} else if(i % 2 != 0) {
			System.out.println("홀수입니다.");

		} else {
			System.out.println("짝수입니다.");
		}

	}
	public void practice2() {

		Scanner sc = new Scanner(System.in);

		System.out.println("국어 점수 :");
		int ks = sc.nextInt();

		System.out.println("영어 점수 :");
		int es = sc.nextInt();

		System.out.println("수학 점수 :");
		int ms = sc.nextInt();

		int sum = ks + es + ms;

		double mean = sum / 3;

		String str;

//		//혜선썜 VER
//		if(ks >= 40 && es >= 40 && ms >= 40 && mean >= 60) { // 합격
//			System.out.println("국어 : " + ks);
//			System.out.println("영어 : " + es);
//			System.out.println("수학 : " + ms);
//			System.out.println("합계 : " + sum);
//			System.out.println("평균 : " + mean);
//			System.out.println("합격입니다!");
//
//		} else { // 불합격
//			System.out.println("불합격입니다.");
//
//		}


		// 내 VER
		if(ks < 40) {
			str = "불합격 입니다.";

		} else if(es < 40) {
			str = "불합격 입니다.";

		} else if(ms < 40) {
			str = "불합격 입니다.";

		} else if(mean < 60) {
			str = "불합격 입니다.";

		} else {
			str = "합격입니다!";
		}
		System.out.printf(" 국어 : %d \n 영어 : %d \n 수학 : %d \n 합계 : %d \n 평균 : %f \n %s \n",
				ks, es, ms, sum, mean, str);
//		System.out.println("국어 : " + ks);
//		System.out.println("영어 : " + es);
//		System.out.println("수학 : " + ms);
//		System.out.println("합계 : " + sum);
//		System.out.println("평균 : " + mean);
//		System.out.println(str);

	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1~12 사이의 정수 입력 : ");
		int i = sc.nextInt();

		String str;
		//내 VER
		switch(i) {
		case 1 	: case 3 : case 5 :case 7 : 
		case 8 : case 10 : case 12 : str = i + "월은 31일까지 있습니다."; break;
		
		case 4 	: case 6 :case 9 : case 11 : str = i + "월은 30일까지 있습니다."; break;
		
		case 2 	: str = i + "월은 28일까지 있습니다."; break; 
		
		default : str = i + "월은 잘못 입력된 달입니다.";
		}
		
		System.out.println(str);

//		// 혜선썜 VER
//		int day = 0; // 해당하는 달의 마지막 일(날짜)을 저장
//
//
//		switch(i) {
//		case 1 : case 3: case 5: case 7: case 8: case 10: case 12: day = 31; break;
//		case 4 : case 6: case 9: case 11: day = 30; break;
//		case 2: day = 28; break;
//
//		}
//		if (day != 0) { // 1~12 사이가 입력 되었을 때
//			System.out.printf("%d월은 %d일까지 있습니다.", i, day);
//
//		} else { // 1~12 사이가 입력되지 않았을 때
//			System.out.println(i + "월은 잘못 입력된 달입니다.");
//
//		}


	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);

		System.out.println("키(m)를 입력해 주세요 : ");
		double h = sc.nextDouble();

		System.out.println("몸무게(kg)를 입력해 주세요 : ");
		double g = sc.nextDouble();

		double BMI = g / (h * h);

		String str;

		//내 VER = 혜선썜 VER
		if(BMI < 18.5) {
			str = "저체중";

		} else if(BMI < 23) {
			str = "정상체중";

		} else if(BMI < 25) {
			str = "과체중";

		} else if(BMI < 30) {
			str = "비만";
		} else {
			str = "고도 비만";
		}
		System.out.println("BMI 지수 : " + BMI);
		System.out.println(str);

	}
	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.println("중간 고사 점수 : ");
		int i1 = sc.nextInt();

		System.out.println("기말 고사 점수 : ");
		int i2 = sc.nextInt();

		System.out.println("과제 고사 점수 : ");
		int i3 = sc.nextInt();

		System.out.println("출석 횟수 : ");
		int i4 = sc.nextInt();

		double sum = (i1 * 0.2) + (i2 * 0.3) + (i3 * 0.3) + i4;

		String str;

		System.out.println("=============결과===================");
		
		// 내 VER - 이중 if문
		if (i4 <= 20 * (1 - 0.3)) {
			str = "Fail [출석 횟수 부족 (" + i4 + "/20)]";
			System.out.println(str);
			
		} else {
			if (sum < 70) {
				str = "Fail [점수 미달]";
				
			} else {
				str = "PASS";
			}
			System.out.printf("중간 고사 점수(20) : %.1f \n", i1 * 0.2);
			System.out.printf("기말 고사 점수(30) : %.1f \n", i2 * 0.3);
			System.out.printf("과제 점수		(20) : %.1f \n", i3 * 0.3);
			System.out.printf("출석 점수		(20) : %d \n", i4);
			System.out.printf("총점 : %.1f \n", sum);
			
			System.out.println(str);
		}

//		// 혜선쌤 VER
//		if(i4 <= 20 * (1 - 0.3)) {
//			System.out.printf("Fail [출석 횟수 부족 (%d/20)]", i4);
//		} else {
//			System.out.printf("중간 고사 점수(20) : %.1f \n", i1 * 0.2);
//			System.out.printf("기말 고사 점수(30) : %.1f \n", i2 * 0.3);
//			System.out.printf("과제 점수		(20) : %.1f \n", i3 * 0.3);
//			System.out.printf("출석 점수		(20) : %d \n", i4);
//			System.out.printf("총점 : %.1f \n", sum);
//			
//			if(sum >= 70) {
//				System.out.println("PASS");
//				
//			} else {
//				System.out.println("Fail [점수 미달]");
//			}
//		}
	}
}


















