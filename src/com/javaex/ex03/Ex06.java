package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���");
		
		int a = sc.nextInt();
		
		if(a%3 == 0) {
			System.out.println(a+"��(��) 3�� ��� �Դϴ�.");
		}
				
		else {
			System.out.println(a+"��(��) 3�� ����� �ƴմϴ�.");
		}
		
		
		sc.close();
	
	
	
	}

}
