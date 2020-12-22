package ConditionalStatements;

import Enums.Colors;

public class SwitchBreak {


    public SwitchBreak() {
        Colors color = Colors.BLACK;


        switch (color) {
            case BLUE:  System.out.println(Colors.BLUE);  break;
            case BLACK: System.out.println(Colors.BLACK); break;
            case RED:   System.out.println(Colors.RED);   break;
            case WHITE: System.out.println(Colors.WHITE); break;

                //Zamani ke play ro miznim miyad mige ke agha az aval shoro konm.
                //Yani miyad mige ke range mn black hastesh pas blue ghabol nist va az black be samte payin hame ghaboln.
                //Note:Hala age bkhaym ke faghat yekisho type kone chikar mikonim?
                //Miyaym ro hame case ha akharesh ye break; miznim va vaghti play konim dige hamon rangi ke ma az aval tarif kardim ro baramon type mikone va khabari az baghye nist.

                //Hala ye halate jadid:
                //Farz konid ma ye case ro tarif kardim va migim typesh kone vali chon vojod nadare chizi type nmishe.
                //Dar vaghe baraye inkar ma migim default badesh sout miznim va be onvan default tarif mishe kare ma.
                //Note: Default hamishe akharin case hastesh.

        }
    }
}
