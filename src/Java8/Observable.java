package Java8;

import java.util.Observer;

public class Observable {


    public Observable() {
    }


    class MyObserver implements Observer {
        @Override
        public void update(java.util.Observable o, Object arg) {

        }
    }

    class MyObservable extends Observable {
        int a = 0;

        public void changeA() {
            a++;

        }

    }
}
