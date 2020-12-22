package SimpleProject;

import java.util.Scanner;

public class ScannerTest {




    public  ScannerTest() {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
       String name = scanner.nextLine();
        System.out.println("Welcome " + name + ", enter your age please");
        int age = 0 ;
        try {
            age  = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        System.out.println("you are " + age + " years old");


    }
}
