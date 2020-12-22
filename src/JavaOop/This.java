package JavaOop;

import Classes.Lion;

public class This {


    public This() {
        Lion lion = new Lion();
        lion.sound();

        this.print();
    }

    public void print() {
        System.out.println("Print");
    }
}
