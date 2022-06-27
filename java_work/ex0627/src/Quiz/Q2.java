package Quiz;

public class Q2 {
	
	public static void main(String[] args) {
		
		int n1=50;
		int n2=100;
		int big;
		int diff;
		
		if (n1>n2) {
			big=n1;
			diff=n1-n2;
			System.out.println("큰 수 : "+big);
			System.out.println("절댓값 : "+diff);
		}
		else {
			big=n2;
			diff=n2-n1;
			System.out.println("큰 수 : "+big);
			System.out.println("절댓값 : "+diff);
		}
			
		
	}

}
