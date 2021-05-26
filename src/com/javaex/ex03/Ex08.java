package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자 :");
		
		int a = sc.nextInt();
		
		/*	내가짠거
		 if(a==0){
			System.out.println("0입니다.");
		}
		
		
		
		else if(a>0 && a%2==0){
			System.out.println("짝수입니다.");
		}
		
		else if(a>0 && a%2==1){
			System.out.println("홀수입니다.");
		}		
				
		
		else  {
			System.out.println("음수입니다.");
		}*/
		
				
		//선생님이 짠거 if 안에 if 넣기
		if(a>0) {
			if(a%2 == 0)
			{System.out.println("짝수입니다.");}
			
			else if(a%2 == 1) 
			{System.out.println("홀수입니다.");}
		}
		
	
		
		
		
		else if(a==0) {
			System.out.println("0입니다.");
		}
		
		else{
			System.out.println("음수입니다.");
		}
		
		
				
		sc.close();
		
	}

}
