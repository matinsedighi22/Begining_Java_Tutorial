package Java8;

public class Optional {


    public Optional() {
        java.util.Optional<Integer> a = java.util.Optional.of(10);
        java.util.Optional<Integer> b = java.util.Optional.empty();


        System.out.println(sum(a,b));   //Age play konim miyad 10 ro ba empty va ba interger avalue va bvalue jam mikone va meghdar mide.
    }

    private Integer sum(java.util.Optional<Integer> a , java.util.Optional<Integer> b) {

        Integer aValue = a.orElse(0);
        //Orelse yani age a vojod dash ke hichi age vojod nadasht by default 0 bezar.
        Integer bValue = b.orElse(0);
        return aValue + bValue;
    }
}
