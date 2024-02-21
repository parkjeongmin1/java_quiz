package ch06;

import java.util.Scanner;

public class CustomerApplication {
    private static Customer[] customersArray = new Customer[50];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run){
            System.out.println("----------------------");
            System.out.println("1.고객등록 | 2.고객 리스트 | 3.포인트사용 | 4.포인트적립 | 5.종료");
            System.out.println("----------------------");
            System.out.println("선택> ");
            int selectNo = scanner.nextInt();
            if (selectNo == 1){
                createCustomer();
            }else if (selectNo == 2){
                customerList();
            }else if (selectNo == 3){
                pointuse();
            }else if (selectNo == 4) {
                accumulate();
            }else if (selectNo == 5){
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    //고객등록
private static void createCustomer(){
    System.out.println("-------------");
    System.out.println("고객 등록");
    System.out.println("-------------");
    System.out.print("고객명: ");
    String name = scanner.next();
    System.out.print("핸드폰번호: ");
    String phone = scanner.next();
    System.out.println("집주소: ");
    String juso = scanner.next();
    System.out.println("포인트: ");
    int point = scanner.nextInt();

    Customer newCustomer = new Customer(name, phone, juso, point);

    for (int i = 0; i < customersArray.length; i++) {
        if (customersArray[i] == null){
            customersArray[i] = newCustomer;
            System.out.println("결과: 고객 등록이 완료되었습니다.");
            break;
        }
    }
}
    //모든 고객 리스트 확인
private static void customerList(){
    System.out.println("------------");
    System.out.println("모든 고객 리스트");
    System.out.println("------------");

    for (int i = 0; i < customersArray.length; i++) {
        Customer customer = customersArray[i];

        if (customer != null) {
            System.out.print(customer.getName());
            System.out.print(" ");
            System.out.print(customer.getPhone());
            System.out.print(" ");
            System.out.print(customer.getPoint());
            System.out.println();
        }
    }
}
    //포인트사용 (500점 이상부터 사용가능)
private static void pointuse(){
    System.out.println("------------");
    System.out.println("포인트 사용");
    System.out.println("------------");
    System.out.print("핸드폰번호: ");
    String phone = scanner.next();
    System.out.println("사용할 포인트: ");
    int point = scanner.nextInt();

    Customer customer = useCustomer(phone);

    if (customer == null){
        System.out.println("결과: 포인트가 없습니다.");
        return;
    } else if(customer.getPoint() < 500){
        System.out.println("포인트 500점부터 사용 가능합니다.");
        return;
    }


    customer.setPoint(customer.getPoint() - point);
    System.out.println("결과: "+ point + "만큼 포인트 차감되었습니다.");
    System.out.println("남은 포인트: " + customer.getPoint());
}
    //포인트 적립 (2000점 이상일때 10% 추가적립)
private static void accumulate(){
    System.out.println("---------------");
    System.out.println("적립하기");
    System.out.println("---------------");
    System.out.print("핸드폰 번호: ");
    String phone = scanner.next();
    System.out.print("적립금액: ");
    int point = scanner.nextInt();

    Customer customer = useCustomer(phone);
    if (customer == null){
        System.out.println("결과: 등록된고객이 아닙니다.");
        return;
    } else if (point >= 2000) {
        System.out.println("포인트 10% 추가적립 되었습니다.");
        customer.setPoint(customer.getPoint() + (int)(point*1.1));

        return;
    } else {
        customer.setPoint(customer.getPoint() + point);
        System.out.println("결과: 포인트적립이 완료되었습니다.");
        return;
    }



}
    //핸드폰 번호로 해당 고객 객체 찾기
    private static Customer useCustomer(String phone){
        Customer customer = null;
        for (int i = 0; i < customersArray.length; i++) {
            if(customersArray[i] != null){
                String dbphone = customersArray[i].getPhone();
                if (dbphone.equals(phone)){
                    customer = customersArray[i];
                    break;
                }
            }
        }
        return customer;
    }
}
