package com.javaex.ex05;

// java Ex11 --> Ex11.clss
// java Ex11 i am kang sa rang


//java --> String[] args = new String[5];
public class Ex11 {

	
	
	public static void main(String[] args) {
		
		if(args.length > 0) { 
			if(args[0].equals("-vesion")) { // // Ex11-version
				System.out.println("Ex11 ���� : 3.4343");
			}else if(args[0].equals("-help")) { // // Ex11-help
				System.out.println("���ݺ��� ���� ��¼�� ��¼��");
				System.out.println("[-vesion] : ���������� Ȯ���� �� �ֽ��ϴ�.");
				System.out.println("[-help] : ������ �� �� �ֽ��ϴ�");
		}else { //// Ex11 i am kang sa rang
			for(int i = 0; i<args.length; i++) {
				System.out.println(args[i]);
			}
		}
		
		
		}
		
		
		/*
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		 */
	
	
	
	}

}
