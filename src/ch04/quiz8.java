package ch04;

public class quiz8 {
    public static void main(String[] args) {
//      int sum = 0;
//        for (int i=1; i<=5; i++){
//            for (int x=1; x<=5; x++){
//                if (i >= x){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
                if(j == i) System.out.println();
            }
        }
    }
}
