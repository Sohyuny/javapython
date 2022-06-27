package ex0627;

public class EX06 {
	
	public static void main(String[] args) {
		
		int n1=10;
		int n2=20;
		
		//상황연산자 [조건?수1:수2] -> 조건이 ture라면 수1 반환, false라면 수2 반환
		
		int result=n1<n2?n1:n2  ;
		System.out.println("result =" +result);
		
	
		result=n1>n2?n1:n2;
		System.out.println("result = "+result);
	}

}
