package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.[0�̸� ����]");
	
		int sum = 0;
		int a = sc.nextInt();
		
		sum = sum + a;
		
		do {
			System.out.println("�հ�: " + sum);
			 a = sc.nextInt();
			 sum = sum + a;
		}while(a!=0);
		
		System.out.println("����");
		
		
		
		sc.close();
		*/
	
		
		//�ٶ󤿶������ 2
//		Scanner sc = new Scanner(System.in);
//				
//		int a;
//		int sum=0;
//		
//		System.out.println("���ڸ� �Է��ϼ���.[0�̸� ����]");
//		do {
//			a = sc.nextInt();
//			sum = sum + a;
//			System.out.println("�հ�"+sum);
//		}while(a!=0);
//		
//		System.out.println("����");	
//				
//		sc.close();
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int sum=0;
		
		System.out.println("���ڸ� �Է��ϼ���.[0�̸� ����]");
		
		while(true) {
			a = sc.nextInt();
			sum = sum + a;
			System.out.println("�հ�"+sum);
			
			
			
			if(a==0) {
			break;
		}
		
		
		
		
	
	
	}

		System.out.println("����");	

	}
	}




