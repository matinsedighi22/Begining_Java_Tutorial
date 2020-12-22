package Interface;

public interface Downloadlistener {

    public void downloadcompleted(int filelenght , String filepath);
    public void downloadfailed();
}
