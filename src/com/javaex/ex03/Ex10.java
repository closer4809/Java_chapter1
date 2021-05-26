package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과묵을 선택하세요");
		System.out.println("(1.자바 2.c 3.c++ 4.이썬)");
		System.out.print("과목번호 : ");
		
		String a = sc.nextLine();
	
		switch(a){
			case "A":
				System.out.println("R101호");
				break;
		
			case "B":
				System.out.println("R202호");
				break;
		
			case "C":
				System.out.println("R303호");
				break;
		
			case "D":
				System.out.println("R404호");
				break;
		
			default:
				System.out.println("상담원에게 문의하세요");
				break;
		}
		
	
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
