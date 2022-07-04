package ex0701;

/*매개변수가 있는 함수 do(int a)
 * 
*/
public class ex03 {
	public static void main(String[] args) {
		doA();
		int result = doB();
		System.out.println("result ="+result);
		double dd = doC();
		System.out.println("dd ="+dd);
		String ee = doD();
		System.out.println("ee ="+ee);
	}
	
	public static void doA() {
		System.out.println("doA");
		return;
		
	}
	
	public static int doB() {
		System.out.println("doB");
		return 10;
		
	}
	
	public static double doC() {
		return 10.4;
	}
	
	public static String doD() {
		return "doD";
	}

}
