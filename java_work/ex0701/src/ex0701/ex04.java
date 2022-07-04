package ex0701;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ex04 {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in); //파이썬에서는 인풋임
		System.out.println("첫번째수 입력");
		int num1 = scan.nextInt();
		System.out.println("두번째수 입력");
		int num2=scan.nextInt();
		division(num1,num2);
	}
	
	
	public static void division(int n1,int n2) {
		if (n2==0) {
			System.out.println("0으로 나눌수 없다");
			return;
		}
		System.out.println("n1/n2 ="+n1/n2);
	}

}
