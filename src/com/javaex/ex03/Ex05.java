package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);

		System.out.print("�ٹ��ð� : ");
		
		int a = sc.nextInt(); 
		
		if(a<=8) {
			System.out.println("�ӱ��� "+(a*10000)+" �Դϴ�.");
		}
		
		else if(a>8) {
			System.out.println("�ӱ��� "+(80000+((a-8)*15000))+" �Դϴ�.");
		}
		
		else {
			System.out.println("");
		}
		
		sc.close();
	}

}
