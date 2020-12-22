package ConditionalStatements;

public class TernaryOperator {


    public TernaryOperator() {
        int a =10;
        int b =20;
        int c =0;

        if (a>10) {
            c = a;

        }
        else {
            c = b;
        }

        System.out.println(c);
        //Hala ye raveshi hast tahte onvane ternary operator ke kole in khat code ro to 1 khat migim o type mikonim ez :))

        int d =(a>10)?a:b;
        System.out.println(d);  //Play koinm 20 ro neshon mide

        //Dar in ravesh injorie ke age 1 bozorg tar az 10 bod a ro beriz to a dar gheyre in sorat(:) b ro breiz to a. alamat soal ham yani barresi condition dakhel parantez.

    }
}
