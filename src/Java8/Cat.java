package Java8;

public interface Cat {

    default void sound() {
        System.out.println("Meow Meow");
    }
}
