package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� : ");
		
		int point = sc.nextInt();  //92
				
		if(point>=60) { // true
			System.out.println("�հ��Դϴ�.");
		}
		
		else { // false
			System.out.println("���հ��Դϴ�.");
		}
		
		
		
		
		sc.close();

	}

}
