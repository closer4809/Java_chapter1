package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.println("과묵을 선택하세요");
	System.out.println("(1.자바 2.c 3.c++ 4.이썬)");
	System.out.print("과목번호 : ");
	
	int a = sc.nextInt();
			
	if(a == 1) {
		System.out.println("R101호");
	}
	
	else if(a == 2) {
		System.out.println("R202호");
	}
	
	else if(a == 3) {
		System.out.println("R303호");
	}
	
	else if(a == 4) {
		System.out.println("R404호");
	}
	
	else {
		System.out.println("상담원에게 문의하세요");
	}
	
	sc.close();
	
	
	// == 대입 조건문일 경우 Switch 사용가능하다. 이경우 String사용가능 
	// 근데 여긴 String 사용 불가능 WHY?? String은 기본 자료형이아니라 연산자에 사용 할 수 없다!
	// Ex10 참고
	}

}
