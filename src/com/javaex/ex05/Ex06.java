package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = new int[3];
		
		intArray[0] = 52;
		intArray[1] = 13;
		//intArray[2] = 41; �ʱ�ȭ ���� ������ 0���� ����(������)
							//�Ǽ���, boolean, char �⺻�� �˾ƺ�����
		
		System.out.println("=============");
		System.out.println(intArray.length);
		System.out.println("=============");
		
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	
		System.out.println("=============");
		//ArrayIndexOutOfBoundsException --> ���� ���� ����Ϸ��� �Ҷ�
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	
		
	}

}
