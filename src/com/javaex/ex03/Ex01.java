package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int point = sc.nextInt();
		
		
		
		if(point>=60) { // 70 --> true     59 --> false
			System.out.println("�հ��Դϴ�.");
		}
		

		if(point<60) {
			System.out.println("���հ��Դϴ�.");
		}
		sc.close();

	}

}
