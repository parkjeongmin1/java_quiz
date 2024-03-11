package ch14.quiz4;

public class YoutubeThread extends MusicThread {
    @Override
    public void run() {
        for(int i=0;i<3;i++) {
            System.out.println("동영상을 재생합니다.");
            try {
                MusicThread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
