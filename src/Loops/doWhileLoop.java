package Loops;

public class doWhileLoop {


    public doWhileLoop() {
        int Counter = 0;


        while (Counter<10) {
            System.out.println(Counter++);

        }

        do {
            System.out.println(Counter++);

        }
        while (Counter<10);


    }
}
