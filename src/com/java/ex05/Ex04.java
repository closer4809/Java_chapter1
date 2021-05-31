package com.java.ex05;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//방갯수 변경될때 for문에서 개수 부분을 변경해줘야함
		
		int[] no = new int[8];	//갯수 6--> 8
		
		
		for(int i=0; i<no.length; i++) {	// 입력은 수동으로 넣어줘라~ 운이 좋아서 가능
			no[i] = (int)(Math.random()*45)+1;
		}
		
		System.out.println(no.length); //no.length -->알아서 방의 최대값 입력
		
		System.out.println("===============");
		
		for(int i=0; i<no.length; i++) {
			System.out.println(no[i]);
		}
		
		System.out.println("===============");	
	
		for(int i=0; i<no.length; i++) {
			System.out.println(no[i]);	//출력할 방이 적으면 정상적으로 출
		}								//but 많아지면 오류 
	
		
	}

}
