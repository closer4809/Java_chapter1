package com.java.ex05;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] no = new int[6];	//갯수

		for(int i=0; i<6; i++) {
			no[i] = (int)(Math.random()*45)+1;
		}
		
		
	
		for(int i=0; i<6; i++) { // 출력	방 개수 조심!
			System.out.println(no[i]);	
		}
	
	
	}

}
