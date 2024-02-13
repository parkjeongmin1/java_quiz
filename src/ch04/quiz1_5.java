package ch04;

public class quiz1_5 {
    public static void main(String[] args) {
        char ch = 'a';
        boolean result = true;

        if (ch>='A'&&ch<='Z'){
            System.out.println(result);
        }else if(ch>='a'&&ch<='z'){
            System.out.println(result);
        }else {
            System.out.println(!result);
        }
    }
}
