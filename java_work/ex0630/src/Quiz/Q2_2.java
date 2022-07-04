package Quiz;

public class Q2_2 {
	public static void main(String[] args) {
		int num=1;
		int sum=0;
		while (true) {
			sum+=num;
			num+=2; //홀수
			if(sum>1000)
				break; //break를 만나면 가장가까운 while구문 탈출
		}
		System.out.println(sum);
			
			
	
	}

}
