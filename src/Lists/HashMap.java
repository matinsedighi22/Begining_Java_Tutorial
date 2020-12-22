package Lists;

import java.util.ArrayList;
import java.util.List;

public class HashMap {


    public HashMap() {
        List<String> list = new ArrayList<>();
        list.add("Matin");
        list.add("Nima");
        //Age bekhaym matin ya nima ro type konim migoftim:
        list.get(0);

        //Hala hashmap injorie:

        java.util.HashMap<String, String> hashMap = new java.util.HashMap<String, String>();
        hashMap.put("Matin" , "Sedighi");
        hashMap.put("Nima" , "Haghdoust");

        System.out.println(hashMap.get("Matin"));    //Age play konim sedighi ro type mikone.

        //Hala ye noe dige hashmap:
        java.util.HashMap<Integer , String> hashMap1 = new java.util.HashMap<>();
        hashMap1.put(1 , "Sedighi");
        hashMap1.put(2 , "Haghdoust");

        System.out.println(hashMap1.get(2));       //Age play konim haghdoust ro type mikone.

        //Dar vaghe hashmap ma aval behesh ye kelid midim badesh kelide dovom ro age chizi bexarim on kelide 1 ro ke dadim az tarigh on kelide 2 ro type mikone baramon.
        //HashMap=Key,Value
    }
}
