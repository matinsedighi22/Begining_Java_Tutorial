package Clone;

public class Student implements Cloneable {


    int age;
    String name;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
