package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		
		
		a = sc.nextInt();
		
		for(int b = 1; b <10; b++ ) {
			int result = a*b;
			
			System.out.println(a+" * "+b+" = " +result );
			
			
			
			
		}
		
		
		
		
		
		
		sc.close();
	
	
	
	
	
	
	}

}
