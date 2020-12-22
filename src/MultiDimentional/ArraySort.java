package MultiDimentional;

import java.util.Arrays;

public class ArraySort {


    public ArraySort() {
        int [] array = {100, 5, 27, 50, 1, 12};

        printArray(array);
        System.out.println("--------------------------------");
        Arrays.sort(array);
        printArray(array);
        //Hala age play konim be tartibe soodi tartib mikone.

        //Note:Mitonim be ja sooodi bar ax ham amal konim be in sorat:
        //1:Aval on int [] avali ro injori mikoinm: Integer []
        //2:Arrays.sort(array) ro tabdil mikonim be Arrays.sort(array , collections.reverseOrder());
        //Be in sorat ham bar ax mishe.

        //System.out.println("0: " + array[0]);
        //System.out.println("1: " + array[1]);
        //System.out.println("2: " + array[2]);
        //System.out.println("3: " + array[3]);
        //System.out.println("4: " + array[4]);
        //System.out.println("5: " + array[5]);

        //Age play konim hame maghadir ro jolosh bara ma type mikone khone be khone.
    }

    private void printArray(int [] array) {
        System.out.println("0: " + array[0]);
        System.out.println("1: " + array[1]);
        System.out.println("2: " + array[2]);
        System.out.println("3: " + array[3]);
        System.out.println("4: " + array[4]);
        System.out.println("5: " + array[5]);

    }
}
