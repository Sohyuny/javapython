package ex0706;
import java.util.Scanner;
public class ex05 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Car c1=new Car();
		while(true) {
			System.out.println("1. 속도입력");
			System.out.println("2. 속도출력");
			int select = scanner.nextInt();
			if (select==1) {
				System.out.println("속도입력?");
				int speed=scanner.nextInt();
				c1.setSpeed(speed);
			}else {
				int speed=c1.getSpeed();
				System.out.println("현재속도는 "+speed);
			}
		
		}

	}

}
