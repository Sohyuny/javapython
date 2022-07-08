package ex0708;

public class EX03 {
	public static void doA() {
		System.out.println("DoA 메서드");
	}
	public void doB() {
		System.out.println("DoB 메서드");
	}
	public static void main(String[] args) {
		EX03.doA();
		//doB메서드 static 아니라서 호출 불가
		//메모리 영역에 할당해야함 그래서 참조변수로 호출 해야함
		EX03 ex03=new EX03();
		ex03.doB();
	}

}
