package Interface;

public class Interface implements Downloadlistener {


    public Interface() {

        download();  //Hala age play ro bznim bade 3 saniye mige downloadfailed.


    }

    private void download() {
        Downloader downloader = new Downloader();
        downloader.Download(this);


    }

    @Override
    public void downloadcompleted(int filelenght, String filepath) {

        System.out.println("downloadcompleted");
        System.out.println("filelenght : " + filelenght);
        System.out.println("filepath : " + filepath);

    }

    @Override
    public void downloadfailed() {

        System.out.println("downloadfailed");

    }
}
