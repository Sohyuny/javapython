package ex0701;

public class EX05 {
	
	public static void main(String[] args) {
		boolean a =true;
		
		if(a)
		{
			System.out.println("a = "+a);
			boolean b = false;
		}
		System.out.println("b = "+b); //스코프 밖이라서 b는 변수로 취급 안됨
	}

}
