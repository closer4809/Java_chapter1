package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		// int numA = 3;
		// int numB = int A;


	int[] arrA = new int[3];
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
	for(int i = 0; i<arrA.length; i++) {
		System.out.println(arrA[i]);
		}
	
	
	System.out.println("=========================");
	
	int[] arrB = arrA;
	

	for(int i = 0; i<arrB.length; i++) {	
		System.out.println(arrB[i]);
		}
	
	System.out.println("===========================");
	//arrA[1] : 6-->100���� �� ����
	//arrA[1] ����Ȯ�� arrB[1]�� ���� Ȯ��
	
		arrA[1] = 100;
	
		for(int i = 0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
			}
		
		for(int i = 0; i<arrB.length; i++) {	
			System.out.println(arrB[i]);
			}
	
		
		
	// �迭�� ���� ���ԵǴ°� �ƴ϶�, ���ÿ����� �ּҰ� �Էµȴ�. �׷��� arrA�� arrB�� ���ٰ� �ָ� �ּҰ��� ����ȴ�.
	
	
	
	
	}

}
