package Singleton;

public class Singleton {


    public Singleton() {

        String a  = SingletonExample.getInstance().text;
        System.out.println(a);    //Age play konim on hello , im singleton ro type mikone.

        SingletonExample b = SingletonExample.getInstance();
        System.out.println(b.text);    //Age play konim hamon hello , im singleton ro type mikone.

        SingletonExample c = SingletonExample.getInstance();
        c.text = "This text is set from outside";
        System.out.println(c.text);  //Age play konim on This text is set from outside ro type mikone.


        //Mamoln az Singleton ha baraye yek shey estefade mikonn ke bekhan az 1 shey ye chizi ro 1 bar besazn va marouf hast be getinstance.
    }
}
