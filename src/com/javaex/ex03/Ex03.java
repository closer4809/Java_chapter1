package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� �Է��ϼ���");
		System.out.println("���� : ");
	
		int num =sc.nextInt();
		
		if(num>0) {
			System.out.println("����Դϴ�.");
		}else if(num<0){
			System.out.println("�����Դϴ�.");
		}
		else {
		}			System.out.println("0�Դϴ�.");

		
		
		sc.close();
	}

}
