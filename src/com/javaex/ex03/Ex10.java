package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �����ϼ���");
		System.out.println("(1.�ڹ� 2.c 3.c++ 4.�̽�)");
		System.out.print("�����ȣ : ");
		
		String a = sc.nextLine();
	
		switch(a){
			case "A":
				System.out.println("R101ȣ");
				break;
		
			case "B":
				System.out.println("R202ȣ");
				break;
		
			case "C":
				System.out.println("R303ȣ");
				break;
		
			case "D":
				System.out.println("R404ȣ");
				break;
		
			default:
				System.out.println("�������� �����ϼ���");
				break;
		}
		
	
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
