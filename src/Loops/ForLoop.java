package Loops;

public class ForLoop {


    public ForLoop() {
        int [] array = {100, 5, 27, 50, 1, 12};
        System.out.println("0: " + array[0]);
        System.out.println("1: " + array[1]);
        System.out.println("2: " + array[2]);
        System.out.println("3: " + array[3]);
        System.out.println("4: " + array[4]);
        System.out.println("5: " + array[5]);

        System.out.println("-------------------------");


        int [] yourarray = {100, 5, 27, 50, 1, 12};
        for (int i = 0; i<yourarray.length; i++) {
            System.out.println(i+": " + array[i]);

            //Note:Age for(;;) {space badesh ham sout harchi bznim va play konim bi nahayt bar on sout bara ma type mishe.
            //Note:Baraye bar ax kardn for ham ino type mikonim:
            //1:for (int i = 0; i<yourarray.length; i++) { ro tabdil mikonim be :
            //2:for (int i = yourarray.lenght-1 ; i>=0 ; i--) {



            //Dar Halate koli az for baraye kahesh khat haye code nevisi estefade mishe va ertebate khasi ba array ha mitone dashte bashe.

        }
    }
}
