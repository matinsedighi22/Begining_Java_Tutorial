package JavaOop;

public class InterFace {


    public InterFace() {


    }


    public interface Downloadlistener {
        public void downloadcompleted(int Filepatch , String Filepath);
        public void downloadfailed();
    }
}
