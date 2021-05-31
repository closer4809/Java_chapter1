package com.java.ex05;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//세부문법
		/*
		int[] intArray = new int[3];
		
		intArray[0] = 52;
		intArray[1] = 13;
		intArray[2] = 41;
		*/
		
		 // 배열선언과 동시에 값 입력가능, but 방번호는 안 써줘야함 근데 이렇게 안씀???!?
		int[] intArray = new int[] {52, 13, 41};
		//int[] intArray = {11, 3, 78};//추천하지 않음, 약식
		
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	
	}

}
