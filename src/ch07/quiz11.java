package ch07;

public class quiz11 {
    public class Activity {
        public void onCreate() {
            System.out.println("기본적인 실행 내용");
        }
    }

    public class MainActivity extends Activity {
        @Override
        public void onCreate() {
               super.onCreate();
            System.out.println("추가적인 실행 내용");
        }
    }

    //정답: super

}
