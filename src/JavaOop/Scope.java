package JavaOop;

public class Scope {
   int a = 0;
   short b = 2;
   String name = "Matin";

    public Scope() {
        a = b;
        int c = 10;


    }

    public void LocalScope() {
        a = b;
        //int c = this.a;
        //c = b;    //Javabe in tabe mibinim ke ghermez shod chon tabe c dar public scope ghara dare vali b dar tabe public class tarif shode.

    }

    public void anotherLocalScope() {
        a = b;
        int c = this.b;

    }
}
