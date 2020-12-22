package Loops;

public class WhileLoop {


    public WhileLoop() {
        Boolean Condition = true;
        for (int i =0; i<5; i++) {
            System.out.println(i);
        }
        int counter = 0;
        while (Condition) {
            System.out.println("While is Ok: " + counter);
            counter++;

            if (counter>10) Condition=false;

            //Note:Hatmn baraye estefade az While bayad az break estefade konim chon bi nahayt hastesh kari ke while anajm mide.

            }

        }
    }

