package ex0627;

public class EX01 {
	public static void main(String[] args) {
		
		//변수 선언
		//변수의 사용 용도에 따라
		//int double String boolean
		//형 변환 자동형변환 수동형변환
		int a=10;
		double b=a;
		
		double c = 30.44;
		int d = (int)c;  //int는 4바이트, double은 8바이트라서 큰 비트를 작은 비트르에 넣으면... 4비트 되냐?
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		System.out.println("(3+4)*5 = " +(3+4)*5);
		System.out.println("3*4 = " +3*4);
		
		int num=3;
		System.out.println("3>4 ="+(3>4&& (num+=3)<3));
		System.out.println("num = "+num);
		System.out.println("3>4 =" +(3>4||(num+=3)<3));
		System.out.println("num =" +num);
		
	
	}

}
