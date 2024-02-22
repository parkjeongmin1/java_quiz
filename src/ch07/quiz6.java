package ch07;

public class quiz6 {
    public class Parent {
        public String name;

        public Parent(String name) {
            this.name = name;
        }
    }

//    public class Child extends Parent {
//        public int studentNo;
//
//        public Child(String name, int studentNo) {
//
//            this.name = name;
//            this.studentNo = studentNo;
//        }
//    }

//정답: 부모생성자를 자식객체로 생성하여 실행할때  super() 키워드를 사용해야 한다.

    //Child.java 에서 this.name = name; 라인 삭제 / super(name); 코드 작성.
}
