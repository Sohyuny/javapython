package ex0701;

public class ex06 {
	
	/*
	 * factorial(3)
	 * 3*factirial(2)
	 * 3*2*factorial(1)
	 * 3*2*1
	 * 
	 */
	
	public static int factorial(int n) {

		if (n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);//자기자신을 호출하였기 때문에 재귀적함수 호출이라 부름
		}
	}
	
	public static void main(String[] args) {
		System.out.println(factorial (3));
		System.out.println(factorial (6));
	}

}
