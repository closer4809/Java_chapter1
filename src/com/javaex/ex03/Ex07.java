package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		
		int a = sc.nextInt();
		
		
		if(a>100) {
			System.out.println("오류입니다.");
		}
		
		else if(a>=90) {
			System.out.println("A등급");
		}
		
		else if (a>=80) {
			System.out.println("B등급");
		}
		
		else if (a>=70) {
			System.out.println("C등급");
		}
		
		else if (a>=60) {
			System.out.println("D등급");
		}
		
		else if (a<60 && a>=0) {
			System.out.println("F등급");
		}
		
		else {
			System.out.println("오류입니다.");
		}
		
		
		sc.close();
	
	
	}

}
