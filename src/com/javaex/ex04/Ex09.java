package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.println("���ڸ� �Է��ϼ���.");
			int a = sc.nextInt();
	
	
			if(a==0) {System.out.println("����");break;}
			
			else if(a%3 == 0) 
					{System.out.println("3�� ����Դϴ�.");	}
			
			
			
			else if (a%3 != 0)
				{System.out.println("3�� ����� �ƴմϴ�.");}
			
			
	
	
			
	
			}
	
	
		sc.close();
	
	
	
	
	
	
	
	
	
	
	
	}

}
