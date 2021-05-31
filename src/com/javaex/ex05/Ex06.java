package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = new int[3];
		
		intArray[0] = 52;
		intArray[1] = 13;
		//intArray[2] = 41; 초기화 하지 않으면 0으로 세팅(정수형)
							//실수형, boolean, char 기본값 알아보겟음
		
		System.out.println("=============");
		System.out.println(intArray.length);
		System.out.println("=============");
		
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	
		System.out.println("=============");
		//ArrayIndexOutOfBoundsException --> 없는 방을 사용하려고 할때
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	
		
	}

}
