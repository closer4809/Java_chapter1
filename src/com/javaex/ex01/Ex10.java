package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {
		
		
		//��������
		int a = 5;
		int b = 7;
		
		//�������� �⺻ &&
		System.out.println("&&������=========================");
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		//�������� �⺻ ||
		System.out.println("||������=========================");
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);

		//�������� ����
		System.out.println("�������� ����=========================");
		System.out.println((a>b)&&(a<b)); // 5>7 --> f  5<7 --> t f&&t --> f
		System.out.println((a>b)&&(a>b)); // 5>7 --> f  5?7 --> t f&&f --> f
		System.out.println((a>b)||(a<b)); // 5>7 --> f  5<7 --> t f||t --> t
		System.out.println((a>b)||(a<b)&&(a<b)); // 5>7 --> f  5<7 --> t f||t --> t   5<7--->t  t&&t-->t
		System.out.println((a>b)&&(a<b)||(a<b)); // 5>7 --> f  5<7 --> t f&&t -->f        "     t||t-->t
	
		System.out.println((a>b)&&(a<b)&&(a<b)); // 5>7 --> f  5<7 --> t f&&t -->f	 5<7--->t  f&&t-->f
		
		//�������� �⺻ !
		System.out.println("!������=========================");
		System.out.println(a<b); // 5<7 -->true
		System.out.println((a>b)&&(a<b)); // f && t --> f
		System.out.println(!(     (a>b)&&(a>b)     )); //!( f && f )-->  !f --> t
		
		System.out.println((a>b)&&!(a>b)); // f && !f --> f && t --> f
		System.out.println(!(a>b)&&!(a>b)); // !f && !f --> t && t --> t
		
	}
}
