package ex0704;

import java.util.Scanner;

public class ex01 {
	/*
	 * 142페이지 문제6-2
	 */
	
	public static void ABS(int fi, int se) {
		if(fi>se) {
			System.out.println("절댓값은 = "+(fi-se));
		}
		else {
			System.out.println("절댓값은 = "+(se-fi));
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 수 입력 ");
		int fi = scan.nextInt();
		System.out.println("fi ="+fi);
		
		System.out.println("두번째 수 입력 ");
		int se = scan.nextInt();
		System.out.println("se ="+se);
		
		ABS(fi,se);
		
	}

}
