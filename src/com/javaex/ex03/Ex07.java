package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		
		int a = sc.nextInt();
		
		
		if(a>100) {
			System.out.println("�����Դϴ�.");
		}
		
		else if(a>=90) {
			System.out.println("A���");
		}
		
		else if (a>=80) {
			System.out.println("B���");
		}
		
		else if (a>=70) {
			System.out.println("C���");
		}
		
		else if (a>=60) {
			System.out.println("D���");
		}
		
		else if (a<60 && a>=0) {
			System.out.println("F���");
		}
		
		else {
			System.out.println("�����Դϴ�.");
		}
		
		
		sc.close();
	
	
	}

}
