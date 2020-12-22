package Java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {


    public MethodReference() {
        List<String> list = new ArrayList<>();
        list.add("Parameter: 1");
        list.add("Parameter: 2");
        list.add("Parameter: 3");
        list.add("Parameter: 4");
        list.add("Parameter: 5");
        list.add("Parameter: 6");

        //Age mikhastim typesh konim migoftim:
        for (String Parameter: list) {
            System.out.println(Parameter);

            System.out.println("----------------------");

            //Vali hala raveshi ko to Java8 Vojod dare bara type kardanesh intorie:
            list.forEach(System.out::println);
        }
    }
}
