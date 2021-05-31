package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.[0이면 종료]");
	
		int sum = 0;
		int a = sc.nextInt();
		
		sum = sum + a;
		
		do {
			System.out.println("합계: " + sum);
			 a = sc.nextInt();
			 sum = sum + a;
		}while(a!=0);
		
		System.out.println("종료");
		
		
		
		sc.close();
		*/
	
		
		//바라ㅏ라랄ㅇ법 2
//		Scanner sc = new Scanner(System.in);
//				
//		int a;
//		int sum=0;
//		
//		System.out.println("숫자를 입력하세요.[0이면 종료]");
//		do {
//			a = sc.nextInt();
//			sum = sum + a;
//			System.out.println("합계"+sum);
//		}while(a!=0);
//		
//		System.out.println("종료");	
//				
//		sc.close();
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int sum=0;
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
		while(true) {
			a = sc.nextInt();
			sum = sum + a;
			System.out.println("합계"+sum);
			
			
			
			if(a==0) {
			break;
		}
		
		
		
		
	
	
	}

		System.out.println("종료");	

	}
	}




