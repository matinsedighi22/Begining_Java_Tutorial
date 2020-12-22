package Lists;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {


    public LinkedList() {
        List<String> list = new ArrayList<>();
        list.add("Matin");
        list.add("Nima");

        for (String name: list)
            System.out.println(name);    //Age play konim hamon matin o nima type mishe.
        System.out.println("---------------------------");


        java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();
        linkedList.add("Matin");
        linkedList.add("Nima");


        for (String name: linkedList) {
            System.out.println(name);
        }
        }
    }

