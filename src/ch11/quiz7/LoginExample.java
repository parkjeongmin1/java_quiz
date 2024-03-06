package ch11.quiz7;

public class LoginExample {
    public static void main(String[] args) {
        try {
            login("white", "12345");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            login("blue", "54321");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void login(String id, String password) throws Exception{
        if (!id.equals("blue")){
            throw new NotExistIDExcapetion("아이디가 존재하지 않습니다.");
        }

        if (!password.equals("12345")){
            throw new WrongPasswordException("패스워드가 틀립니다.");
        }
    }
}
