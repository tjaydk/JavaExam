package generics;

/**
 *
 * @author Dennis
 * @param <T>
 */
public class GenericClass<T, K, V> {
    T type;
    K key;
    V value;
    
    public GenericClass(T t){
        this.type = t;
    }
}
