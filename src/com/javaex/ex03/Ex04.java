package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Scanner sc = new Scanner(System.in);
	
	System.out.print("�ٹ��ð� : ");
	int a = sc.nextInt();
			
	
	
	if(a<=0){
		System.out.println("�߸��� ���Դϴ�." );
	}
	
	else if(a<=8){
		System.out.println("�ӱ��� "+a*10000+" �Դϴ�." );
	}
	
	else{
		System.out.println("�ӱ��� "+(a*10000+(a-8)*12000)+" �Դϴ�." );
	}
	
	
	
	
	sc.close();
	
	
	
	}

}
