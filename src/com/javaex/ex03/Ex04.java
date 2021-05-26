package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Scanner sc = new Scanner(System.in);
	
	System.out.print("근무시간 : ");
	int a = sc.nextInt();
			
	
	
	if(a<=0){
		System.out.println("잘못된 값입니다." );
	}
	
	else if(a<=8){
		System.out.println("임금은 "+a*10000+" 입니다." );
	}
	
	else{
		System.out.println("임금은 "+(a*10000+(a-8)*12000)+" 입니다." );
	}
	
	
	
	
	sc.close();
	
	
	
	}

}
