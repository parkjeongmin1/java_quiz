package ch06;

public class quiz22 {
    final static int MIN_BALANCE = 0;
    final static int MAX_BALANCE = 1000000;
    int balance = 0;

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
            this.balance = balance;
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        quiz22 account = new quiz22();

        account.setBalance(10000);
        System.out.println("현재 잔고 : "+ account.getBalance());

        account.setBalance(-100);
        System.out.println("현재 잔고 : "+ account.getBalance());

        account.setBalance(2000000);
        System.out.println("현재 잔고 : "+ account.getBalance());

        account.setBalance(300000);
        System.out.println("현재 잔고 : "+ account.getBalance());

    }
}
