package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner sc = new Scanner(System.in);
			
	System.out.println("���� �Է��ϼ���.");
	int a = sc.nextInt();
	
	switch (a) {
	/*
	 case 1 : System.out.println("31�� �Դϴ�");
	 break; 
	 
	 case 2 : System.out.println("28�� �Դϴ�");
	 break;
	 
	 case 3 : System.out.println("31�� �Դϴ�");
	 break;
	 
	 case 4 : System.out.println("30�� �Դϴ�");
	 break;
	 
	 case 5 : System.out.println("31�� �Դϴ�");
	 break;
	 
	 case 6 : System.out.println("30�� �Դϴ�");
	 break;
	 
	 case 7 : System.out.println("31�� �Դϴ�");
	 break;
	 
	 case 8 : System.out.println("31�� �Դϴ�");
	 break;
	 
	 case 9 : System.out.println("30�� �Դϴ�");
	 break;
	 
	 case 10 : System.out.println("31�� �Դϴ�");
	 break;
	 
	 case 11 : System.out.println("30�� �Դϴ�");
	 break;
	 
	 case 12 : System.out.println("31�� �Դϴ�");
	 break; 
	*/
	
	//������� §�� ��Ģ�� ã�Ƽ� ���ϼ� �ִ�!!!
	case 4:
	case 6:
	case 9:
	case 11:
		System.out.println("30��");
		break;
	
	case 2:
		System.out.println("28��");
		break;
		
	default:
		System.out.println("30��");
	}
	
	
	
	
	
	sc.close();
	
	
	
	
	}

}
