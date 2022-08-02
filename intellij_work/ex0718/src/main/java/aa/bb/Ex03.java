package aa.bb;

public class Ex03 {

    public static void main(String[] args) {
        md1( 3);

    }

    private static void md1(int i){
        md2(i, 0);
    }

    private static void md2(int i, int i1){
        try{
            System.out.println(i/i1);
        }catch (Exception e){
            System.out.println("예외처리");
        }

    }
}
