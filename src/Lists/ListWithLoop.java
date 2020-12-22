package Lists;

import java.util.ArrayList;
import java.util.List;

public class ListWithLoop {


    public ListWithLoop() {
        List<String> list = new ArrayList<>();
        list.add("Matin");
        list.add("Nima");

        for (String item: list) {
            System.out.println(item);    //Age play konim matin va nima type mishe.
        }

    }
}
