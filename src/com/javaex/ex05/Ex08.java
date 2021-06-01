package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {
		
		int[] arrA = new int[3]; //A 메모리 잡고 세칸 값 줫음
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		for(int i = 0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("======================");
		
		int[] arrB = new int[3];	//B도 메모리 잡앗음
		
		for(int i = 0; i<arrA.length; i++) {	//근데 B값은 A값과 동일, 고로 A값이 B값으로 옮겨감 
			arrB[i] = arrA[i];	
		}
	
		
		for(int i = 0; i<arrA.length; i++) {
			System.out.println(arrB[i]);
		
		}
		
		System.out.println("======================");
		
		for(int i = 0; i<arrA.length; i++) {	
			System.out.println(arrB[i]);	
		}
	
		System.out.println("======================");
		//arrA[1] ->
		arrA[1] = 100;	//A값을 100으로 바꿔줌
		
		for(int i=0; i<arrA.length; i++) { 
			System.out.println(arrA[i]);
		}
		System.out.println("======================");
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrB[i]);
		}
	}

}
