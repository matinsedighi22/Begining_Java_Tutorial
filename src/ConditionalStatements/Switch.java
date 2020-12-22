package ConditionalStatements;

public class Switch {


    public Switch() {
        int a = 4;

        if (a == 5) {

        }
        else if (a ==6) {

        }
        else if (a ==7) {

        }
        else if (a ==8) {

        }

        //nahve kar ba switch injorie:
        //Switch (casi ke mikhaym rosh kar konim) {space
        //Badesh neveshtn case n :

        switch (a) {
            case 1: System.out.println(1);
            case 2: System.out.println(2);
            case 3: System.out.println(3);
            case 4: System.out.println(4);
            case 5:
            case 6:
            case 7:
            case 8:
                System.out.println("5 + 6 + 7");

        }
        //Mamoln az switch baraye barresi enum estefade mishe.
    }
}
