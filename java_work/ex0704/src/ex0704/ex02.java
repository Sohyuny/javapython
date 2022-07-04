package ex0704;
//145페이지
import java.security.DomainCombiner;

public class ex02 {
	
	public static double carea(double r) {
		return r*r*3.14;
		
	}
	public static double cround(double r) {
		return 2*3.14*r;
		
	}
	
	public static void main(String[] args) {
		System.out.println("carea(3)="+carea(3));
		System.out.println("cround(3)="+cround(3));
	}

}
