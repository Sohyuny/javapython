package ex0708;

class Point {
	int xPos,yPos;
	public Point(int xPos, int yPos) {
		this.xPos=xPos;
		this.yPos=yPos;
	}
	public void showPointInfo() {
		System.out.println("["+xPos+","+"]");
	}
}
public class Circle {
	Point point;
	int r;
	public Circle(int i, int j, int k) { //3.
		point=new Point(i,j);//4.서클 안에 새로운 클래서 포인트
		this.r=k;
	}
	
	private void showCircleInfo() {
		System.out.println("반지름 r ="+this.r);
		point.showPointInfo();
	}

	public static void main(String[] args) {//1. 메인함수 호출
		Circle circle = new Circle(2,3,4); //2. 생성자 호출
		circle.showCircleInfo();	
	}
	
}

