package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		System.out.print("���� :");
		
		int a = sc.nextInt();
		
		/*	����§��
		 if(a==0){
			System.out.println("0�Դϴ�.");
		}
		
		
		
		else if(a>0 && a%2==0){
			System.out.println("¦���Դϴ�.");
		}
		
		else if(a>0 && a%2==1){
			System.out.println("Ȧ���Դϴ�.");
		}		
				
		
		else  {
			System.out.println("�����Դϴ�.");
		}*/
		
				
		//�������� §�� if �ȿ� if �ֱ�
		if(a>0) {
			if(a%2 == 0)
			{System.out.println("¦���Դϴ�.");}
			
			else if(a%2 == 1) 
			{System.out.println("Ȧ���Դϴ�.");}
		}
		
	
		
		
		
		else if(a==0) {
			System.out.println("0�Դϴ�.");
		}
		
		else{
			System.out.println("�����Դϴ�.");
		}
		
		
				
		sc.close();
		
	}

}
