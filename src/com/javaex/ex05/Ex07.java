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
	//arrA[1] : 6-->100으로 값 변경
	//arrA[1] 변경확인 arrB[1]도 변경 확인
	
		arrA[1] = 100;
	
		for(int i = 0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
			}
		
		for(int i = 0; i<arrB.length; i++) {	
			System.out.println(arrB[i]);
			}
	
		
		
	// 배열은 값이 대입되는게 아니라, 스택영역에 주소가 입력된다. 그래서 arrA와 arrB를 같다고 주면 주소값이 복사된다.
	
	
	
	
	}

}
