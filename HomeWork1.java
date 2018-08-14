/*
*Java level 1. Lesson 1. HomeWork
 @author Maxim Rechi on 14 .08.2018	
*/

public class HomeWork1 {	
	public static void main (String[] args) {
		
		//test metod summary
		System.out.println(summary (2, 4, 5, 6));
		
		// test metod compare summ
		System.out.println (checkSumm(3,4));
		
		// check compare number
		System.out.println  (compNumb(5));
		
		// check SayHello
		sayHello("Andrew");

		
	}
	public static void param (){
		byte b = 12;
		short s = 90;
		int i = 9;
		long l = 5808L;
		float f = 31.67f;
		double d = 12.11;
		boolean bool = true;
		char c = 'A';
	}
	
	public static double summary (double a, double b, double c, double d) {
		double e = a * (b + c / d);
		return e;
	}
	
	public static boolean checkSumm (double a, double b) {
		if (a + b >=10 && a + b <= 20) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static void checkNumer (int a){
		if (a >= 0){
			System.out.println("Plus number");
		}
		else {
			System.out.println("Minus numer");
		}
	}
	
	//после разъяснения понял, возвращается true, если условие выполняется. просто оказывается.
	static boolean compNumb (int a) {
		return 0 < a;
	}
	
				
	static void sayHello (String n)	 {
		System.out.println ("Hello, " + n + "!");
	}
}	
	

	
			
			
	

		


