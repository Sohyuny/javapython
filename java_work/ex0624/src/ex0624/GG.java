package ex0624;

public class GG {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		
		System.out.println(num1<num2 && num2<num3);
		System.out.println(num1>num2 && num2<num3);
		
		/*
		 * num1<num2<num3 이런식으로는 불가능 중간에 &&(그리고) ||(or) 필요
		 */
		
		System.out.println(!true); // !는 부정
	}

}
