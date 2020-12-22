package JavaOop;

import Classes.Lion;

public class Super {


    public Super() {

        Lion lion = new Lion();
        lion.sound();

        //Dar vaghe ba super mitonim be khososiyate classe parent dastresi dashte bashim.
        //Yani inke masalan alan parente lion mishe dog va mitonim be har kodom az khososiyate on class dastresi dashte bashim.
        //Nahve kar ba Super:
        //1:Mirim to calsse masalan lion.etc
        //2:Zire sout override migim ke masalan sound dog ro be ma bede ---> super.sound();
        //3:Alan miyaym to classe super ---> ye tabe tarif mikonim ---> masalan Lion lion = new lion(); ---> va ziresh ham masalan lion.sound.
        //4:Alan age play ro bznim alave bar sedaye lion ke override shode sedaye dog ro ham ke parent hastesh ro ejra mikone.
    }
}
