package SimpleProject;

import java.util.Scanner;

public class SimpleProject {

    int a = 0;
    int b ;
    String operator;
    Scanner scanner ;
    public  SimpleProject() {
        System.out.println(" Welcome to my Great Calculator ");
        this.scanner = new Scanner(System.in);
        start();
    }

    private void start() {
        System.out.println(" Please enter the first number ");
        a = Integer.parseInt(scanner.nextLine());

        System.out.println(" Please enter the operator ");
        operator = scanner.nextLine() ;

        System.out.println(" Please enter the second number ");
        b = Integer.parseInt(scanner.nextLine());

        Calculator calculator = new Calculator();
        int response ;



        switch (operator) {
            case "+" : {
                response = calculator.sum(a , b);
                break;
            }
            case "-" : {
                response = calculator.minus(a , b);
                break;

            }
            case "*" : {
                response = calculator.mult(a , b);
                break;
            }
            case "/" : {
                response = calculator.div(a , b);
                break;

                //Badesh bad az { dovomi sout mizanim va dakhelesh repsonse type mikonim va ye errori be ma mide.
                //error ro import mikonim va badesh on khate toolani ro pak mikoinm va be jash response = -1; ro type mikonim.
                //Hala run mikonim.

                //Nokte: In response = -1; Manish chiye? in be in mani hast ke age be joz operator hayi ke tarif kardim ye chize diga ro be kar bebarim va bi mani bashe on be ma -1 mide dar har sorat.

            }
            default:
                response = -1;
        }

        System.out.println(response);



    }
}
