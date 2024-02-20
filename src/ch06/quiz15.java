package ch06;

public class quiz15 {
    boolean login(String id, String password) {
        if(id == "hong" && password == "12345"){
            return true;
        }else{
            return false;
        }
    }
    void  logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }

    public static void main(String[] args) {
        quiz15 memberService = new quiz15();
        boolean result = memberService.login("hong", "12345");
        if (result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
            return;
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}


