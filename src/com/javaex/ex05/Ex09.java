package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//�� �迭�� ������ �Ǵ�
		int[] arrA = new int[3];
		arrA[0] = 10;
		arrA[1] = 20;
		arrA[2] = 30;
		
		int[] arrB = new int[3];
		arrB[0] = 100;
		arrB[1] = 70;
		arrB[2] = 30;
	
		
		//�迭 A �迭 B ������ �Ǵ� --> �迭�� ������ ���ƾ��Ѵ�, ���� ������ ���ƾ� �Ѵ�.
		
		if(arrA.length == arrB.length) { //�迭�� ������ ����
			//ù��° ���� �� ��
			for(int i=0; i<arrA.length; i++) { 
			
				if(arrA[i] != arrB[i]) {
					System.out.println(i+"��° ���� �ٸ��ϴ�.");
				}
			}
		}else {
			System.out.println("�迪�� ũ�Ⱑ �ٸ��ϴ�");
		}
		
		
		
	}
	
}


