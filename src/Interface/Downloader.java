package Interface;

public class Downloader {


    public void Download(Downloadlistener downloadlistener) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    downloadlistener.downloadcompleted(10 , "/home/Matin/file.txt");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

    }


}
