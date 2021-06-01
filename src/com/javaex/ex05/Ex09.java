package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//두 배열이 같은지 판단
		int[] arrA = new int[3];
		arrA[0] = 10;
		arrA[1] = 20;
		arrA[2] = 30;
		
		int[] arrB = new int[3];
		arrB[0] = 100;
		arrB[1] = 70;
		arrB[2] = 30;
	
		
		//배열 A 배열 B 같은지 판단 --> 배열의 개수가 같아야한다, 값이 순서가 같아야 한다.
		
		if(arrA.length == arrB.length) { //배열의 개수가 같다
			//첫번째 부터 값 비교
			for(int i=0; i<arrA.length; i++) { 
			
				if(arrA[i] != arrB[i]) {
					System.out.println(i+"번째 값이 다릅니다.");
				}
			}
		}else {
			System.out.println("배역의 크기가 다릅니다");
		}
		
		
		
	}
	
}


