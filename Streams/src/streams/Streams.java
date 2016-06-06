package streams;

import java.util.ArrayList;
import java.util.Collection;

public class Streams {

    public static void main(String[] args) {
        Collection<String> names = new ArrayList();
        
        names.add("Hans");
        names.add("Helle");
        names.add("Jens");
        
        long count = names.stream().count();
        System.out.println("The number of names in array is: " + count);
        
        long countFiltered = names.stream().filter(name -> name.length() > 4).count();
        System.out.println("The number of names with more than 4 letters are: " + countFiltered);
    }
    
}
