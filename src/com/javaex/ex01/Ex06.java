package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		
		//�ڵ�����ȯ1 : �ڵ�����ȯ ��Ģ�� �˾ƾ� �ڷ����� ������ �� �ִ�.
		System.out.println(2+3.5);
		float var01 = 2 + 3.5f; //�ڷ����� �˾ƾ� �Ѵ�.
		System.out.println(var01);
		
		
		//�ڵ�����ȯ2 (long + float)
		long var02 = 12345L;
		float var03 = 1.1F;
		float result01 = var02 + var03;
		System.out.println(result01); // test --> �Ǽ�(float)
		
		float result = var02 + var03; // long(var02) --> float �ڵ� ��ȯ�Ǿ���
		System.out.println(result);
		
		System.out.println("-------------------------------------------");
		////////////////////////////////////////////////////////////////////
		
		//��������ȯ
		int var04 = (int)3.14;
		System.out.println(var04);
		
		//Ȯ�뺯ȯ
		byte var05 = 10;
		int result02 = (int)var05; //���� ����ȯ(byte --> int) 
		System.out.println(result02);
		
//		��Һ�ȯ
		int var06 = 10;
		byte result03 = (byte)var06;
		System.out.println(result03);
	
		//��Һ�ȭ ��
		int var07 = 10232132;
		byte result04 = (byte)var07;
		System.out.println(result04); // 2������ ���� �ڵ带 ¥���� ������ ���� ����!
	
		//�Ǽ� --> ���� : �Ҽ��� ������
		double var08 = 123.52442;
		int result05 = (int)var08;
		System.out.println(result05);
	
		//���� --> �Ǽ� : �Ҽ��� 0���� ǥ���ȴ�
		int var09 = 7;
		double result06 = (double)var09;
		System.out.println(result06);
	
	
	}
	
	
	

}
