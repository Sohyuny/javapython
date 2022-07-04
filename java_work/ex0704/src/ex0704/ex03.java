package ex0704;
//페이지 154 6-3 1번

public class ex03 {
	
	public static void main(String[] args) {
		int result = doA(3);
		System.out.println("result = "+result);
		result = doA(5);
		System.out.println("result = "+result);
	}
	/*
	 * doA(3) 을 호출하면 2*doA(3-1) 값으로 나옴
	 * doA(2) 호출하ㅏ면 1이 호출 됨
	 * doA(3)
	 * 2*doA(2)
	 * 2*2*doA(1)
	 * 2*2*doA(0)
	 * 2*2*2*1
	 */
	
	public static int doA(int n) {
		if (n==0)
			return 1;
		else
			return 2*doA(n-1);
		
	}

}
