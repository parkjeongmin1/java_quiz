package ch14.quiz4;

public class MusicThread extends Thread {
    @Override
    public void run() {
        for(int i=0;i<3;i++) {
            System.out.println("음악을 재생합니다.");
            try {
                MusicThread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
