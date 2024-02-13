package ch04;

public class quiz1_6 {
    public static void main(String[] args) {
        int year = 800;
        boolean result = true;

     if ( year%400==0 || year%4==0 && year%100!=0){
         System.out.println(result);
     }else {
         System.out.println(!result);
     }
    }
}
