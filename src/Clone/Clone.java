package Clone;

public class Clone {


    public Clone() {

        Student student1 = new Student("Matin" , 20);
        student1.name = "Matin";

        System.out.println("student1: " + student1.name);     //Age play konim  student1: Matin ro type mikone.
        Student student2 = null;
        try {
            student2 = (Student) student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //Hala ye kare dige mikonim
        student2.name = "Haj Nima";
        //Alan age play ro bznim mige student1: Matin student 2: Haj nima student1: Haj nima
        //Dar hali ke bayad student 1 matin mizasht chera in etefagh oftad? Chon reference copy khorde.
        //Ravesh Hal:
        //1:Mirim to class student type mikoinm ---> public class student implements  cloneable() {space.
        //2:To khate joda type ---> @override ---> khate ziresh ham protected Object clone() throws CloneNotSupportedException {space ___> return super.clone();
        //3:On khat codi ke neveshtim ---> Student student2 = student1: Tabdil mikonim be ---> Student student2 = (Student) student1.clone();
        //4:Try catch ro clone miznim error raf she.
        //5:Hala age play konim mige student1: matin student2: haj nima student 1:matin va dorost mishe :).
        System.out.println("student2: " + student2.name);
        System.out.println("student1: " + student1.name);     //Age play konim  student2: Matin ro type mikone.
    }
}
