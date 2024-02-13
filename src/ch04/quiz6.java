package ch04;

public class quiz6 {
    public static void main(String[] args) {
        for (int i=1; i<=6; i++){
            for (int x=1; x<=6; x++){
                if(i+x == 6){
                    System.out.println("i: "+i +", "+"x: "+x);
                }
            }
        }
    }
}
