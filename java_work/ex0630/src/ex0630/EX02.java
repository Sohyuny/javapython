package ex0630;

public class EX02 {
	
	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {//i가 0에서 10까지 1씩 증가함
			if(i==5) {//i가 5되면 브레이크
				break;
			}
			if (i==2) {
				continue;
			}
			System.out.println("i = "+i);
		}
	}

}
