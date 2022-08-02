package aa.bb;

class PA{
    public void showInfo(){
        System.out.println("PA 메서드입니다.");
}

}

class CA1 extends PA{
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("C1 메서드 입니다.\n");
    }

    @Override
    public String toString() {
        return "CA1{}";
    }
}

class CA2 extends PA{
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("C2 메서드 입니다.");
    }

    @Override
    public String toString() {
        return "CA2{}";
    }
}


public class Main {
    public static void main(String[] args) {
        PA pa[] = new PA[5]; //메모리 영역을 다섯으로 나눈 것(그 안에 값은 아직 없음)
        System.out.println("pa[0] = "+pa[0]);

        pa[0] = new CA1();
        System.out.println("pa[0] = "+pa[0]);
        pa[1] = new CA2();
        System.out.println("pa[1] = "+pa[1]);

        System.out.println();
        pa[0].showInfo();
        pa[1].showInfo();


        pa[2] = new CA1();

        try { //예외가 발생하면 catch 쪽으로 넘어가면서 처리함

            CA1 ca1 = (CA1) pa[2];
            CA2 ca2 = (CA2) pa[2];

            System.out.println(ca1);
            System.out.println(ca2);
            System.out.println("여기까지 정상 실행");
        }catch (Exception e){
            System.out.println("에러 발생, 무시"+e);
        }

        System.out.println("프로그램 종료합니다.");
    }
}