package Java8;

public interface Dog {

    default void sound() {
        System.out.println("Waq Waq");
    }
}
