package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	
	
	Scanner sc= new Scanner(System.in);	
	
	System.out.println("���� �Է����ּ���");
	System.out.print("�� : ");
	
	int dan = sc.nextInt();
	
	
	int i=1;//�ʱ�ȭ
	
	while(i<10) {//�ݺ�����
		
		System.out.println(dan+" * "+i+" = "+(dan*i) );
		
		i++;//������ 
		
			// ��� 1�� Ŀ���Ƿ� ������ i<10, �� 9�� �ɶ����� ����� ���ش�.  false�ɶ����� ����! ����
		
	}
	
	sc.close();
	
	
	}

}
