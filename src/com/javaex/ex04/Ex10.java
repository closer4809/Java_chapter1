package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		for(int a = 1; a<=20; a++) {
			if (a%2 == 0 || a%3 == 0 ) {
				continue;
				}	
			System.out.println(a);
		
		}	
	
	System.out.println("===============================");
	
	for(int i=1; i<=20; i++) {
		if(i%2==0 || i%3==0) {
			
		}
		else {
			System.out.println(i);
		}
	
	}
	
	
	System.out.println("================================");
	
	for(int i=1; i<=20; i++) {
		if(!(i%2==0 || i%3==0)) {
			System.out.println(i);
		}
	}
	
	
	}

	
}
