package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] arg) {
		
		int i = 2345;
		double d = 3.14;
		String str = "�¸��";
		char c = '��';
		String s = "��";
		
		String name = "�����";
		
		
		
		
		
		
		
		System.out.println("�ȳ��ϼ���");
		System.out.println(str);
		System.out.println("str");

		System.out.println(i);
		System.out.println("i");
		System.out.println('i');
		System.out.println("ii");
		
		System.out.print("�ȳ�");
		System.out.println("��");
		
		System.out.println("==================");
	
		System.out.println(i);
		System.out.println(i+i);
		
		System.out.println(str);
		System.out.println(str+str);   
		System.out.println(str+i);  // "�¸��" + 2345 -> "�¸��" + 2345
		System.out.println(str+d);  // "�¸��" + 3.14 -> "�¸��" + 3.14
	
		System.out.println(str+" �̶� "+i+" �� ");
		System.out.println(str+"  "+i+" �� ");
		//����
		
		System.out.println(c);
		System.out.println(c+c); //�ڵ�� ǥ����
		System.out.println(s+s);
		System.out.println(c+s);
		
		System.out.println("���̸��� " + name + " �Դϴ�.");
		
		System.out.println("�ȳ��ϼ���"); //�ȳ��ϼ���
		System.out.println("�ȳ�'��'����"); // �ȳ�'��'����
		System.out.println("�ȳ�\"��\"����"); // �ȳ�"��"����
		System.out.println("�ȳ�\\��\\����"); // �ȳ�\��\����
		System.out.println("�ȳ�\t��\t����");
	
	}
}
