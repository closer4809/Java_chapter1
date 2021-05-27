package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	
	
	Scanner sc= new Scanner(System.in);	
	
	System.out.println("단을 입력해주세요");
	System.out.print("단 : ");
	
	int dan = sc.nextInt();
	
	
	int i=1;//초기화
	
	while(i<10) {//반복조건
		
		System.out.println(dan+" * "+i+" = "+(dan*i) );
		
		i++;//증감식 
		
			// 계속 1씩 커지므로 조건인 i<10, 즉 9가 될때까지 계산을 해준다.  false될때까지 멈춰! 해줌
		
	}
	
	sc.close();
	
	
	}

}
