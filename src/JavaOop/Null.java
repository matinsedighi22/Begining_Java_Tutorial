package JavaOop;

import Classes.Lion;

public class Null {
    //NullPointerException ---> Ye errore marof toye java hastesh ke barname haye ziyadi ro monfajer karde.:))


    public Null() {
        Lion lion = new Lion();
        Whereismylion(lion);
        //Age mn benevism Lion lion = new null(); ---> erroe mide ke nmishe chon null yani inke ma be tabe hich chizi nadadim va in yani paradox.
        //Chon mabayad tabe ke minevisim kamel moshakhas bashe ke meghdaresh chiye.

    }

    private void Whereismylion(Lion lion) {
        lion.sound();
    }
}
