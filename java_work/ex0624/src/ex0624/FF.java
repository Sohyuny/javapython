package ex0624;

public class FF {
	
	public static void main(String[] args) {
		
		int a = 7;
		int b = 3;
		System.out.println("정수형 연산 a/b ="+a/b);
		System.out.println("실수형 연산 a/b = "+(double)a/b); //double형으로 형변환해서(8바이트로 바뀜) 그러면 8바이트/4바이트인데 큰걸로 맞춰줌 8바이트 계산
		System.out.println("실수형 연산 a/b = "+(int)(double)a/b); //int로 또다시 강제 형변환
	}

}
