package ch06;

public class quiz18 {
    public class Example
    {
        int iv = 10;
        static int cv = 20;
        int iv2 = cv;
//        static int cv2 = iv; // 첫번째 컴파일 에러  : static 변수의 초기화에 인스턴스변수를 입력할수 없다.


        static void staticMethod1() {
            System.out.println(cv);
//            System.out.println(iv); // 두번째 컴파일 에러  : static 메서드에서 인스턴스 변수를 사용할수 없다.
        }


        void instanceMethod1() {
            System.out.println(cv);
            System.out.println(iv);
        }


        static void staticMethod2() {
            staticMethod1();
//            instanceMethod1();   // 세번째 컴파일 에러   : static메서드에서 인스턴스 메서드를 사용할 수 없다.
        }


        void instanceMethod2() {
            staticMethod1();
            instanceMethod1();
        }
    }

}
