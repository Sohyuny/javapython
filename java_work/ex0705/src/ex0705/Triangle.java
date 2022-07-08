package ex0705;

public class Triangle {
	double height;
	double base;
	double area;
	public Triangle(int a, int b) {
		height=a;
		base=b;
		area=a*b/2;
	}
//	public void area(int a, int b) {
//		double area=a*b/2;
//	}
	public void printarea() {
		System.out.println("밑변 : "+base+"cm");
		System.out.println("높이 : "+height+"cm");
		System.out.println("삼각형 넓이 : "+area+
				"cm^2");
	}
	
		


}
