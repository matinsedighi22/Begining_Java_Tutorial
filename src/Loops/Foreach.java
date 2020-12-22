package Loops;

public class Foreach {


    public Foreach() {
        int [] array = {2,6,8,10,14};

        for (int i=0; i<array.length ; i++) {
            System.out.println(array[i]);

            System.out.println("-----------------------");

            for (int item: array) {
                System.out.println(item);    //Age play konim javabe har 2 ta for yekie

                //Dar vaghe in noe digari az neveshtn for hastesh.

            }
        }
    }
}
