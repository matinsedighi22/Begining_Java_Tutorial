package Java8;

import Interface.Downloadlistener;

public class Lambda {


    public Lambda() {
        Downloadlistener downloadlistener = new Downloadlistener() {
            @Override
            public void downloadcompleted(int filelenght, String filepath) {
                System.out.println(filepath);

            }

            @Override
            public void downloadfailed() {

            }
        };
        downloadlistener.downloadcompleted(1 , "Path");
    }
}
