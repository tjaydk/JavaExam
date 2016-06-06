package lambda;

@FunctionalInterface
public interface MyFunctionalInterface<T> {
    void printName(T t); //Implicitly abstract method
}
