package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] arg) {
		
		int i = 2345;
		double d = 3.14;
		String str = "±Â¸ð´×";
		char c = 'ÇÑ';
		String s = "ÇÑ";
		
		String name = "°­»ç¶û";
		
		
		
		
		
		
		
		System.out.println("¾È³çÇÏ¼¼¿ä");
		System.out.println(str);
		System.out.println("str");

		System.out.println(i);
		System.out.println("i");
		System.out.println('i');
		System.out.println("ii");
		
		System.out.print("¾È³ç");
		System.out.println("ÇÏ");
		
		System.out.println("==================");
	
		System.out.println(i);
		System.out.println(i+i);
		
		System.out.println(str);
		System.out.println(str+str);   
		System.out.println(str+i);  // "±Â¸ð´×" + 2345 -> "±Â¸ð´×" + 2345
		System.out.println(str+d);  // "±Â¸ð´×" + 3.14 -> "±Â¸ð´×" + 3.14
	
		System.out.println(str+" ÀÌ¶û "+i+" ´Ù ");
		System.out.println(str+"  "+i+" ´Ù ");
		//ÁÖÀÇ
		
		System.out.println(c);
		System.out.println(c+c); //ÄÚµå·Î Ç¥ÇöµÊ
		System.out.println(s+s);
		System.out.println(c+s);
		
		System.out.println("Á¦ÀÌ¸§Àº " + name + " ÀÔ´Ï´Ù.");
		
		System.out.println("¾È³çÇÏ¼¼¿ä"); //¾È³çÇÏ¼¼¿ä
		System.out.println("¾È³ç'ÇÏ'¼¼¿ä"); // ¾È³ç'ÇÏ'¼¼¿ä
		System.out.println("¾È³ç\"ÇÏ\"¼¼¿ä"); // ¾È³ç"ÇÏ"¼¼¿ä
		System.out.println("¾È³ç\\ÇÏ\\¼¼¿ä"); // ¾È³ç\ÇÏ\¼¼¿ä
		System.out.println("¾È³ç\tÇÏ\t¼¼¿ä");
	
	}
}
