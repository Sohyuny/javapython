package Quiz;

public class q05_4_3 {
	
	public static void main(String[] args) {
		int num=1;
		int sum=0;
		
		while(num<1001) {
			if(num%2==0) {
				System.out.println("num="+num);
				sum=sum+num;
			}
			num+=1;
		}
		System.out.println("sum="+sum);
	}

}
