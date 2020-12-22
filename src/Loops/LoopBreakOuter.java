package Loops;

public class LoopBreakOuter {


    public LoopBreakOuter() {
        outerLoop:
        for (int i =0; i<5; i++) {
            for (int j=0; j<3; j++) {
                System.out.println(i + ": " + j );
                if (j==1) break outerLoop;
            }
        }
    }
}
