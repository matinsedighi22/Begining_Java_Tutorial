package Singleton;

public class SingletonExample {

     private static SingletonExample instance ;

     public String text ;

     public SingletonExample() {
         text = "Hello,  im singleton";
     }

     public static SingletonExample getInstance() {
         if (instance == null)
             instance = new SingletonExample();
         return instance;
     }
}
