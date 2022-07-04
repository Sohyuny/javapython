package ex0630;

public class EX01 {
	
	public static void main(String[] args) {
		
		int num =0;
		while (num<5) {//5미만까지만 반복
			System.out.println("num =" + num);
			num = num+2; //1씩 증가
		}
		
		for (int num1=0;num1<5;num1 = num1+2) {
			System.out.println("num1 = "+num1);
			
		}
	}

}
