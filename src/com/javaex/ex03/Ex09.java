package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.println("������ �����ϼ���");
	System.out.println("(1.�ڹ� 2.c 3.c++ 4.�̽�)");
	System.out.print("�����ȣ : ");
	
	int a = sc.nextInt();
			
	if(a == 1) {
		System.out.println("R101ȣ");
	}
	
	else if(a == 2) {
		System.out.println("R202ȣ");
	}
	
	else if(a == 3) {
		System.out.println("R303ȣ");
	}
	
	else if(a == 4) {
		System.out.println("R404ȣ");
	}
	
	else {
		System.out.println("�������� �����ϼ���");
	}
	
	sc.close();
	
	
	// == ���� ���ǹ��� ��� Switch ��밡���ϴ�. �̰�� String��밡�� 
	// �ٵ� ���� String ��� �Ұ��� WHY?? String�� �⺻ �ڷ����̾ƴ϶� �����ڿ� ��� �� �� ����!
	// Ex10 ����
	}

}
