package edu.kh.note.book;

import java.util.Scanner;

public class Notebook {
       
    public void ex1() {
    	Scanner sc = new Scanner(System.in);
    	int number = sc.nextInt();
    	int answer = 0;
    	
    	for(int i=0; i<1; i++){
    		answer += number % 100;
    		number /= 100;
    	}
    	
    	System.out.println(answer + number);
    }

	public void ex2() {

		int[] answer = {0, 0, 0, 0, 0};
		String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};
		
		for (int i= 0; i< 5; i++ ) {
			for (int j= 0; j< 5; j++) {
				System.out.printf("%s ",basic_order[j]);
			}
			System.out.println();
			System.out.printf("%s ", answer[i]);
		}
		
	}
	
	public void ex3() {
		
	}
	public void ex4() {
		
	}
	public void ex5() {
		
	}
    
    
}