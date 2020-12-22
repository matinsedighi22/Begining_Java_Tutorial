package Lists;

import Clone.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Listiterator<S> {


    public Listiterator() {
        //Hala mirim to class student to clone va ye public misazim va tosh int age va string name ro tarif mikonim.
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Matin" , 20));
        studentList.add(new Student("Nima" , 19));

        ListIterator<Student> listiterator = studentList.listIterator();
        //Hala ye halghe misazim:
        while (listiterator.hasNext()) {       //Hasnext yani inke bere har khat code ro bekhone yeki be yeki rad kone.
            Student student = listiterator.next();
            //Hala mirim to Student to clone va alt+insert miznim va getter and insert name va age ro har 2 tasho misazim.
            System.out.println(student.getName());
        }

    }
}
