package TEST;

public class test06_1_1 {
	public static void function(int num1,int num2) {
		int sum =num1+num2;
		int sub =num1-num2;
		int mul = num1*num2;
		int div_1 = num1/num2;
		int div_2 = num1%num2;
		System.out.println("합:"+sum);
		System.out.println("차:"+sub);
		System.out.println("곱:"+ mul);
		System.out.println("몫:"+div_1);
		System.out.println("나머지:"+div_2);
	}
	public static void main(String[] args) {
		function(10,2);

	}

}
