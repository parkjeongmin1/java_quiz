package ch11.quiz7;

public class NotExistIDExcapetion extends Exception{
    public NotExistIDExcapetion(){}
    public NotExistIDExcapetion(String message) {
        super(message);
    }
}
