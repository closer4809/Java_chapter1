package com.javaex.ex01;

public class Ex09 {

	public static void main(String[] args) {
		
		//���� ������ --> ����� true false --> ����� Boolean ���̴�
		int n01 = 5;
		int n02 = 3;
		int n03 = 5;
		System.out.println(n01<n02); //false
		System.out.println(n01>n02); //true
		System.out.println(n01<=n02);//false
		System.out.println(n01<=n03); //true
		System.out.println(n01>=n02); //true
		System.out.println(n01>=n03); //true
		
		System.out.println(n01==n02); //false
		System.out.println(n01=n02); // false  n01�� 3 ����
		
		System.out.println(n01 != n02); // 5 != 3 --> 5, 3 �����ʴ�? --> false
		
	}
}
