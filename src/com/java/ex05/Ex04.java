package com.java.ex05;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�氹�� ����ɶ� for������ ���� �κ��� �����������
		
		int[] no = new int[8];	//���� 6--> 8
		
		
		for(int i=0; i<no.length; i++) {	// �Է��� �������� �־����~ ���� ���Ƽ� ����
			no[i] = (int)(Math.random()*45)+1;
		}
		
		System.out.println(no.length); //no.length -->�˾Ƽ� ���� �ִ밪 �Է�
		
		System.out.println("===============");
		
		for(int i=0; i<no.length; i++) {
			System.out.println(no[i]);
		}
		
		System.out.println("===============");	
	
		for(int i=0; i<no.length; i++) {
			System.out.println(no[i]);	//����� ���� ������ ���������� ��
		}								//but �������� ���� 
	
		
	}

}
