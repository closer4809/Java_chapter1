package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		
		//���Կ�����
		System.out.println("���Կ�����-----------------------------");
		int a = 7;
		int b = 2;
		System.out.println(b);
		System.out.println(a);
		
		//���������
		System.out.println("���������-----------------------------");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		System.out.println(a/b); //��
		System.out.println(a%b); //������
		
		//��������� / %
		System.out.println("���������  /  % �ڼ���---------------------------");
		System.out.println(7.0 / 2.0); //��
		System.out.println(7.0 % 2.0);	//������
	
	
		//��ȣ������ / 
		System.out.println("��ȣ������---------------------------");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		var = -var;
		System.out.println(var);
		System.out.println(pVar);
		System.out.println(mVar);
		System.out.println(var);
	
	
	
		//���������� / %
		System.out.println("����������---------------------------");
		System.out.println(a); // a-->7
		System.out.println(++a);
		System.out.println(a); // a�� ���� ��������? --> ����
		
		System.out.println(b);
		System.out.println(--b);
		System.out.println(b); // b�� ���� ��������?  --> ����
		
		System.out.println("���������� ��---------------------------");
		System.out.println(a);	// a --> 8
		System.out.println(a++); //���� ���� �Ѵ�?
		System.out.println(a);
	
		System.out.println(b);  // b --> 1
		System.out.println(b--);
		System.out.println(b);
	
		System.out.println("���������� ��������-----------------------");
		int num = 5;
		System.out.println(num);  // num --> 5
		
		
//		System.out.println(++num);	// num 5--> 6 , ���
		
//		System.out.println(num++);  // ���, num 5--> 6
//		System.out.println(num);
		
		System.out.println(num++ *10-7);	//num*10, -7, ���, num 5-->6
		System.out.println(num);
		System.out.println(num*10);
		
		
		
	
	
	
	
	
	}

}
