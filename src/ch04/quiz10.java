package ch04;

import java.util.Scanner;

public class quiz10 {
    public static void main(String[] args) {
//        boolean result = true;
//
//        int num = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        while (result){
//            System.out.println("==========================");
//            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//            System.out.println("==========================");
//            System.out.println("선택>");
//
//            int number = scanner.nextInt();
//            int money = 0;
//
//            switch (number) {
//                case 1:
//                    System.out.println("예금: ");
//                    money = scanner.nextInt();
//                    num += money;
//                    break;
//                case 2:
//                    System.out.println("출금: ");
//                    money = scanner.nextInt();
//                    num -= money;
//                    break;
//                case 3:
//                    System.out.println("잔고: " + num);
//                    break;
//                case 4:
//                    result = false;
//                    break;
//            }
//        }
//        System.out.println("프로그램 종료");

        boolean run = true;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);


        while (run) {
            System.out.println("--------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("--------------------------------");
            System.out.print("선택>  ");


            int menuNum = scanner.nextInt();


            switch (menuNum) {
                case 1:
                    System.out.print("예금액 > ");
                    balance += scanner.nextInt();
                    break;
                case 2:
                    System.out.print("출금액 > ");
                    balance -= scanner.nextInt();
                    break;
                case 3:
                    System.out.print("잔고 >  ");
                    System.out.println(balance);
                    break;
                case 4:
                    run = false;
                    break;
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");

    }
}
