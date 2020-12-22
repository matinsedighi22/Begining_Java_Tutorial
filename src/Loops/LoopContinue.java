package Loops;

public class LoopContinue {


    public LoopContinue() {
        for (int i =0; i<20; i++) {
            if (i>5 && i<10) {
                continue;   //Vaghti play bznim 6 o 8 hazf mishe.

                //Note:Farghe continue ba break ine ke continue addad haye on bazaro hazf mikone dar hali ke break az onjayi ke besh goftim dige koln az aval hazf mikone.
            }
            if (i%2==0) {
                System.out.println(i);

            }
        }
    }
}
