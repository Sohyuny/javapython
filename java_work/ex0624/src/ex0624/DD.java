package ex0624;

public class DD {
	
	public static void main(String[] args) {
		
		final int AA = 10; //final 때문에 AA변수는 딱 한번만 지정
		final String CC = "문자열";
		
		System.out.println("AA = "+AA);
		System.out.println("CC = "+CC);
		
		System.out.println("안녕하시요\n");
		System.out.println("안녕하세요\t박명희입니다");
		System.out.println("안녕하세요");
		System.out.println("\'안녕하세요\'");
		System.out.println("\"안녕하세요\"");
		System.out.println("\\안녕하세요\\");
		
		/*
		 * <한번만 설정>
		 * git init 현재폴더를 git으로 초기화
		 * git config email.name
		 * git remot add 주소 
		 * 
		 * <할때마다 설정>
		 * git add . 현재폴더밑에 있는 변경된 파일을 올리것
		 * git commut -m "20"  메시지 남기고 승인
		 * git push origin main 서버로 업로드
		 * 
		 */
	}
	

}
