package com.javaex.ex02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է����ּ���");
		System.out.print("�̸� : ");
		
		String name = sc.nextLine();
		
		System.out.println("���̸� �Է����ּ���");
		System.out.print("���� : ");
		
		int age = sc.nextInt();
		
		System.out.println("Ű�� �Է����ּ���");
		System.out.print("Ű : ");
		
		double hi = sc.nextDouble();
		
		System.out.println("����� �̸��� " +name+ " ����� ���̴� " + age + " ����� Ű�� " +hi);
		
		
		
		
	
	
		sc.close();
	
	}

}
