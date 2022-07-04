package TEST;

public class test06_1_2 {
	
	public static void function(int num1, int num2) {
		if (num1>num2) {
			int result= num1-num2;
			System.out.println(result);
		}
		else {
			int result = num2-num1;
			System.out.println(result);
		}
	}
	
	public static void main(String[] args) {
		function(23,63);
	}

}
