package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] arg) {
		
		//일반적인 방식
		//진짜의도 
		double pi = 3.14;
		double result01 = 5*5*pi;
		System.out.println(result01);

		//pi는 항상 3.14로 사용해야된다 --> 변경되었음 
		pi = 3.1415926;
		double result02= 5*5*pi;
		System.out.println(result02);
		
	
		//상수로 정의한 경우
		final double PI =3.14;		//관례적으로 final쓰면 변수를 대문자로줌
 		double result03= 5*5*PI;
		System.out.println(result03);
		
		/*
		PI=3.1415926; 	//위에 같은 변수를 파이널로 줫는데 값이 달라버리니 오류가 난다~//
		double result04= 5*5*PI;
		System.out.println(result04);
		*/
		
		
	}
}
