package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.println("숫자를 입력하세요.");
			int a = sc.nextInt();
	
	
			if(a==0) {System.out.println("종료");break;}
			
			else if(a%3 == 0) 
					{System.out.println("3의 배수입니다.");	}
			
			
			
			else if (a%3 != 0)
				{System.out.println("3의 배수가 아닙니다.");}
			
			
	
	
			
	
			}
	
	
		sc.close();
	
	
	
	
	
	
	
	
	
	
	
	}

}
