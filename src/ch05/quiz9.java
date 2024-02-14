package ch05;

public class quiz9 {
    public static void main(String[] args) {
        //주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성해보세요(힌트: 중첩 for 문 이용)
        //
        //int[][] array = {
        //      {95, 86},
        //      {83, 92, 96},
        //      {78, 83, 93, 87, 88}
        //};

        int[][] array = {
                      {95, 86},
                      {83, 92, 96},
                      {78, 83, 93, 87, 88}
                };

        int sum = 0;
        double avg = 0.0;

        int cnt = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
           cnt += array[i].length;
        }
        avg = (double)sum / cnt;

        System.out.println("합: " + sum + ", " + "평균: " + avg);
    }
}
