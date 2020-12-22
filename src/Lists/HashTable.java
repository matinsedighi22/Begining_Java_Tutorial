package Lists;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {


    public HashTable() {
        Hashtable <String , String> hashtable = new Hashtable<>();
        hashtable.put("Matin" , "Sedighi");
        hashtable.put("Nima" , "Haghdoust");


        for (Map.Entry entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());      //Age play konim mige Matin:sedighi va Nima:Haghdoust.

        }
    }
}
