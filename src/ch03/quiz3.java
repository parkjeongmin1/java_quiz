package ch03;

public class quiz3 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;
        int pencilsPerStudent = (pencils / students); //정수 연산결과는 항상 정수
        System.out.println(pencilsPerStudent); //학생 한 명이 가지는 연필 수

        int pencilsLeft = (pencils%students);
        System.out.println(pencilsLeft); //남은 연필 수

    }
}
