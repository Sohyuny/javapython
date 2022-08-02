package aa.bb;
interface AA{
    int AAA = 345;
    void doA();
}
class AAA implements AA{ //interface를 상속받을때는 implements


    @Override
    public void doA() {
        System.out.println("AAA 클래스 안에 doA 메서드");
    }
}
/*
    1. class 를 만들고 상속받아 재정의 하는 방법
    2. new AA() 인터페이스 생성과 동시에 메서드를 재정의 하는 방법
 */
public class Ex01 {
    public static void main(String[] args) {

        System.out.println(AA.AAA);
        AAA a1 = new AAA();
        a1.doA();//상속받아서 재정의


        //2번 방법
        new AA(){
            @Override
            public void doA() {
                System.out.println("AA 인터페이스 안에 doA 메서드");

            }
        }.doA();

        AA a3 = () ->{
            System.out.println("a3 람다 안에 doA메서드");
        };
        a3.doA();

        /*
        AA a2 = new AA(){
        @Override
            public void doA() {
                System.out.println("AA 인터페이스 안에 doA 메서드");

            }
        };
        a2.doA()'
         */

    }
}
