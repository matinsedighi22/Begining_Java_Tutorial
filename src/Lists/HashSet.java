package Lists;

public class HashSet {


    public HashSet() {
        java.util.HashMap<Integer , String> hashMap1 = new java.util.HashMap<>();
        hashMap1.put(1 , "Sedighi");
        hashMap1.put(2 , "Haghdoust");

        System.out.println(hashMap1);    //Age play konim mige 1=sedighi va 2=haghdoust.

        //Ama Hashset meghdari motefavete va Dige on Halate Key,Value Nist:

        java.util.HashSet<String> hashSet = new java.util.HashSet<>();
        hashSet.add("Matin");
        hashSet.add("Nima");
        hashSet.add("Nima");

        //Age bekhaym masalan hame item haye hashset ro bekhonim barash for tarif mikonim:
        for (String name: hashSet) {
            System.out.println(name);

            //Pas Farghe Hashset ine ke meghdare tekrari(Duplicate) Ghabol nmikone.
        }
    }
}
