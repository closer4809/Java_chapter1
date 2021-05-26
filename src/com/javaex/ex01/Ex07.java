package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args){
	
		double v01 =5/4; //1.25x int/int=int
		System.out.println(v01); //원래 int가 기본값 그래서 double을 줘도 1에 소수점 붙어 1.0 도출
	 
		double v02 = (double)5/4; //1.25o   //5.0/4 --> 5.0 /4.0 = 1.25 
		System.out.println(v02); // 큰 단위로 먹고들어감 정수<실수
		
		double v03 = 5 / (double)4; //1.25o 위 규칙과 같음 
		System.out.println(v03);
		
		double v04 = (double)5 / (double)4; //1.25   5.0 / 4.0 -->1.25
		System.out.println(v04);
		
		int v05 = (int)1.3 + (int)1.8; //1 + 1 --> 2
		System.out.println(v05);
		
		int v06 = (int)(1.3 +1.8); //1 + 1 --> 2
		System.out.println(v06);
		
		
	}
	


}
