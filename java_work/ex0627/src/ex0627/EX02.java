package ex0627;

public class EX02 {
	
	public static void main(String[] args) {
		
		int num=5;
		System.out.print((num++)+" ");  // 출력후에 값 증가
		System.out.print((num++)+" "); //println에서 ln 없으면 딱 붙어서 출력됨
		System.out.print(num+"\n");
		
		System.out.print((num--)+" "); //출력후 값 감소
		System.out.print((num--)+" ");
		System.out.print(num);
		
	}

}
