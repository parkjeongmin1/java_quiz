package ch05;

public class quiz8 {
    public static void main(String[] args) {
        //        주어진 배열 항목에서 최대값을 출력하는 코드를 작성해보세요(힌트: for 문 이용)

        int[] array = { 1, 5, 3, 8, 2 };

        int max = array[0];

        for (int num:array){
            if(num>max){
                max = num;
            }
        }
        System.out.println(max);

    }
}
